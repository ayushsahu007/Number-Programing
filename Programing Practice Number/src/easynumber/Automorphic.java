package easynumber;

import java.util.Scanner;

public class Automorphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a NUmber ");
        int n = sc.nextInt();
        int sq = n*n;
        boolean flag = false;
        while (n!=0 && sq!=0){
            int d1 = n%10;
            int d2 = sq%10;
            if(d1 == d2){
                flag = true;
            }
            else
                break;
            n=n/10;
            sq=n/10;
        }

        if (flag = true)
            System.out.println("Automorphic");
        else
            System.out.println("Not");
    }
}
