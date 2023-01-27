import java.util.*;
public class pemutationstr {
   
    public static void printperm(String str,int index ,String perm){
        if(str.length() == 0){
             System.out.println(perm);
            return;
        }
        
        for(int i=0;i<str.length();i++){
            char currchar = str.charAt(i);
            String newstr = str.substring(0,i) + str.substring(i+1);
            printperm(newstr,index+1,perm+currchar);
            
        }
        
    }
    public static void main(String[] args){
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str  = sc.next();


        
        System.out.println("number of permutation possible : ");
        printperm(str,0,"");
    }
}
