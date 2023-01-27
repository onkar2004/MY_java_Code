import java.util.*;
public class Arrays3 {
    public static void main(String[] args){
        // #max and min number in integer array
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int numbers[] = new int[size];

        for(int i =0;i<size;i++){
            numbers[i] = sc.nextInt();
        }
    }
}