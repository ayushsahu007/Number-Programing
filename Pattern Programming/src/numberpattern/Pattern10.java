package numberpattern;

import java.util.Scanner;

public class Pattern10{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number - ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int a = 0;
            for (int j = 1; j <= 2 * n - 1; j++) {
                if (i + j >= n + 1 && j - i <= n - 1) {
                    if(j<=n)
                        System.out.print(++a%2+" ");
                    else
                        System.out.print(--a%2+" ");
                } else
                    System.out.print(" "+" ");
            }
            System.out.println();
        }

    }}

