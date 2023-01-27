import java.util.*;
public class Arrays2 {
    public static void main(String[] args){
        // #max and min number in integer array
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int numbers[] = new int[size];

        for(int i =0;i<size;i++){
            numbers[i] = sc.nextInt();
        }
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>max){
                max = numbers[i];
            }
            if(numbers[i]<min){
                min = numbers[i];
            }
        }
        System.out.println("largest number is : "+ max);
        System.out.println("smallest number is : "+ min);

    }
}
