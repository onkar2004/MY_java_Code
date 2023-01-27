import java.util.*;

public class arraylist {
    public static void main(String[] args){
        ArrayList<Integer> number = new ArrayList<Integer>();

        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);
        number.add(5);

        
        System.out.println(s);

        for(int i=0;i<number.size();i++){
            System.out.print(number.get(i)+" ");
        }
        System.out.println();

        number.remove(3);
        System.out.print(number);

        System.out.println();

        number.add(1 , 7);
        System.out.print(number);

        
    }
}
