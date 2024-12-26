package arraylevel3;

import arraylevel2.ArrayOperatons;

import java.util.Scanner;

public class CheckElement {
    public static void main(String[] args) {
        int[] ar = ArrayOperatons.readArray();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a serch element");
        int n = sc.nextInt();
        boolean flag = false;
        for(int i =0; i<ar.length;i++){
            if(ar[i]==n){
                flag = true;
                System.out.println(i);
                break;
            }
        }
        if (flag == false)
            System.out.println("Element not found");
    }
}
