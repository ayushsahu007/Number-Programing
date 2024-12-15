package logical;

import java.util.Scanner;
//find largest number two number
public class Program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two num - ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println(n1>n2 ?"1st Number is Largest":"2nd Number is Largest");
        sc.close();
    }
}
