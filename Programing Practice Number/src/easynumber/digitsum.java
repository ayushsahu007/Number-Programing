package easynumber;

import java.util.Scanner;

public class digitsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();
        int digit;
        int sum =0;
        while (n!=0){
            digit = n%10;
            sum = digit + sum;
            n=n/10;
        }
        System.out.println(sum);
    }
}
