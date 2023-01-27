import java.util.*;

public class triangle {
    public static void main(String[] args) {                // diamond type structure
        Scanner sc  =new Scanner(System.in);
        int n =sc.nextInt();
    int i,j;

    //outer loop rows ==>> upper half
    for(i =1;i<=n;i++) {
        //spaces
        for(j =1;j<=n-i;j++) {
            System.out.print(" ");
        }
        //star print 
        for(j = 1;j<=2*i-1;j++) {
            System.out.print("*");
        }
        System.out.println();
    }
        //lower half
        //outer loop rows ==>> lower half
    for(i =n;i>=1;i--) {
        //spaces
        for(j =1;j<=n-i;j++) {
            System.out.print(" ");
        }
        //star print 
        for(j = 1;j<=2*i-1;j++) {
            System.out.print("*");
        }
        System.out.println();
    }
    }
} 

