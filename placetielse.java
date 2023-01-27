public class placetielse {
    public static int printtiles(int n,int m){
        if(n<m){
           
            return 1;
        }
        else if(n==m){
          
            return 2;
        }
        return printtiles( n-1, m) + printtiles(n-m,m); 
    }
    public static void main(String[] args){
        int n=10, m=5;

        printtiles(n,m);
        System.out.println(printtiles(n,m));
    }
}
