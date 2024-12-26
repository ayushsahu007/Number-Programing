package easynumber;

import java.util.Scanner;

public class BuzzNUm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number ");
        int n = sc.nextInt();

           if(n%10==7 || n%7==0)
               System.out.println("Number is Buzz");
           else
               System.out.println("Number Not buzz");

    }
}
