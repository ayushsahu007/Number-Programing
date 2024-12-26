package arraylevel2;

import java.util.Scanner;

public class PairArrayUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int size = sc.nextInt();
        int[] ar = new int[size];
        System.out.println("-----------------------");
        for(int i = 0;i<ar.length;i++){
            ar[i] = sc.nextInt();
        }

    }
}
