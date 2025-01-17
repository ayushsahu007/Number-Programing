package level2;

import java.util.Scanner;

public class CheckPalindromWord {
    public static boolean isPalindrome (String str) {
        char[] ch = str.toCharArray();
        int i = 0;
        int j = ch.length-1;
        while (i<j){
            if(ch[i] !=ch[j]) {
                return false;
            }
            i++;
            j--;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String ");
        String s1 = sc.nextLine();
        String[] str = s1.split("");

        for(int i = 0 ;i< str.length;i++){
            if(isPalindrome(str[i])){
                System.out.println(str[i]);
            }
        }

    }
}
