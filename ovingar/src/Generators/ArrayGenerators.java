package Generators;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Vegar on 01.09.15.
 */
public class ArrayGenerators {
    private static Random r = new Random();
    ArrayList list = new ArrayList();

    /**
     * @param maxInt up to, not including this integer, of random integeres
     * @param range how long the array is
     * @return a sorted array of integers.
     */
    public static ArrayList randomIntArray(int maxInt, int range){
        ArrayList intList = new ArrayList();
        for(int i = 0; i<range; i++){
            intList.add(r.nextInt(maxInt));
        }
            intList.sort(null);
        return intList;
    }
}
