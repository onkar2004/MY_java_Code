import java.util.*;
public class quicksort {

    public static int partition(int arr[],int low , int high){
        int pivot = arr[high];
        int  i =low-1;

        for(int j =0;j<high;j++){
            if(arr[j]<pivot){
                i++;
                //swap;
                int temp = arr[i];
                arr[i] =arr[j];
                arr[j] =temp;

            }
        }
        i++;
        int temp =arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        return i;
    }
    
    public static void quickSort(int arr[] , int low , int high){
        if(low<high){

            int pi = partition(arr,low,high);

            quickSort(arr,low,pi-1);
            quickSort(arr,pi+1,high);
        }
    }

    public static void main(String[] args){

       

        int arr[] = {6,4,1,7,3};

        int n = arr.length;

        quickSort(arr ,0 , 0);


        partition(arr , 0 , 0);

        
        for(int i =0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
    }
    
}
