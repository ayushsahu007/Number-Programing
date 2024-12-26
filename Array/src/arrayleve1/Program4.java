package arrayleve1;

import java.util.Scanner;
/*Ques-> WAJP to take Character from user and print
 character */
public class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a the size of Array ");
        int size = sc.nextInt();
        char[] ch = new char[size];

        //to take dynamic data from user
        for(int i=0;i<ch.length;i++){
            ch[i]=sc.next().charAt(0);
        }
        System.out.println("---------------------------");
        //for printing the character
        for (int i =0;i<ch.length;i++){
            System.out.println(ch[i]);
        }
    }
}
