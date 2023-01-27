import java.util.Scanner;

public class twoDArrays {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number rows : ");
        int rows = sc.nextInt();
        System.out.println("Enter number of columns : ");
        int columns  = sc.nextInt();
        int[][] number = new int[rows][columns];

        // input
        // rows
        for(int i =0;i<rows;i++){
            // coluns
            for(int j =0;j<columns;j++){
                // input
                number[i][j] =sc.nextInt(); 
            }
        }

        // output print 
        for(int i =0;i<rows;i++){
            for(int j =0;j<columns;j++){
                System.out.print(number[i][j] + " ");
            }
            System.out.println();
        }
    }
}
