package SortingAlgs;

/**
 * Created by Vegar on 17.09.15.
 */


import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;


import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class QuickSort {
    private QuickSort() {
    }

    public static void sort(Comparable[] var0) {
        //StdRandom.shuffle(var0);
        sort(var0, 0, var0.length - 1);

        assert isSorted(var0);

    }

    private static void sort(Comparable[] var0, int lo, int hi) {
        if(hi > lo) {
            int var3 = partition(var0, lo, hi);
            sort(var0, lo, var3 - 1);
            sort(var0, var3 + 1, hi);

            assert isSorted(var0, lo, hi);

        }
    }

    private static int partition(Comparable[] var0, int var1, int var2) {
        int var3 = var1;
        int var4 = var2 + 1;
        Comparable var5 = var0[var1];

        while(true) {
            do {
                ++var3;
            } while(less(var0[var3], var5) && var3 != var2);

            do {
                --var4;
            } while(less(var5, var0[var4]) && var4 != var1);

            if(var3 >= var4) {
                exch(var0, var1, var4);
                return var4;
            }

            exch(var0, var3, var4);
        }
    }

    public static Comparable select(Comparable[] var0, int var1) {
        if(var1 >= 0 && var1 < var0.length) {
            StdRandom.shuffle(var0);
            int var2 = 0;
            int var3 = var0.length - 1;

            while(var3 > var2) {
                int var4 = partition(var0, var2, var3);
                if(var4 > var1) {
                    var3 = var4 - 1;
                } else {
                    if(var4 >= var1) {
                        return var0[var4];
                    }

                    var2 = var4 + 1;
                }
            }

            return var0[var2];
        } else {
            throw new IndexOutOfBoundsException("Selected element out of bounds");
        }
    }

    private static boolean less(Comparable var0, Comparable var1) {
        return var0.compareTo(var1) < 0;
    }

    private static void exch(Object[] var0, int var1, int var2) {
        Object var3 = var0[var1];
        var0[var1] = var0[var2];
        var0[var2] = var3;
    }

    private static boolean isSorted(Comparable[] var0) {
        return isSorted(var0, 0, var0.length - 1);
    }

    private static boolean isSorted(Comparable[] var0, int var1, int var2) {
        for(int var3 = var1 + 1; var3 <= var2; ++var3) {
            if(less(var0[var3], var0[var3 - 1])) {
                return false;
            }
        }

        return true;
    }

    private static void show(Comparable[] var0) {
        for(int var1 = 0; var1 < var0.length; ++var1) {
            StdOut.println(var0[var1]);
        }

    }

    public static void main(String[] var0) {
        String[] var1 = StdIn.readAllStrings();
        sort(var1);
        show(var1);
        StdRandom.shuffle(var1);
        StdOut.println();

        for(int var2 = 0; var2 < var1.length; ++var2) {
            String var3 = (String)select(var1, var2);
            StdOut.println(var3);
        }

    }
}
