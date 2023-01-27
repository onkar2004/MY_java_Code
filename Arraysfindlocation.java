import java.util.Scanner;

public class Arraysfindlocation {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number rows : ");
        int rows = sc.nextInt();
        System.out.println("Enter number of columns : ");
        int columns  = sc.nextInt();
        int[][] number = new int[rows][columns];
        int i,j;
        // input
        // rows
        System.out.println("Enter numbers : ");
        for( i =0;i<rows;i++){
            // coluns
            for( j =0;j<columns;j++){
                // input
                number[i][j] =sc.nextInt(); 
            }
     
        }
        // output print
        System.out.println("given matrix : ");

        for( i =0;i<rows;i++){
            for( j =0;j<columns;j++){
                System.out.print(number[i][j] + " ");
            }
            System.out.println();
        }

            // Enquiry for " X "
        
        System.out.println("Enter number for finding location in matrix");
        int x = sc.nextInt();

        // loop
        for( i =0;i<rows;i++){
            for(j =0;j<columns;j++){
                // condition to find "x"
                if(number[i][j]==x){
                    System.out.println("X found at location : ("+i+","+j+")");
                }
                
            }
           
            
        }
    }
}
