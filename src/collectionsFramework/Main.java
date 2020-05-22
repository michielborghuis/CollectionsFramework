package collectionsFramework;

import java.util.Arrays;
import java.util.Random;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args){
        Random rand = new Random();

        //Arraylist met meerdere woorden
        ArrayList<String> words = new ArrayList<>(Arrays.asList("deze", "woorden", "zijn", "zonder", "twijfel", "allemaal", "willekeurig", "gekozen"));
        BubbleSort w = new BubbleSort(words);
        System.out.println(w.bubbleSortChar());


        //Arraylist met integers
        ArrayList<Integer> getallen = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            int getal = rand.nextInt(10)+1;
            getallen.add(i, getal);
        }
        BubbleSortOne sort = new BubbleSortOne(getallen);
        System.out.println(sort.bubbleSortAll());


        //String[] met letters
        RandomLetterCreator r = new RandomLetterCreator(10, "abcdefghijklmnopqrstuvwxyz");
        String[] letters = r.createArray();
        System.out.println(Arrays.toString(letters));
        AlphSort a = new AlphSort(letters);
        System.out.println(Arrays.toString(a.bubbleSortChar()));
    }
}