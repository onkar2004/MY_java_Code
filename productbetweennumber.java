import java.util.*;
public class productbetweennumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        

        int product = 1;
        System.out.println("enter quire : ");
        int x = sc.nextInt();

        int k =0;
        while(k<x){
            System.out.println("enter first number : ");
            int n = sc.nextInt();
            System.out.println("enter second number : ");
            int q = sc.nextInt();
            for(int i =n;i<=q;i++){
                product = product*i;
                k++;
        }
    }
    System.out.println(product);
    }
}


