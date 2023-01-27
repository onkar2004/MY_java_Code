import java.util.*;
public class bubblesorttest {
    // void function
    void sort(int arr[]){
        int n = arr.length;

        // loop for enquiry
        for(int i =0;i<n-1;i++){
            // loop for set j =0 , j<n-i-1;
            //boolean function
            boolean swapped ;
            for(int j =0;j<n-i-1;j++){
                // condition
                swapped = false;
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
                if(swapped == false)
            break;
            }
            
        }
    }
    // print Array function
    void printArray(int arr[] , int size){
        // loop
        for(int i =0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
    // main function
    public static void main(String[] args){
        
        bubblesort ob = new bubblesort();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        int n =arr.length;
        System.out.println("Enter elements : ");
        // loop input
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        ob.sort(arr);
        System.out.println("Sorted array  : ");
        ob.printArray(arr,n);
    }
}
