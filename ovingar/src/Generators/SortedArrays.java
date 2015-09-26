package Generators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * Created by Vegar on 16.09.15.
 */
public class SortedArrays {
    Integer[] intArray;
    ArrayList <Integer>arrayList;
    Random r;

    public Integer[] getSortedArray(Integer length){
        intArray = new Integer[length];
        for(Integer i = 0 ; i < length; i++){
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

    public Comparable[] getComparableArray(int length){
        Comparable[] array = new Comparable[length];
        for(int i = 0; i < length; i++){
            array[i] = r.nextInt();
        }
        Arrays.sort(array);
        return array;
    }
}
