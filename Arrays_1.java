import java.util.*;
public class Arrays_1 {
    public static void main(String[] args){


        System.out.println("Enter size of Array : ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        
        int number [] = new int[size];

        // input
        System.out.println("Enter Array number : ");
        for(int i=0;i<size;i++){
            number[i] = sc.nextInt();
        }

        // flag 
        boolean isAscending = true;

        // input enquiry

        for(int i =0;i<number.length-1;i++){
            // condition for check order of number
            if(number[i]>number[i+1]){
                isAscending = false;
            }
        }
            // condition on isAscending
        if (isAscending){
            System.out.println("Array is sorted in Ascending order");
        }
        else{
            System.out.println("Array is not sorted in ascending order");
        }
    }
}
