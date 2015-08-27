package ovingar;

import java.util.Random;
import java.util.Stack;


/**
 * 
 * @author Vegar
 *	Oppgave 1.3.12
 *	Copy a stack
 */
public class Copy {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		Stack<Integer> newStack = new Stack<>();
		Random r = new Random();

		for (int i = 0; i < 100; i++) {
			stack.push(r.nextInt(100));
		}
		newStack = copy(stack);

		for (int i = 0; i < stack.size(); i++) {
			System.out.println("Old stack: " + stack.elementAt(i) +"\t"
					+ " New stack: " + newStack.elementAt(i));
			;
		}

	}

	public static Stack copy(Stack<Integer> s) {
		Stack<Integer> copyStack = new Stack<>();
		for (int i : s) {
			copyStack.push(i);
		}
		return copyStack;

	}
}
