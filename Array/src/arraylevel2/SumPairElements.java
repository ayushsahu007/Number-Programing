package arraylevel2;

import java.util.Scanner;

public class SumPairElements {
    public static void main(String[] args) {
        int[] ar = ArrayOperatons.readArray();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value");
        int value = sc.nextInt();

        for (int i = 0;i<ar.length;i++){
            for (int j =i+1;j<ar.length;j++){
                if(ar[i]+ar[j]==value){
                    System.out.println("["+ar[i]+","+ar[j]+"]");
                }
            }
        }
    }
}
