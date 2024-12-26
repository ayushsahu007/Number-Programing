package arraylevel2;

import java.util.Scanner;

public class RemoveElementAtIndexINSameArray {
    public static void isRemove(int[] ar,int index){
        int j = index;
        while (j<ar.length-1){
            ar[j] = ar[j+1];
            j++;
        }
        ar[j] = 0;
        ArrayOperatons.display(ar);
    }
    public static void main(String[] args) {
        int[] ar = ArrayOperatons.readArray();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index");

        int index = sc.nextInt();
        isRemove(ar,index);
        sc.close();
    }
}
