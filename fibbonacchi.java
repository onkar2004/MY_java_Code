import java.util.*;
public class fibbonacchi {
    public static void fibonnacci(int a ,int b , int n ){
        if(n==0){
            
            return;
        }
        System.out.print(a + " ");
        fibonnacci(b,a+b,n-1);

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        fibonnacci(0,1,n);
    }
}
