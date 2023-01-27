import java.util.*;


    // main function
public class recursion {
    // recursive function 
    public static void printnumb(int n){
        // base condition
        if(n==6){
            return;
        }
        System.out.println(n);
        // update the input value
        printnumb(n+1);
    }
    // driver function
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();
        printnumb(n);
    }
}

