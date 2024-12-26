package easynumber;

import java.util.Scanner;

public class AvgNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number ");
        int n = sc.nextInt();
        int avg = 0;
        int sum =0;
        int count =0;
        while (n!=0){
            int digit = n%10;
             sum=sum+digit;
             count++;
           n=n/10;
        }
        avg = sum/count;
        System.out.println(avg);
    }
}
