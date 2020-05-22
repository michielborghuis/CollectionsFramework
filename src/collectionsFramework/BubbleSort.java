package collectionsFramework;

import java.util.ArrayList;
import java.util.Collections;

public class BubbleSort {
    private ArrayList<String> str;

    public BubbleSort(ArrayList<String> str) {
        this.str = str;
    }

    public ArrayList<String> bubbleSortChar(){
        for (int i = 0; i < str.size(); i++){
            for (int j = i + 1; j < str.size(); j++){
                //vergelijk 2 characters die naast elkaar staan
                if (str.get(j).compareTo(str.get(i)) < 0){
                    Collections.swap(str, i, j);
                }
            }
        }
        return str;
    }
}
