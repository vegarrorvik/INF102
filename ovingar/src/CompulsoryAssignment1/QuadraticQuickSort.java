package CompulsoryAssignment1;

import Generators.SortedArrays;
import SortingAlgs.EditedQuick;
import SortingAlgs.EditedQuick;
import edu.princeton.cs.algs4.*;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Vegar on 16.09.15.
 * Testing quadratic quicksort runtime by removing the shuffle part of the algorithm,
 * and running it on a sorted array.
 */
public class QuadraticQuickSort {
    public static void main(String[] args) {
        Comparable[] array = new Comparable[100000];
        Random r = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(10000);
        }
        Arrays.sort(array);


        Stopwatch stopwatch = new Stopwatch();
        EditedQuick.sort(array);

        System.out.println(stopwatch.elapsedTime());

    }
}



