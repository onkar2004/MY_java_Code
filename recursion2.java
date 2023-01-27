public class recursion2 {
    
    public static int countPath(int i , int j ,int m ,int n ){
        if(i==m-1||j==n-1){
            return 1;
        }
        return countPath(i+1,j , m , n) + countPath(i , j+1 , m , n);
    }


public static void main(String[] args){
    int m =4 , n=5;

    System.out.println(countPath(0 ,0 ,m , n));
}

}
