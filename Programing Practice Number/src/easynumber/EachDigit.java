package easynumber;

import java.util.Scanner;

public class EachDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a NUmber ");
        int n = sc.nextInt();
        int digit = 0;
        while(n!=0){
            digit = n%10;
            System.out.println(digit);
            n=n/10;
        }
    }
}
