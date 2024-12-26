package simpleStarPattern;

import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        for(int i = 1;i<=n;i++){
            for (int j = 1;j<=n;j++){
                if (i==1)
                    System.out.print("*");
                 else
                    System.out.println(" ");
            }
            System.out.println();
        }

    }
}
