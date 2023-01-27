import java.util.*;
public class SelectionSort_1 {
    // read the length of array
    // class_1
    void sort(int arr[]){
        int n =arr.length;
        // set i=o;
        // loop
        for(int i =0;i<n-1;i++){
            // set min_index = i;
            int min_idx = i;
            // set j =i+1;
            for(int j =i+1;j<n;j++){
                if(arr[j]<arr[min_idx]){
                    min_idx = j;
                    // swaping
                    int temp =arr[min_idx];
                    arr[min_idx] = arr[i];
                    arr[i]= temp;
                }
                else{

                }
            }
        }
    }
        // print sorted array
         void printArray(int arr[]){
            int n =arr.length;
            for(int i =0;i<n;++i){
                System.out.println(arr[i]+ " ");
                System.out.println();
            }
        }
        public static void main(String[] args){
            SelectionSort ob = new SelectionSort();
            int arr[] ={65,45,78,90,23,45};
            ob.sort(arr);
            ob.printArray(arr);
        }

    }

