package easynumber;

import java.util.Scanner;

public class Happy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a NUmber ");
        int n = sc.nextInt();
        while (n!=1 && n!= 4){
            int sum = 0;
            while (n!=0){
                int digit = n%10;
                sum = sum+digit*digit;
                n=n/10;
            }
            n=sum;
        }if(n==1)
            System.out.println("Happy");
        else
            System.out.println("Not Happy no");
    }
}
