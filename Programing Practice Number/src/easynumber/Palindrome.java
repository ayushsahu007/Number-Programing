package easynumber;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number ");
        int n = sc.nextInt();
        int temp = n;
         int rev = 0;
         while (n!=0){
             int digit = n%10;
             rev = rev*10+digit;
             n=n/10;
         }
         if (rev == temp )
             System.out.println("Number Palindrom");
         else
             System.out.println("Not ");
    }
}
