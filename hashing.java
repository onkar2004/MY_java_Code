import java.util.HashSet;

import java.util.Iterator;

import java.util.*;

public class hashing {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        HashSet<Integer> set = new HashSet<>();

        System.out.println("enter size : ");
        int n = sc.nextInt();

        // add
        System.out.println("enter element of set : ");
        
        for(int i =0;i<n;i++){
            int ele =sc.nextInt();
            set.add(ele);
        }
        
        //remove

        set.remove(0);

        System.out.println(set);

        // search

        int x = sc.nextInt();
        set.contains(x);
        if(!set.contains(x)){
            System.out.println("not contains");
        }
        else{
            System.out.println("contains");
        }

        //iterator

        Iterator it = set.iterator();

        while(!it.hasNext()){
            System.out.println(it.next()+",");
        }

        if(!set.isEmpty()){
            System.out.println("set is not empty");
        }
    }
}
