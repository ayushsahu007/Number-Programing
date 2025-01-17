package levelq;

import java.util.Arrays;
import java.util.Scanner;

public class ToConvertCharacterArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();
        char[] ch = new char[str.length()];

        //tocharArray
        for(int i = 0;i<str.length();i++){
            ch[i] = str.charAt(i);
        }
        System.out.println(Arrays.toString(ch));

    }
}
