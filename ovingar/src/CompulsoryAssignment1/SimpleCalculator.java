package CompulsoryAssignment1;

import java.util.Stack;

/**
 * Created by Vegar on 16.09.15.
 *Parse gjennom koden, viss det e integers, push dei til stack. E det operator, pluss sammen dei to øverste,
 * pop dei, og legg til det nye resultatet, og continue.
 */
public class SimpleCalculator {
    public static void main(String[]args){
        Stack<Integer> stack = new Stack<>();
        String[] array = "2 3 + 4 * 3 2 + 1 2 + * + ".split(" ");

        for(String s : array){
            if(s.equals("+")) {
                stack.add(stack.pop() + stack.pop());
            } else if(s.equals("*")){
                stack.add(stack.pop() * stack.pop());

            }else {
                stack.add(Integer.parseInt(s));
            }
        }
        System.out.println(stack.peek());
    }
}
