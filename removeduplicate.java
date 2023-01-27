import java.util.*;
public class removeduplicate {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER SIZE OF ARRAY : ");
        int size = sc.nextInt();
       
        int arr[] = new int[size];
        int temp[] = new int[size];
        int count = 0;

        System.out.println("ENTER ELEMENT OF ARRAY : ");
        for(int i =0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        for(int i =0;i<size;i++){
            for(int j =i+1;j<size;j++){
                if(arr[i]!=arr[j]){
                    temp[i] = arr[i];
                }
                if(arr[i] == arr[j]){
                    temp[i] = arr[i];
                    count++;
                }
            }
        }

        for(int i =0;i<size ;i++)
        {
            System.out.print(arr[i] +" ");
        }
        System.out.println();

        for(int i =0;i<(size-count) ;i++)
        {
            System.out.print(temp[i] +" ");
        }
    
            }
        }

       






    