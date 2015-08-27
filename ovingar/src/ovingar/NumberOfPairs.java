package ovingar;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Random;
import java.util.Stack;


/**
 * 
 * @author Vegar
 * Oppgave 1.4.8
 */

public class NumberOfPairs {

	public static void main(String[] args) throws IOException {
		ArrayList<Integer> numbers = new ArrayList<>();
		Random r = new Random();
		BufferedReader br = new BufferedReader(new FileReader(new File("src/ovingar/files/paircountdata.txt")));
		
		String [] numbers213 = br.readLine().split(" ");
		
		for(String s : numbers213)
			numbers.add(Integer.parseInt(s));
			
		//for (int i = 0; i < 10; i++) {
			//numbers.add(r.nextInt(5));
		//}
		
		numberOfPairs(numbers);
	}
	public static int numberOfPairs(ArrayList<Integer> a){	
		int pairs = 0;
		int equals = 0;
		long before = System.currentTimeMillis();
		long after;
		a.sort(null);
		
		for(int i = 0; i <a.size()-1;i++){
			//System.out.println(a.get(i));
			if(a.get(i) == a.get(i+1)){
				if(equals == 0)
					equals+=2;
				else
					equals++;
			}else{
				pairs += ((equals)*(equals-1))/2;
				//System.out.println("Numbers of equals are: " + equals);
				equals = 0;
			}
		} pairs += ((equals)*(equals-1))/2;
		
		
		System.out.println("Number of pairs are " + pairs);
		after = System.currentTimeMillis();
		System.out.println("Time used: " + (after-before));
		return pairs;
		
	}

}
