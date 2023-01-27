import java.util.*;
public class numberpattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i,j;

        //left  number triangle
        
        
        // outter loop
        for(i =1;i<=n;i++) {
            //innner loop for columns;            
            //print number
            for(j =1;j<=i;j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }

        //revers tringle strat from nnnn
        // outter loop
        for(i =n;i>=1;i--) {
            //innner loop for columns;            
            //print number
            for(j =1;j<=i;j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }

       
       
       /////Right numb. triangle
       
        // right number triangle
       //outter loop
       for(i =1;i<=n;i++) {
        //innner loop for columns;
        //print spaces
        for(j=1;j<=n-i;j++) {
            System.out.print(" "+" ");
        }
        //print number
        for(j =1;j<=i;j++) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    //reverse nmb triangle
    for(i =n;i>=1;i--) {
        //innner loop for columns;
        //print spaces
        for(j=1;j<=n-i;j++) {
            System.out.print(" "+" ");
        }
        //print number
        for(j =1;j<=i;j++) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    
    
    // tringle
        for(i =1;i<=n;i++) {
        //innner loop for columns;
        //print spaces
        for(j=1;j<=n-i;j++) {
            System.out.print(" "+" ");
        }
        //print number
        for(j =1;j<=2*i;j++) {
            System.out.print(i+" ");
        }
        System.out.println();
    }


                //diamond number pattern

                //upper part

                for(i =1;i<=n;i++) {
                    //innner loop for columns;
                    //print spaces
                    for(j=1;j<=n-i;j++) {
                        System.out.print(" "+" ");
                    }
                    //print number
                    for(j =1;j<=2*i;j++) {
                        System.out.print(i+" ");
                    }
                    System.out.println();
                }
                //lower part of diamond
                for(i =n;i>=1;i--) {
                    //innner loop for columns;
                    //print spaces
                    for(j=1;j<=n-i;j++) {
                        System.out.print(" "+" ");
                    }
                    //print number
                    for(j =1;j<=2*i;j++) {
                        System.out.print(i+" ");
                    }
                    System.out.println();
                }

                // numberpattern witint number  =1h updating number
                // outter loop
                int number = 1;
        for(i =1;i<=n;i++) {
            //innner loop for columns;            
            //print number
            for(j =1;j<=i;j++) {
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }

                // triangle pattern print number with respect with columns
                // outter loop
        for(i =1;i<=n;i++) {
            //innner loop for columns;            
            //print number
            for(j =1;j<=i;j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

        // pelindromic triangle

        //outter loop
        for(i=1;i<=n;i++) {
            // spaces
            for(j =1;j<=n-i;j++) {
                System.out.print(" "+ " ");
            }
            //left side
            for(j =i;j>=1;j--) {
                System.out.print(j+" ");  
            }
            //right side
            for(j=2;j<=i;j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}
