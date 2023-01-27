import java.util.*;

public class prefixsum {

    static void prefix(int arr[]){
        int n = arr.length;

        int prefix =0;

        for(int i =0;i<n;i++){
            prefix = prefix + arr[i];
        }
    }


public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter size : ");
    int size = sc.nextInt();

    int arr[] = new int[size];

    for(int i =0;i<size;i++){
        arr[i] = sc.nextInt();
    }

    prefix(arr);

    for(int i=0;i<size;i++){
        System.out.print(arr[i]+" ");
    }
}
}
    
