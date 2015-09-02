package ovingar;

import Generators.ArrayGenerators;

import java.util.ArrayList;

/**
 * Created by Vegar on 01.09.15.
 *  Write a program that, given two sorted arrays of N int values, prints all elements
 *  that appear in both arrays, in sorted order. The running time of your program should be
 *  proportional to N in the worst case.
 */
public class PrintArraysPropN {
    public static void main(String[]args){
        ArrayList<Integer> a1 = ArrayGenerators.randomIntArray(25, 25);
        ArrayList<Integer> a2 = ArrayGenerators.randomIntArray(25, 25);
        int i = 0;
        int j = 0;
        int lastPrinted = -1;

        while(i < a1.size() && j < a2.size()){

            if(a1.get(i) == a2.get(j) && (a1.get(i) != lastPrinted)) {
                System.out.println(a1.get(i));
                lastPrinted = a1.get(i);
                i++;
                j++;


            }
            else if(a1.get(i)<a2.get(j))
                i++;

            else if(a1.get(i)>a2.get(j))
                j++;
        }

    }
}
