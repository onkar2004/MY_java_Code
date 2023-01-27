import java.util.*;

public class bubblesortalfa {
    

    void sort(char arr[]){
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
                    char temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(swapped == false)
            break;
        }
    }
    void printArray(char arr[] , int size){
       
        for(int i = 0;i<size;i++){
            System.out.print(arr[i]+ " ");
            
        }
    }
    public static void main(String[] args){
        bubblesortalfa ob = new bubblesortalfa();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size : ");
        int size = sc.nextInt();
       
        System.out.println("Enter elements : ");
        // input loop
       
        char arr[] = new char[size];

        for(int i =0;i<size;i++){
            arr[i] = sc.next().charAt(0);
        }
        
    //     char arr[] = {'z','a','e','r','u','p','v','d'};
      int n = arr.length;
        
        // call function
        ob.sort(arr);
        System.out.println("Sorted Array : ");
        ob.printArray(arr ,n);
    }
}

