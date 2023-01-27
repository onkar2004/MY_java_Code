import java.util.*;

public class calculator{
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);       //Scanner object
        int a = sc.nextInt();                       //inputs from users
        int b= sc.nextInt();

        //sum
        int sum = a+b;
        System.out.println("sum : " +" " + sum);

        //subtrction
        int sub = a-b;
        System.out.println("sub : " + " " + sub);

        //multiplication
        int mul = a*b;
        System.out.println("mul : "+ " "+ mul);

        //division
        int div = a/b;
        System.out.println("div : " +" "+ div);

        //moudulas
        float mod = a%b;
        System.out.println("mod : "+" "+ mod);

        // squre of given number
        int sqr = a*a;
        System.out.println(" sqr of a : "+ " "+ sqr);

        //table of given number
        System.out.println("TABLE OF A :");
        for(int i = 1; i<=10; i++) {
            int table = a*i;
            System.out.println(table);
        }
        
          
        // to detect odd and even number
        if(a % 2 == 0) {
            System.out.println(a +"is : "+ " "+ "EVEN");
        }
        else{
            System.out.println(a + " is :"+" "+ "ODD");
        }
    }
    
}
