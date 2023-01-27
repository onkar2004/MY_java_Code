import java.util.*;
public class isPelindrome {

    public static void isPelindrome(String str){
        int strlen = str.length();
        int flag = 0;
        int left = 0 , right = strlen-1;
        int i =0 , count =0;
        while(i<strlen){
            if(str.charAt(i)==' '){
                count++;
            }
            i++;
        }
        
        char arr[] = new char[strlen]; 
        int j =0 , k=0;
        int size = arr.length;
        while(j<size){
            if(str.charAt(k) ==' '){
                k++;
            }
            arr[j] =str.charAt(k);
            j++;
            k++;
        }

        while(left<right){
            if(arr[left]== arr[right]){
                flag = 0;
            }
            else{
                flag =1;
            }
            left++;
            right--;
        }
        if(flag == 0){
            System.out.println("String is Pelindrome");
        }
        else{
            System.out.println("String is not Pelindrome");
        }
    
    }
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = sc.next();

        isPelindrome(str);

    }
}
