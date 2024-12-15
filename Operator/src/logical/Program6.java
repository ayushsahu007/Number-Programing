package logical;

import java.util.Scanner;

//Cheak 2 digit number using Ternary operators
public class Program6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = sc.nextInt();
        System.out.println(num>9 && num<100 ? "it 2 digit number" :"it not 2 digit number");
    }
}
