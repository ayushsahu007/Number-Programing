package easynumber;

import java.util.Scanner;

public class StrongNum {
    public static int isFact(int n){
        int fact = 1;
        for(int i =1; i<=n;i++){
            fact = fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a NUmber ");
        int n = sc.nextInt();
        int temp = n;
       int sum = 0;
       while (n!=0){
           int digit = n%10;
           int f = isFact(digit);
           sum = sum+f;
           n=n/10;
       }
       if(temp==sum)
           System.out.println("Strong");
       else
           System.out.println("Not");
    }
}
