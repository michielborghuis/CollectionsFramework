package collectionsFramework;
import java.lang.*;

public class alphSort {
    private String[] str;
    private String temp;

    public alphSort(String[] str) {
        this.str = str;
    }

    public String[] bubbleSortChar(){
        for (int i = 0; i < str.length; i++){
            for (int j = i + 1; j < str.length; j++){
                //vergelijk 2 characters die naast elkaar staan
                if (str[j].compareTo(str[i]) < 0){
                    temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
        return str;
    }
}
