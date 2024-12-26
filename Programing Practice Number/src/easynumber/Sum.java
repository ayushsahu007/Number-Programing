package easynumber;

import java.util.Scanner;

public class Sum {
    public static int nNumber(int n){
        int sum = 0;
        for(int i=1;i<=n;i++){
            sum = sum+i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number - ");
        int num = sc.nextInt();
        int sum = nNumber(num);
        System.out.println(sum);
    }
}
