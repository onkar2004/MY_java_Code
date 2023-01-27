import java.util.*;

public class string_1 {
 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first name : ");
        String firstname = sc.next();
        System.out.println("Enter last name : ");
        String lastname = sc.next();
            // cooncatination
        System.out.println("fullname : "+firstname+" "+lastname);
        String fullname = firstname+" "+lastname;
        // charecter access
        for(int i =0;i<fullname.length();i++){
            System.out.println(fullname.charAt(i));
        }
        System.out.println("Enter str1 : ");
        String str1 = sc.next();
        System.out.println("Enter str 2 : ");
        String str2 = sc.next();
        
        // condition for equlity
        if(new String(str1) == new String(str2)){
            System.out.println("Strings are equal.");
        }
        else{
            System.out.println("Strings are not equal.");
        }

    }


}

