package easynumber;

import java.util.Scanner;

public class SpyNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number ");
        int n = sc.nextInt();
        int sum =0;
        int pro =1;
        while (n!=0)
        {
            int digit = n%10;
            sum =digit+sum;
            pro = digit*pro;
            n=n/10;
        }
        if(sum==pro)
            System.out.println("SPy");
        else
            System.out.println("Not");

    }

}
