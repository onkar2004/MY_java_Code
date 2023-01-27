import java.util.*;
public class tilingproblem {
    public static int placeTiles(int n , int m){
        if(n<m){
            return 1;
        }
        else if(n==m){
            return 2;
        }
        return placeTiles(n-1 , m) + placeTiles(n-m , m);
    }

    public static void main(String[] args){
        int n =4; int m =3;

        System.out.println(placeTiles(n,m));
    }
}
