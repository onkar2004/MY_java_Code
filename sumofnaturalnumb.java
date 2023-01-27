import java.util.*;

public class sumofnaturalnumb{
    public static void printsum(int n,int sum){
        if(n==0){
            System.out.println(sum);
            return;
        }
        sum = sum+n;

        printsum(n-1,sum);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        printsum(n,0);
    }
}