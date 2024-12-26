package arrayleve1;

import java.util.Scanner;
//Ques-> WAJP to take name from user and print name

public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int size = sc.nextInt();

        System.out.println("Enter the array elements");
        String[] name = new String[size];

        for (int i = 0;i<name.length;i++){
            name[i] = sc.next();
        }
        //to print the data using loops
        System.out.println("------------------");
        for (int j = 0;j<name.length;j++){
            System.out.println(name[j]);
        }
        sc.close();
    }
}
