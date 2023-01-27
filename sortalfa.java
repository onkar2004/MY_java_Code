import java.util.*;
public class sortalfa {
    
    public static void sortAlfa(char arr[] , int n  , char temp[]){

       

         n = arr.length-1;

        for(int i =1;i<+n;i++){
            if((int)(arr[i])>(int)(arr[i+1])){
                temp[0] = arr[i+1];
                arr[i+1] = arr[i];
                arr[i] = temp[0];
            }
        }

    }
    public static void printArray(char arr[] , int n){

        for(int i =0;i<=n-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args){

        
       char arr[] ={'a' , 'e' ,'r','t','q','u','k','v','b','x','z'};

       char temp[]={'0'};

       int n = arr.length;

        sortAlfa(arr , n , temp);

        printArray(arr , n);
    }
}
