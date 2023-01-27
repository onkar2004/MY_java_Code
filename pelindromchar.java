import java.util.*;
public class pelindromchar {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       String str = sc.next();
        
        int strLength = str.length();
        char reversestr[] = new char[strLength]; 
        
        for(int i =(strLength-1) ;i>=0;--i){
            reversestr[i] =  str.charAt(i);
        }
        int flag =0;
        
        for(int i =0;i<(strLength);i++){
            for(int j =strLength-1;j>=0;j--){
                if(reversestr[i] == reversestr[j] ){
                        flag =0;
        }
        else{
            flag =1;
        }
            }
        }
        
        if(flag  == 0){
            System.out.print("Yes");
        }
        else{
             System.out.print("No");
        }
        
        
    }
}

