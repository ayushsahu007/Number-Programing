package arrayleve1;

/*Ques-> WAJP to take 1st name from user and print only the first
 character in the given name  */
import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a the size of Array ");
        int size = sc.nextInt();
        String[] str = new String[size];

        //to take dynamic data from user
        for(int i=0;i<str.length;i++){
            str[i]=sc.next();
        }
        System.out.println("---------------------------");
        //for printing the first character
        for (int i =0;i<str.length;i++){
            System.out.println(str[i].charAt(0));
        }
    }
}

