package logical;

import java.util.Scanner;
//cheak digit number is 2
public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = sc.nextInt();
        int count = 0;

        while(num!=0){
            int digit = num%10;
            num=num/10;
            count++;
        }
        System.out.println(count==2 ?"Number is 2 digit" : "Number is not 2 digit");



    }

}
