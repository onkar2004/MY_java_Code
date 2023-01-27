import java.util.*;

public class factorial {
    public static void printfactorial(int n ,int fact){
        if(n==0){
            System.out.println(fact);
            return;
        }
        fact = fact*n;
        printfactorial(n-1,fact);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();

        printfactorial(n,1);
    }
}
