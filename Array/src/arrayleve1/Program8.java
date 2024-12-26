package arrayleve1;

import java.util.Scanner;
/* WAJP to take n integer value from user and print
  only print the odd number present
 */
public class Program8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a the size of Array ");
        int size = sc.nextInt();
        int [] n = new int[size];

        //to take dynamic data from user
        for(int i=0;i<n.length;i++){
            n[i]=sc.nextInt();
        }
        System.out.println("---------------------------");
        //for printing only Odd number
        for (int i =0;i<n.length;i++){
            if(n[i]%2 == 1){
                System.out.println(n[i]);
            }
        }
    }
}
