import java.util.*;

public class pairssum{
public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    System.out.println("enter size of Array : ");
    int n = sc.nextInt();

    int arr[] = new int[n];

    // input array
    System.out.println("enter element of array : ");
    for(int i =0;i<n;i++){
        arr[i] = sc.nextInt();
    }
    // print array
    System.out.println("this is given array : ");
    for(int i =0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println('\n'+"enter sum : ");
    int sum = sc.nextInt();

    int count =0;

    System.out.println("pairs : ");

    for(int i =0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(arr[i]+arr[j]==sum){
                count++;
                System.out.println("("+arr[i]+","+arr[j]+")");
            }
        }
    }
    System.out.println('\n'+ "total number of pairs is : "+ count );

  }

}
