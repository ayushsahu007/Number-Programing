package logical;

import java.util.Scanner;

//check number is buzz or not
//buzz num is number end 7 and divisible by 7
public class Program9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();
        System.out.println(n%7==0? "Number is Buzz": n%10 == 7 ? "Number is Buzz" :"Number is Not buzz");

    }
}
