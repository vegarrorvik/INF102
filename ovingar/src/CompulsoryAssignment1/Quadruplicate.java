package CompulsoryAssignment1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import SortingAlgs.TopDownMergeSort;
import edu.princeton.cs.algs4.BinarySearch;
import edu.princeton.cs.algs4.BinarySearchST;

/**
 * Created by Vegar on 15.09.15.
 * Takes for lists of names, sorts them using mergesort (could've used Javas sort algorithm, because it would use
 * mergesort, but to control it 100% I chose to specifically use mergesort). This way it will not go over
 * linearithmic runtime. Then it searches through the array using binarysearch, which would hold the search time
 * logarithmic. All in all - O(n) = N log N.
 */
public class Quadruplicate {
    public static void main(String[] args) throws IOException {
        String [] listA;
        String [] listB;
        String [] listC;
        String [] listD;

        listA = readAndSortFile("ovingar/src/CompulsoryAssignment1/data/namesA.txt");
        listB = readAndSortFile("ovingar/src/CompulsoryAssignment1/data/namesB.txt");
        listC = readAndSortFile("ovingar/src/CompulsoryAssignment1/data/namesA.txt");
        listD = readAndSortFile("ovingar/src/CompulsoryAssignment1/data/namesD.txt");

        BinarySearchST<String,String> bs = new BinarySearchST<>();

        ArrayBinarySearch(listA,listB, listC, listD);

    }

    public static boolean StringBinarySearch (String s, String[]list){
        int hi = list.length-1;
        int lo = 0;

        while(lo<=hi) {
            int mid = lo + (hi - lo) / 2;
            if(s.compareTo(list[mid]) < 0)
                hi = mid-1;
            else if(s.compareTo(list[mid])>0)
                lo = mid+1;
            else return true;
        }
        return false;
    }

    public static boolean ArrayBinarySearch (String[]a1, String []a2, String[]a3,String[]a4){
        for(String s: a1){
            if(StringBinarySearch(s,a2) && StringBinarySearch(s,a3) && StringBinarySearch(s,a4)) {
                System.out.println(s);
                return true;
            }
            else
                continue;
        }

        return false;
    }


    public static String[] readAndSortFile(String filePath) throws IOException {

        ArrayList<String> firstArray = new ArrayList<>();

        BufferedReader br = new BufferedReader(new FileReader(new File(filePath)));

        String str = "";

        while ((str = br.readLine()) != null) {
            firstArray.add(str);
        }
        String[]array = new String[firstArray.size()];
        int counter = 0;
        for(String s : firstArray){
            array[counter++] = s;
        }
        TopDownMergeSort.sort(array);
        return array;

    }
}
