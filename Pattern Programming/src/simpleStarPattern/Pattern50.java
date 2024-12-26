package simpleStarPattern;


import java.util.Scanner;

public class Pattern50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number -");
        int n = sc.nextInt();
        for (int i = 0;i<n;i++){
            for (int j=0;j<n;j++){
                if(i==0 && i>=n-1/2)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}

