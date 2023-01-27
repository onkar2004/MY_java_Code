import java.util.*;
public class bubblesort{
    // sort function
    void sort(int arr[]){
        int n =arr.length;
        // loop
        boolean swapped;
        for(int i =0;i<n-1;i++){
            // loop
            swapped = false;
            
            for(int j =0;j<n-i-1;j++){
                // condition
                if(arr[j] > arr[j+1]){
                    // swap 
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(swapped == false)
            break;
        }
    }
    void printArray(int arr[] , int size){
       
        for(int i = 0;i<size;i++){
            System.out.print(arr[i]+ " ");
            
        }
    }
    public static void main(String[] args){
        bubblesort ob = new bubblesort();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter elements : ");
        // input loop
        int n =arr.length;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        // call function
        ob.sort(arr);
        System.out.println("Sorted Array : ");
        ob.printArray(arr ,n);
    }
}