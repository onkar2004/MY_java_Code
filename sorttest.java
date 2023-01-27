import java.util.*;


public class sorttest {
    
  void sort(int arr[]){
    int n = arr.length;

    // read the length of array
    // set i =0;
    for(int i =0;i<n-1;i++){
        //set min_idx  =i;
        
        //set j = i+1;
        for(int j =i+1;j<n;j++){
            // condition
            int min_idx = i;
            if(arr[i]<arr[min_idx]){
                // swap 
                int temp =arr[min_idx];
                arr[min_idx] = arr[i];
                arr[i] = temp;
                
            }
        }
    }
  }
  
  void printArray(int arr[]){
    
    int n = arr.length;
    // print loop
    for(int i =0;i<n;i++){
        System.out.print(arr[i]+ " ");
        System.out.println();
    }
   
  }
  // driver 
  public static void main(String[] args){
    // selection sorting function
    SelectionSort ob  =new SelectionSort();
    // input
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter unsorted array size : ");
    int size = sc.nextInt();
    System.out.println("enter elementes of array : ");
    // loop for inputs
    int arr[] = new int[size];
    int n = arr.length;
    for(int i =0;i<n;i++){
       arr[i] = sc.nextInt();
    }
    // call functions
    ob.sort(arr);
    System.out.println("Here is soted Array : ");
    ob.printArray(arr);
  }
}
