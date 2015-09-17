package CompulsoryAssignment1;

import Generators.SortedArrays;
import edu.princeton.cs.algs4.*;

/**
 * Created by Vegar on 16.09.15.
 */
public class QuadraticQuickSort {
    public static void main(String[]args){
        SortedArrays sa = new SortedArrays();
        Stopwatch stopwatch = new Stopwatch();

        Integer[] array = sa.getSortedArray((int)10E8);
        Quick.sort(array);



        System.out.println(stopwatch.elapsedTime());

    }



}
