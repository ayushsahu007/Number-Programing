package easynumber;

import java.util.Scanner;

public class DIgitPro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number ");
        int n = sc.nextInt();
        int pro = 1;
        while (n!=0){
            int digit = n%10;
            pro = digit*pro;
            n=n/10;
        }
        System.out.println(pro);
    }
}
