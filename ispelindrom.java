import java.util.*;

public class ispelindrom {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER SIZE OF ARRAY");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("ENTER ELEMENT  OF ARRAY");
        for(int i = 0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        int flag=0;

        for(int i =0;i<size;i++){
            for(int j = size-1;j>=0;j--){
               
               if(arr[i]== arr[j]){
                flag = 0;
               }
               else{
                flag =1;
               }
            }
        }

        if(flag == 0){
            System.out.println("Given nnumber is pelindrom");
        }
        else{
            System.out.println("given number is not pelindrom");
        }
    }
}
