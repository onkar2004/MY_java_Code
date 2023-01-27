import java.util.*;
public class pelindrom {
    public static void isPelindrome(String str){
        int strlen = str.length();
        // int flag = 0;
        int left = 0 , right = strlen-1;
        int i =0 , count =0;
        while(i<8){
            if(str.charAt(i)==' '){
                count++;
            }
            i++;
        }
        
        char arr[] = new char[8]; 
        int j =0 , k=0;
        while(j<strlen){
            if(str.charAt(k) ==' '){
                k++;
            }
            arr[j] =str.charAt(k);
            j++;
            k++;
        }
        for(int s =0;s<8;s++){
            System.out.println(arr[s]+" ");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        isPelindrome(str);
    }
}
