import java.util.*;

public class recursion1 {
    
    public static void printnumb(int n){
        if(n==6){
            return;
        }
        System.out.println(n);

        printnumb(n+1);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        printnumb(n);
    }
}
