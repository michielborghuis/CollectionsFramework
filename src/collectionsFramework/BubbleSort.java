package collectionsFramework;

import java.util.ArrayList;
import java.util.Collections;

public class BubbleSort {
    private ArrayList<String> lst;

    public BubbleSort(ArrayList<String> lst){
        this.lst = lst;
    }

    public ArrayList<String> bubbleSortChar(){
        for (int i = 0; i < lst.size(); i++){
            for (int j = i + 1; j < lst.size(); j++){
                //vergelijk 2 characters die naast elkaar staan
                if (lst.get(j).compareTo(lst.get(i)) < 0){
                    Collections.swap(lst, i, j);
                }
            }
        }
        return lst;
    }
}
