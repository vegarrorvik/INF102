package Generators;

import java.util.ArrayList;

/**
 * Created by Vegar on 16.09.15.
 */
public class SortedArrays {
    Integer[] intArray;
    ArrayList <Integer>arrayList;

    public Integer[] getSortedArray(int length){
        intArray = new Integer[length];
        for(int i = 0 ; i < length; i++){
            intArray[i] = i;
        }
        return intArray;
    }

    public ArrayList getSortedArrayList(Integer length){
        arrayList = new ArrayList<>();
        for(int i = 0 ; i < length; i++){
            arrayList.add(i,i);
        }
        return arrayList;
    }
}
