package easynumber;

import java.util.Scanner;

public class PrimeRenge {
    public static boolean isPrime(int n){
        boolean flag = true;
        for(int i=2;i<n;i++){
            if(n%i==0){
            flag = false;
                break;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a range");
        int n = sc.nextInt();

         for(int i =2;i<=n;i++){
             boolean res = isPrime(i);
             if(res == true)
                 System.out.println(i);

         }
    }
}
