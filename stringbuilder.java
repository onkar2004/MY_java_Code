import java.util.*;
public class stringbuilder {
    public static void main(String[] args){

        // get a charecter from index
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string : ");
        String str = sc.next();
        System.out.println("Enter index : ");
        int index = sc.nextInt();
        

        StringBuilder sb = new StringBuilder(str);
        // get 
        System.out.println(sb.charAt(index));

        // set
        sb.setCharAt(0 , 'q');
        System.out.println("print updated set str : ");

        System.out.println(sb);

        // insert

        sb. insert(0,'a');
        System.out.println("print updated insert str : ");
        System.out.println(sb);

        //delete char 

        sb.delete(0,1);
        System.out.println("Print updated delete str : ");
        System.out.println(sb);

        // Append char at end
        sb.append(" "+"stark");
        System.out.println("print updated append str : ");
        System.out.println(sb);

        // print length of string
        System.out.println("Print length of string : ");
        System.out.println(sb.length());

        // reverse a string 
        
        for(int i =0;i<sb.length()/2;i++){
            int front = i;
            int back = sb.length() - i -1;
            char frontChar = 'a';
            char backChar = 'd';
            

            sb.setCharAt(front , backChar);
            sb.setCharAt(back , frontChar);
        }
        System.out.println("print reverse string : ");
        System.out.println(sb);

    }
}
