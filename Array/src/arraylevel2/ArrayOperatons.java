package arraylevel2;

import java.util.Scanner;

public class ArrayOperatons {
    //to read data from user and create array anfd store the elements
             public static int[] readArray() {
                 Scanner sc = new Scanner(System.in);
                 System.out.println("Enter the Size pf array ");
                 int size = sc.nextInt();

                 int ar[] = new int[size];
                 System.out.println("----------------------------");
                 System.out.println("Enter Array Element - ");

                 for (int i = 0; i < ar.length; i++) {
                     ar[i] = sc.nextInt();
                 }
                 return ar;
             }

             //to display the data present in the array
    public static void display(int [] ar){
                 for(int j = 0; j<ar.length;j++){
                     System.out.println(ar[j] + " ");
                 }
    }
}
