package easynumber;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a NUmber ");
        int n = sc.nextInt();
        System.out.println("Enter a power");
        int p = sc.nextInt();
        int res = 1;
        for(int i=0;i<p;i++){
            res=res*n;
        }
        System.out.println(res);
    }
}
