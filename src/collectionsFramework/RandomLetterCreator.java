package collectionsFramework;

import java.util.Random;

public class RandomLetterCreator {
    private String alphabet;
    private StringBuilder b = new StringBuilder();
    private int len;

    public RandomLetterCreator(int len, String alphabet) {
        this.len = len;
        this.alphabet = alphabet;
    }

    public String[] createArray(){
        for (int i = 0; i < len; i++){
            int randI = new Random().nextInt(alphabet.length());
            char randChar = alphabet.charAt(randI);
            b.append(randChar);
        }
        return b.toString().split("(?<!^)");
    }

}
