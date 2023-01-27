import java.util.*;
public class xn {
    public static int printpower(int x,int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int x_ = printpower(x,n-1);
        int xn = x*x_;
       
        return xn;
       
    }
    public static void main(String[] args){
        Scanner sc = new  Scanner(System.in);
        System.out.println("Enter base : ");
        int x = sc.nextInt();
        System.out.println("Enter power : ");
        int n =sc.nextInt();

        printpower(x,n);
        System.out.println(" ans : " + printpower(x,n));
    }
}
