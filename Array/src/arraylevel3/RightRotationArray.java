package arraylevel3;

import arraylevel2.ArrayOperatons;

import java.util.Scanner;
//this is bruteforce method
public class RightRotationArray {
    public static void main(String[] args) {
        int ar[] = ArrayOperatons.readArray();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no");
        int n = sc.nextInt();
        while (n!=0){
            int temp = ar[ar.length-1];
            for (int i = ar.length-1;i>0;i--){
                ar[i]=ar[i-1];
            }
            ar[0] = temp;
            n--;
        }
        ArrayOperatons.display(ar);
    }
}
