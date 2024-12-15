package logical;

import java.util.Scanner;
//find Largest number using ternary Operator
public class Program7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 1st Number");
        int num1 = sc.nextInt();

        System.out.println("Enter a 2nd Number");
        int num2 = sc.nextInt();

        System.out.println("Enter a 3rd Number");
        int num3 = sc.nextInt();
        System.out.println(num1>num2 && num1>num3 ? "Num 1 is Largest": num2>num3 ? "num 2 is largest" : "Num 3 is largest" );
    }
}
