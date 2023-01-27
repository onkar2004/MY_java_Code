import java.util.*;


public class butterfly {
    public static void main(String[] args ) {               //butterfly pattern

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i,j;

        // upper half
        //outer loop
        for(i =1;i<=n;i++) {
            //  right star
            for(j =1;j<=i;j++) {
                System.out.print("*"+" ");
            }
            
            //spaces
            for(j =1; j<=2*(n-i);j++) {
                System.out.print(" "+" ");
            }
             // right star 
            for(j =1;j<=i;j++) {
                System.out.print("*"+" ");
            }
            
            System.out.println();
        }
        //lower half
        for(i =n;i>=1;i--) {
             //  left star
             for(j =1;j<=i;j++) {
                System.out.print("*"+" ");
            }
            
            //spaces
            for(j =1; j<=2*(n-i);j++) {
                System.out.print(" "+" ");
            }

                // right star 
            for(j =1;j<=i;j++) {
                System.out.print("*"+" ");
            }
            
            System.out.println();
        }


        ///hollow butterfly structure
        //upper part of butterfly 
        //outer loop for rows
        for(i = 1 ; i<=n;i++) {
            
            //left star
            for(j =1;j<=i;j++) {
                // condition for hollow
                if(j==1 || i==j) {
                    System.out.print("*"+" ");
                }
                else{
                    System.out.print(" "+" ");
                }
            }
            // spaces 
            for(j =1; j<=2*(n-i);j++) {
                System.out.print(" "+" ");
            }
            //right star
            for(j=1;j<=i;j++) {
              //  condition for hollow
              if(j==1||i==j) {
                System.out.print("*"+" ");
              }
              else{
                System.out.print(" "+" ");
              }
            }
            System.out.println();       // next line

        }
        // #lower part of hollow butterfly
        for(i = n; i>=1;i--) {
            
            //left star
            for(j =1;j<=i;j++) {
                // condition for hollow
                if( j==1||i==j) {
                    System.out.print(" "+" ");
                }
                else{
                    System.out.print("*"+" ");
                }
            }
            // spaces 
            for(j =1; j<=2*(n-i);j++) {
                System.out.print(" "+" ");
            }
            //right star
            for(j=1;j<=i;j++) {
              //  condition for hollow
              if(j==1||i==j) {
                System.out.print("*"+ " ");
              }
              else{
                System.out.print(" "+" ");
              }
            }
            System.out.println();       // next line

        }


        // # butterfly structure roteted by 90 degree
        
        //upper part

        //outer loop for rows
        for(i =n;i>=1;i--) {
            //spaces
            for(j = 1;j<=(n-i);j++) {
                System.out.print(" "+" ");
            }
            //star
            for(j=1;j<=2*i;j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        // lower part
        //outer loop
        for(i =1;i<=n;i++) {
            //spaces
            for(j=1;j<=(n-i);j++) {
                System.out.print(" "+ " ");
            }
            //star
            for(j=1;j<=2*i;j++) {
                System.out.print("*"+ " ");
            }
            System.out.println();
        }

        // hollow 90 degree roteted butterfly
        for(i =n;i>=1;i--) {
            //spaces
            for(j = 1;j<=(n-i);j++) {
                System.out.print(" "+" ");
            }
            //star
            for(j=1;j<=2*i;j++) {
                // condition for hollow
                if((i==3||i==2) && (j==3||j==4)) {
                System.out.print(" " + " ");
                }
                else{
                    System.out.print("*"+ " ");
                }
                
            }
            System.out.println();
        }
        // lower part
        //outer loop
        for(i =1;i<=n;i++) {
            //spaces
            for(j=1;j<=(n-i);j++) {
                System.out.print(" "+ " ");
            }
            //star
            for(j=1;j<=2*i;j++) {
                // condition for hollow
                if((i==3||i==2) && (j==3||j==4)) {
                System.out.print(" "+ " ");
                }
                else{
                    System.out.print("*"+ " ");
                }
            }
            System.out.println();
        }

    }
}
