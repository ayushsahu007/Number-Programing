package arraylevel2;

import java.util.Scanner;

//insert element without createing new array
public class InsertElementSameArray {
    public static void isInsertElement(int[] ar,int index,int ele){
        int j = ar.length-2;
        while(j>=index){
            ar[j+1] = ar[j];
            j--;
        }
        ar[index]=ele;
            ArrayOperatons.display(ar);
    }
    public static void main(String[] args) {
        int[] ar = ArrayOperatons.readArray();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index");

        int index = sc.nextInt();
        System.out.println("Enter the element ");
        int ele = sc.nextInt();
        isInsertElement(ar,index,ele);

    }
}
