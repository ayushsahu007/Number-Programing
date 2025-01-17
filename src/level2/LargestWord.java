package level2;

import java.util.Scanner;
//Largest and Smallest Word in the given String
public class LargestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s1 = sc.nextLine();
        String[] str = s1.split(" " );
        String largest = " ";
        String smallest = " ";

        for(int i = 0;i<str.length;i++){
            if(str[i].length() > largest.length()){
                largest = str[i];
            }
        }
        // not work
//        for(int i = 0;i<str.length;i++){
//            if(str[i].length() > smallest.length()){
//                smallest = str[i];
//
// }
        System.out.println(largest);
        //System.out.println(smallest);



    }
}
