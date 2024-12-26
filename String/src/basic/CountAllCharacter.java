package basic;

import java.util.Scanner;

//Program 3
public class CountAllCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str  = sc.nextLine();
        int ucc = 0; int dc =0; // digit count
        int lcc = 0; int scc = 0; //special case character
        for (int i = 0;i<str.length();i++){
            if(str.charAt(i)>='A' && str.charAt(i) <= 'Z' )
                ucc++;
            else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
                lcc++;
            else if(str.charAt(i) >= '0' &&  str.charAt(i) <= '9')
                dc++;
            else
                scc++;
        }
        System.out.println("UpperCase Count = "+ucc);
        System.out.println("LowerCase Count= "+lcc);
        System.out.println("Digit Count= "+dc);
        System.out.println("Special Case Count="+scc);

    }
}
