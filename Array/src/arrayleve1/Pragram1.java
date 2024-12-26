package arrayleve1;

import java.util.Scanner;
//Ques-> WAJP to take number from user and print number
public class Pragram1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] ar = new int[5];
        for(int i = 0;i<ar.length;i++){
            ar[i]=sc.nextInt();
        }
        System.out.println("Printing the data from array");
        for(int i = 0;i<ar.length;i++){
            System.out.println(ar[i]);
        }
    }
}
