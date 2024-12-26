package arraylevel2;

import java.util.Scanner;

public class RemoveAnElementAtPosition {
    public static void main(String[] args) {
        int[] ar = ArrayOperatons.readArray();
        Scanner sc = new Scanner(System.in);
        int pos = sc.nextInt();

        pos = pos -1;
        int j = pos;
        while (j<ar.length-1){
            ar[j] = ar[j+1];
            j++;
        }
        ar[j] = 0;
        ArrayOperatons.display(ar);
    }
}
