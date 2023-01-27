import java.util.*;

class GFG{

   public int factorial(int i){
    
    if(i == 0)
    return 1;
    return i*factorial(i-1);
   }
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    int i, j ;
    GFG1 g = new GFG1();
    for(i=0;i<=n;i++){
        for(j=0;j<=n-i;j++){
            System.out.print(" ");
        }
        for(j=0;j<=i;j++){
            // ncr formula
            System.out.print(" "+ (g.factorial(i))/(g.factorial(i-j)*g.factorial(j)));
        }
        System.out.println();
    }
   }

}

        // print pascal triagle using recursion methode
        class pascal {
            // pascal function
            public static void printPascal(int n){
                for(int line =1;line<=n;line++){
                    for(int j=0;j<=n-line;j++){
                        System.out.print(" ");
                    }
                    int c = 1;
                    for(int i= 1;i<=line;i++){
                        System.out.print(c+" ");
                        c = c*(line - i)/i;
                    }
                    System.out.println();
                }
            }
                public static void main(String[] args){
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter number");
                    int n = sc.nextInt();
                    printPascal(n);
                }
        }