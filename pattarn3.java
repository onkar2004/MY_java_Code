import java.util.*;

public class pattarn3 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("please inter number of rows and columns for swastik pattern");
        System.out.println("Enter number of ROWS");
        int rows = sc.nextInt();
        System.out.println("Enter number of Columns");
        int columns = sc.nextInt();
        int i,j;

        designSwastik(rows,columns);
    }
        static void designSwastik(int rows , int columns) {
            for(int i =0;i<rows;i++){
                for(int j =0;j<columns;j++){
                
                    if(i<rows/2){
                        if(j<columns/2){
                        
                            if(j==0){
                                System.out.print("*"+" ");
                            }
                            else{
                                System.out.print(" "+" ");
                            }
                        }
                        else if(j==columns/2){
                            System.out.print("*"+" ");
                        }
                        else{
                            if(i==0) {
                                System.out.print("*"+" ");
                            }
                        }
                        
                        }
                        else if (i ==rows/2){
                            System.out.print("*"+" ");
                    }
                    else{
                        if(j==columns/2||j==columns-1){
                            System.out.print("*"+" ");
                        }
                        else if(i==rows-1){
                            if(j<=columns/2||j==columns-1){
                                System.out.print("*"+" ");
                            }
                            else{
                                System.out.print(" "+" ");
                            }
                        }
                        else{
                            System.out.print(" "+" ");
                        }
                    }
                    
                }
                System.out.println();
            }
        }
        
    }

