package simpleStarPattern;


import java.util.Scanner;

public class Pattern16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number -");
        int n = sc.nextInt();
        for (int i = 0;i<=n;i++){
            for (int j=0;j<=2*n-1;j++){
                if(i<=j && i+j<=2*n)
                    System.out.print("*"+" ");
                else
                    System.out.print(" "+" ");
            }
            System.out.println();
        }
    }
}