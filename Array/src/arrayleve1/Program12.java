package arrayleve1;

//WAJP to find product present in the array

import java.util.Scanner;
public class Program12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a the size of Array ");
        int size = sc.nextInt();
        int prod = 1;
        int[] n = new int[size];

        //to take dynamic data from user
        for(int i=0;i<n.length;i++){
            n[i]=sc.nextInt();
        }
        System.out.println("---------------------------");
        //Calculate Product
        for (int i =0;i<n.length;i++){
            prod = n[i]*prod;
            }
        System.out.println("Product is " +prod);
        }

    }
