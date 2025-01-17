package basic;

import java.util.Scanner;

public class IndexOfCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Sting");
        String name = sc.next();
        //using CharAt
        for (int i = 0; i<name.length();i++){
            System.out.println(name.charAt(i)+" Index of ->"+i);
        }
        //Convert to toCharArray
        char[] ch = name.toCharArray();
        for (int i = 0;i<ch.length;i++){
            System.out.println(ch[i]+" Index of "+i);
        }

    }

}
