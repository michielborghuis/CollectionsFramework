package collectionsFramework;

import java.util.ArrayList;
import java.util.Collections;

public class BubbleSortOne {
    private boolean completelySorted;
    private ArrayList<Integer> lst;

    public BubbleSortOne(ArrayList<Integer> lst) {
        this.lst = lst;
    }

    public void swap(){
        completelySorted = true;
        for(int i = 0; i < lst.size() -1; i++){
            if (lst.get(i) > lst.get(i+1)){
                Collections.swap(lst, i, i+1);
                completelySorted = false;
            }
        }
    }
    public ArrayList<Integer> bubbleSortAll(){
        for(int i = 0; i< lst.size(); i++){
            System.out.println(lst);
            swap();
            if(completelySorted){
                return lst;
            }
        }
        return lst;
    }
}
