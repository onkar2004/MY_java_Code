import java.util.*;

public class Arrays {
    
    public static void main(String args[]){
        // taking input Arrays from user and print
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int number[] = new int[size];

        for(int i =0;i<size;i++){
           number[i] = sc.nextInt();           
        }
        //print Arrays 
        for(int i =0;i<number.length;i++){
            System.out.print(number[i]+" ");
        }
        System.out.println('\n'+"thanks");
    }
       
}
