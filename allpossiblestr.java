public class allpossiblestr {
    public static void printstr(char[] set,int k){
        int n =set.length;
        printklengthstr(set,"",n,k);
    }
    public static void printklengthstr(char[] set,String prefix,int n,int k ){
        if(k==0){
            System.out.println(prefix);
            return;
        }
        for(int i =0;i<n;i++){
            String newPrefix = prefix + set[i];

            printklengthstr(set,newPrefix,n,k-1);
        }
    }
    public static void main(String[] args){
        System.out.println("first test : ");
        char[] set1 = {'a' , 'b'};
        int k=3;
        printstr(set1,k);

        System.out.println("second test : ");
        char[] set2 = {'a','b','c','d'};
         k =2;
        printstr(set2,k);
    }
}
