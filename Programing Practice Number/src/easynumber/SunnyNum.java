package easynumber;

import java.util.Scanner;

public class SunnyNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a NUmber ");
        int n = sc.nextInt();
        int s = n+1;
        boolean flag = true;
        for(int i=0;i<=n;i++){
            if(s==i*i){
                flag = false;
                break;
            }
        }
        if(flag == false)
            System.out.println("Sunny");
        else
            System.out.println("not");

    }
}
