import java.util.*;

public class linkedlist {
    public static void main(String[] args){
        
        LinkedList<String> i = new LinkedList<String>();

        i.add("vijay");
        i.add("sujit");
        i.add("amit");
        i.add("sumit");

        Iterator<String> itr  = i.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println();

        i.add(1,"suresh");
        System.out.println(i);

        System.out.println();

        LinkedList<String> ii = new LinkedList<String>();

        ii.add("sudesh");
        ii.add("raj");
        ii.add("indrajeet");
        ii.add("ayush");

        System.out.println(ii);

        System.out.println();

        i.addAll(ii);
        System.out.println(i);

        i.addAll(1,ii);
        System.out.println(i);

        i.addFirst("shiv");
        i.addLast("jivan");
        
        System.out.println(i);


    }
}
