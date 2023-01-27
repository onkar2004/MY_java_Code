import java.util.*;

public class stack1 {
    public static void main(String[] args){

        Stack<Integer> stk1 = new Stack<>();

        // add element in stack
        stk1.push(5);
        stk1.push(8);
        stk1.push(6);
        stk1.push(1);
        stk1.push(9);

        System.out.println(stk1);

        // delete index 2 in stack
        stk1.remove(2);
        System.out.println(stk1);

        // delete all element in stack
        stk1.removeAllElements();
        System.out.println(stk1);

    }
}
