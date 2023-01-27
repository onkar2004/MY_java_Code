// Java program to demonstrate the
// working of ArrayList in Java

import java.io.*;
import java.util.*;
 
public class ArrayListdsa {
    public static void main(String[] args)
    {
 
        ArrayList<Integer> arr = new ArrayList<Integer>();

        arr.add(1);
        arr.add(2);
        arr.add(3);

        for(int i =0;i<arr.size();i++){
            System.out.print(arr.get(i)+ " ");
        }

        // arr.add(1,6);
        // System.out.println(arr);

        // arr.remove(0);
        // System.out.println(arr);

        // arr.add(0);
        // Collection.sort(arr);
        // System.out.println(arr);

    }     
}