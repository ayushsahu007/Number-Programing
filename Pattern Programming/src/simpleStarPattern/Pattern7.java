package simpleStarPattern;


import java.util.Scanner;
//Incomplte pattern
public class Pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of star");
        int n = sc.nextInt();
        System.out.println("Enter a row position - ");
        int r = sc.nextInt();
        System.out.println("ENter a Column");
        int c = sc.nextInt();
        for(int i = 1;i<=n;i++){
            for (int j = 1;j<=n;j++){
                if (i==r)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            for (int j = 1;j<=n;j++){
                if (j==c)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println();
        }

    }
}
