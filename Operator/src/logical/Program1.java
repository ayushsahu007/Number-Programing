package logical;

import java.util.Scanner;
//cheak num 1 is largest num 2 and num 1 is eqaul to num 2
//both condition are true
public class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1St Number - ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd Number - ");
        int b= sc.nextInt();

        System.out.println(a==b && a>b);
    }
}
