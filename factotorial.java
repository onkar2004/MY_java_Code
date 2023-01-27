import java.util.*;

public class factotorial {
    public static void main (String[] args) {
        int fact = 1;                   //we inisiate from 1
        
        Scanner sc = new Scanner(System.in);
        int numb = sc.nextInt();

        for(int i = 1;i<=numb;i++) {            //count factorial
            fact = fact*i;                  //update factorial
        }
        System.out.println("Factorial of " +" "+numb +" is " + fact );
    }
}
