package easynumber;

import java.util.Scanner;

public class NeonNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number ");
        int n = sc.nextInt();
        int sq = n*n;
        int sum = 0;
        while (sq!=0){
            int digit = sq%10;
            sum = sum+digit;
            sq=sq/10;
        }
        if(n==sum)
            System.out.println("Neon");
        else
            System.out.println("Not");
    }
}
