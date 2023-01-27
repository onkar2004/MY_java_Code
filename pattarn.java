public class pattarn {
    public static void main(String[] args) {

        //simple method
        System.out.println("*");
        System.out.println("* *");
        System.out.println("* * *");
        System.out.println("* * * *");

        //iteration method
        //squre box 4 by 4

        for(int i = 1;i<=4 ; i++) {
            for(int j =1; j<=4;j++){
                System.out.print("*");
            }
            System.out.println();
        }

            //rectrangle box 2 by 4 horizontal

            for(int x = 1; x<=3;x++)  {              //here x ==>> ROWS 
                for(int y = 1; y<=6;y++) {          // y==>> colums
                    System.out.print("*");
                }
                System.out.println();
            }     
            
            //hollow squre 4 by 4
            for(int i = 1; i<=4;i++) {
                for (int j = 1; j<=4;j++) {
                    if(i == 1 || i==4 ||j==1||j==4) {
                        System.out.print("*" + " ");
                    }
                    else{
                        System.out.print(" "+ " ");
                    }
                }
                System.out.println();
            }
        
            //hollow reactangle 0f 3 by 6
            for(int i = 1; i<=3;i++) {
                for (int j = 1; j<=6;j++) {
                    if(i == 1 || i==3 ||j==1||j==6) {
                        System.out.print("*" + " ");
                    }
                    else{
                        System.out.print(" "+ " ");
                    }
                }
                System.out.println();
            }
                //90 degree triangle by iteration
                for(int i =1;i<=4;i++) {
                    for(int j =1; j<=4;j++) {
                        if(i>=j) {
                            System.out.print("*"+ " ");
                        }
                        else{
                            System.out.print(" "+" ");
                        }
                    }
                    System.out.println();
                }

                //90 degree triangle by iteration reverse
                for(int i =1;i<=4;i++) {
                    for(int j =1; j<=4;j++) {
                        if(i<=j) {
                            System.out.print("*"+ " ");
                        }
                        else{
                            System.out.print(" "+" ");
                        }
                    }
                    System.out.println();
                }

                //triangle ulta
                for(int i =4;i>=1;i--) {
                    for(int j =1; j<=4;j++) {
                        if(i<=j) {
                            System.out.print("*"+ " ");
                        }
                        else{
                            System.out.print(" "+" ");
                        }
                    }
                    System.out.println();
                }
                //troangle ultapulta
                for(int i =4;i>=1;i--) {
                      for(int j =1; j<=i;j++) {
                        
                            System.out.print("*"+ " ");
                        }
                        System.out.println();
                        }
                    return ;
    }
}
