import java.util.*;

public class tranposeofmatrix {
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

        // tranpose of matrix
        System.out.println("tranpose of matrix : ");
        // first columns then rows
        for(j =0;j<columns;j++){
            for(i =0;i<rows;i++){
                System.out.print(number[i][j]+ " ");
            }
            System.out.println();
        }
    }   
}
