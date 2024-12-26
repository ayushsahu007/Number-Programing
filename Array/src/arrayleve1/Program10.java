package arrayleve1;


import java.util.Scanner;

/*Ques-> WAJP to take n integer value from user and print
 sum of odd number present in the array */
public class Program10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a the size of Array ");
        int size = sc.nextInt();
        int Esum = 0;
        int Osum=0;
        int [] n = new int[size];

        //to take dynamic data from user
        for(int i=0;i<n.length;i++){
            n[i]=sc.nextInt();
        }
        System.out.println("---------------------------");
        //for printing only Odd number
        for (int i =0;i<n.length;i++){
            if(n[i]%2 == 1){
                Esum = Esum+n[i];
            }
        }
        System.out.println(Esum);
        for (int i =0;i<n.length;i++){
            if(n[i]%2 == 0){
                Osum = Osum+n[i];
            }
        }
        System.out.println(Osum);
    }
}

