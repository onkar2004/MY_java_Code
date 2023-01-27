import java.util.*;
public class sort012 {
    
    public static void main(String[] args){

        int arr[] = {0,1,0,1,1,0};

        int left_ptr = 0;
        int right_ptr = arr.length-1;

        
        int temp = 0;

        while(left_ptr>right_ptr){
        for(int i =0;i<arr.length;i++){
            if(arr[left_ptr] == 1 && arr[right_ptr]==0){
                temp= arr[left_ptr];
               arr[left_ptr] = arr[right_ptr];
               arr[right_ptr] = temp;
                left_ptr++;right_ptr--;
            }
            if(arr[left_ptr] == 0){
                left_ptr++;
            }
            if(arr[right_ptr] == 1){
                right_ptr--;
            }
        }
    }
        
        
        
    
        
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    
    }

    

