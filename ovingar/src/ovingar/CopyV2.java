package ovingar;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class CopyV2 {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		
		
		String string1 = "hei";
		String string2 = "på";
		String string3 = "deg";
		
		stack.push(string1);
		stack.push(string2);
		stack.push(string3);
		
	}
	
	public static Stack copyStack(Stack<String> s){
		Stack copy = new Stack();
		Iterator itr = s.iterator();
		
		while(itr.hasNext()){
		}
		return copy;
		
	}

}
