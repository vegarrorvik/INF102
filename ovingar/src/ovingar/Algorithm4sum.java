package ovingar;

import java.util.Arrays;

/**
 * Created by Vegar on 01.09.15.
 *  Develop an algorithmfor the 4-sum problem
 *  Find sum of triples and look for the invert sum, so that sum is zero
 *
 */
public class Algorithm4sum {

    public static void main(String[]args){
        Foursum(ia);
        System.out.println(counter);
    }
    private static int[] ia = {1,3,2,-6,10,3,-7};
    static int counter = 0;

    public static int Foursum(int [] a){
        Arrays.sort(a);
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                for(int k=j+1;k<a.length;k++){
                   /* int iindeks = i;
                    int jindeks = j;
                    int kindeks = k;

                    int tripleSum = a[i] + a[j] + a[k];*/

                    for(int l=k+1;l<a.length;l++){
                        //if(tripleSum+a[l]==0 && (l != iindeks || l != kindeks || l !=jindeks))
                        if(a[i] + a[j] + a[k] + a[l] == 0)
                            counter++;
                    }
                }
            }
        }

        return counter;
    }
}
