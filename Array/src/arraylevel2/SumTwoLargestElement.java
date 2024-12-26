package arraylevel2;

import java.util.Scanner;
//Sum of two Largest Element 1
public class SumTwoLargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ar = ArrayOperatons.readArray();
        int flarge = ar[0];
        int  slarge = ar[1];
        for(int i =0;i<ar.length;i++){
            if(ar[i] > flarge)
                slarge = flarge;
            flarge = ar[i];

        }
        int sum = flarge+slarge;
        System.out.println(sum);
    }
}
