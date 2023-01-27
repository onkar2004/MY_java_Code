class invertheart{
    public static void main(String[] args){
        int size = 39;
        int tri_size = 20;
        int base_size = 6;
        char a = 'A';
        int n = 1;

        for(int i =0;i<tri_size;i++){
            int spaces  = (size - n)/2;

            for(int j =0;j< spaces;j++){    // print spaces
                System.out.print(" ");
            }
            for(int j = 0;j<n;j++){         // print charecter
                System.out.print(a);
            }
            for(int j =0;j<spaces;j++){     // print spaces
                System.out.print(" ");
            }
            System.out.println();           // print next line
            n=n+2;
            a++;
        
        }
        int spaces_end =0;
        int spaces_between = 0;
        for(int i = 0;i<base_size;i++){

        n = (size - (2*(spaces_end))-spaces_between)/2;

            for(int j= 0;j<spaces_end;j++){
            System.out.print(" ");
             }
            for(int j= 0;j<n;j++){
             System.out.print(a);
             }
            for(int j =0;j<spaces_between;j++){
             System.out.print(" ");
            }
            for(int j=0;j<n;j++){
             System.out.print(a);
             }
            for(int j=0;j<spaces_end;j++){
            System.out.print(" ");
             }
             System.out.println();
            a++;
            spaces_end++;
            spaces_between = spaces_between +2;
            ;
                    
      }
      System.out.println("thanks");
    
   

        
    }
}
