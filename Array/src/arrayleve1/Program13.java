package arrayleve1;


//WAJP to find factorial of each digit present in the array

import java.util.Scanner;
public class Program13 {
      public  static int isFact(int n){
          int fact = 1;
          for(int i = 1;i<=n;i++){
              fact = fact * i;
          }
          return fact;
      }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a the size of Array ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        //to take dynamic data from user
        System.out.println("Enter the array element");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for (int i = 0;i<arr.length;i++){
            int res = isFact(arr[i]);
            System.out.println(arr[i]+" -->"+res);
        }
    }

}
