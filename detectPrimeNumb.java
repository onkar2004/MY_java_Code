import java.util.*;
public class detectPrimeNumb {
    public static void main(String[] args) {
        int flag = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n/2;
        if(n == 0 ||n == 1) {
            System.out.println(n +" "+ "IS NOT PRIME NUMBER");
        }
        else {
            for(int i = 2;i<=m;i++) {
                if(n % i == 0) {
                    System.out.println(n + " "+"IS NOT PRIME NUMBER");
                    flag = 1;
                }
            }
            if(flag == 0) {
                System.out.println(n + " "+ "IS PRIME NUMBER");
            }
        }
    }
    
}
