package easynumber;

import java.util.Scanner;

public class Product {
    public static int nNumber(int n){
        int pro = 1;
        for(int i = 1;i<=n;i++){
            pro = i* pro;
        }
        return pro;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number - ");
        int num = sc.nextInt();
        System.out.println(nNumber(num));
    }
}
