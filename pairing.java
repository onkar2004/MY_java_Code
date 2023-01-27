public class pairing {
    
    public static void main(String[] args){
        int count = 0;

        int n =4;

        int k =0;

        while(k<=n-1){
            for(int i=1+k;i<n;i++){
                count++;
            }
            k++;
        }
        System.out.println(count);
    }
}
