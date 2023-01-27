import java.util.*;
public class pairfriends {
    
    public static int pairsFriends(int n){

        if(n<=1){
            return 1;
        }
        return pairsFriends(n-1) + (n-1)*pairsFriends(n-2);
    }

    public static void main(String[] args){

        int n =3;

        System.out.println(pairsFriends(n));
    }
}
