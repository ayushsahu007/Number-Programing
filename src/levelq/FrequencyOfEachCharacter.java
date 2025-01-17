package levelq;

import java.util.Scanner;

public class FrequencyOfEachCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.nextLine();
          int[] count = new int[26];
          //integer  array
        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch>='A' && ch<= 'Z'){
                count[ch -65]++;
            }
        }
        // to print them
        for (int i = 0;i<count.length;i++){
            if(count[i]!=0)
                System.out.println((char)(i+65)+"-->"+count[i]);
        }
    }
}
