package ovingar;

import java.util.Stack;

/**
 * 
 * @author Vegar
 * 			25th of August, 2015
 * 			Main class and a method that checks if given string is correct
 *         in parenthesis formation.
 *         
 *         Oppgave 1.3.4
 */

public class Parentheses {

	public static void main(String[] args) {

		String string1 = "[()]{}{[()()]()}";
		String string2 = "[(])";

		checkParentheses(string1);

	}

	public static boolean checkParentheses(String str) {
		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '(' || str.charAt(i) == '{'
					|| str.charAt(i) == '[')
				stack.push(str.charAt(i));
			else if (str.charAt(i) == ')') {
				if (stack.peek() == '(')
					stack.pop();
				else{
					System.out.println(false);
				return false;}
			} else if (str.charAt(i) == '}') {
				if (stack.peek() == '{')
					stack.pop();
				else{
					System.out.println(false);
				return false;}
			} else if (str.charAt(i) == ']') {
				if (stack.peek() == '[')
					stack.pop();
				else{
					System.out.println(false);
				return false;}
			}
		}
		System.out.println(stack.isEmpty());
		return stack.isEmpty();
	}

}
