import java.util.*;

public class bubblesort1 {
    
    static void sort(int n , int arr[] ){

        n =arr.length;

        for(int i =0;i<n;i++){
            for(int j =i+1;j<n;j++){
                if(arr[j]>arr[i]){
                    int temp= arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }

        }
    }

    static void printSortedArray(int n , int arr[]){

        for(int i=n-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args){

        bubblesort1 ob =new bubblesort1();

        Scanner sc = new Scanner(System.in);
        
        int n =sc.nextInt();

        
        int arr[] = new int[n];

        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        ob.sort(n , arr);

        ob.printSortedArray(n ,arr);
    }
}
