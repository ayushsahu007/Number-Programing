package basic;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.nextLine();
        String s1 = "";
        for (int i = str.length()-1;i>=0;i--){
            s1 = s1+str.charAt(i);
        }
        System.out.println("Reverse String " + s1);
    }
}