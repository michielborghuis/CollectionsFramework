package collectionsFramework;

import java.util.Arrays;
import java.util.Random;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args){

        ArrayList<String> words = new ArrayList<>(Arrays.asList("deze", "woorden", "zijn", "zonder", "twijfel", "allemaal", "willekeurig", "gekozen"));
        BubbleSort s = new BubbleSort(words);
        System.out.println(s.bubbleSortChar());


        RandomLetterCreator r = new RandomLetterCreator(10, "abcdefghijklmnopqrstuvwxyz");
        String[] letters = r.createArray();
        System.out.println(Arrays.toString(letters));
        AlphSort a = new AlphSort(letters);
        System.out.println(Arrays.toString(a.bubbleSortChar()));


        Random rand = new Random();
        ArrayList<Integer> getallen = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            int getal = rand.nextInt(10)+1;
            getallen.add(i, getal);
        }
        BubbleSortOne sort = new BubbleSortOne(getallen);
        System.out.println(sort.bubbleSortAll());
    }
}