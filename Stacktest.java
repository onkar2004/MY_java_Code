import java.util.*;

public class Stacktest {

    public static void main(String[] args){
    
    Stack<Integer>stack = new Stack<>();

    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);

    int k =3;

    for(int i =0;i<4;i++){
        System.out.println(stack.peek()-k);
        k--;
        stack.pop();
        
    }

}


}
