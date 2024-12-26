package arraylevel3;

import arraylevel2.ArrayOperatons;

import java.util.Scanner;

public class LeftRotateArray {
        public static void main(String[] args) {
            int ar[] = ArrayOperatons.readArray();
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a no");
            int n = sc.nextInt();
            while (n!=0){
                int temp = ar[0];
                for (int i =1;i<ar.length;i++){
                    ar[i-1]=ar[i];
                }
                ar[ar.length-1] = temp;
                n--;
            }
            ArrayOperatons.display(ar);
        }
    }


