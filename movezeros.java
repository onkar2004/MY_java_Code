import java.util.*;

public class movezeros {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int arr[] = new int[size];

        for(int i =0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        int temp;

        for(int i =0;i<size/2;i++){
            for(int j =(size-1);j>=size/2;j--){
                if(arr[i]==0 && arr[j]!=0){
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                   
                }
            }
        }

        for(int i =0;i<size;i++){
            System.out.print(arr[i] +" ");
        }
    }
}
