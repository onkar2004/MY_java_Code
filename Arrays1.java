import java.util.*;

public class Arrays1 {
    public static void main(String[] args){
          // take a arrays of names and print
          Scanner sc = new Scanner(System.in);
          int size = sc.nextInt();
          String names[] = new String[size];
          //input
          for(int i=0;i<size;i++){
             names[i] = sc.next();            
          }
          // output
          for(int i=0;i<names.length;i++){
              System.out.println("names"+(i+1)+"is :"+names[i]);
          }
    }
}
