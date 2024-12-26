package easynumber;

import java.util.Scanner;

public class DigitReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number ");
        int n = sc.nextInt();
        int digit;
        int rev =0;
        while (n!=0){
            digit = n%10;
            rev = rev*10+digit;
            n=n/10;
        }
        System.out.println(rev);
    }
}
