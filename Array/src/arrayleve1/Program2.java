package arrayleve1;

import java.util.Scanner;
//Ques-> WAJP to take number from user and print dobule value number
public class Program2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double[] d = new double[5];
        for(int i = 0;i<d.length;i++){
            d[i]=sc.nextDouble();
        }
        System.out.println("Printing the data from array");
        for(int i = 0;i<d.length;i++){
            System.out.println(d[i]);
        }
    }
}
