package logical;

import java.util.Scanner;
// Cheak 1st less than 2nd Character and 1st is queal to 2nd
public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Character ");
        char ch1 = sc.next().charAt(0);
        System.out.println("Enter 2nd Character ");
        char ch2 = sc.next().charAt(0);
        System.out.println(ch1<ch2 && ch2 == ch1);

    }
}
