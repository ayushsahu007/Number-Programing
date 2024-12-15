package logical;

import java.util.Scanner;
//Count how many digit in given Number
public class Program8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number - ");
        int num = sc.nextInt();
        int digit = 0;
        int count = 0;
        while(num!=0){
            digit = num%10;
            count++;
            num=num/10;
        }
        System.out.println("Total Number is - "+count);

    }
}
