package levelq;


import java.util.Scanner;

public class LastCharacterToUpperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s1 = sc.nextLine();
        String s2 = " ";
        for (int i =0;i<s1.length();i++){
            //this if else condition for all case (last charcater is upper)
            if(s1.charAt(i)>='a' && s1.charAt(i)<='z'){
                //this if else only for last character is small
                if(i==s1.length()-1 || s1.charAt(i) != ' ' && s1.charAt(i+1)==' '){
                    s2 = s2+(char)(s1.charAt(i)-32);
                }else
                    s2 = s2+s1.charAt(i);
            }else
                s2 = s2+s1.charAt(i);

        }
        System.out.println(s2);
        sc.close();
    }
}

