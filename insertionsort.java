import java.util.*;
public class insertionsort {
    void sort(int arr[]){
        int n = arr.length;

        // loop
        for(int i = 0;i<n;i++){
            int key = arr[i];
            int j = i-1;
            // while inner loop
            while(j>=0 && arr[j]>key){
                //swapping
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
            
        }
    }
    void printArray(int arr[]){
        int n =arr.length;
        //output
        for(int i =0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String[] args){
        insertionsort sb = new insertionsort();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        // input element
        System.out.println("Enter element : ");
        int n =arr.length;
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        sb.sort(arr);
        System.out.println("Sorted array : ");
        sb.printArray(arr);
    }
}
