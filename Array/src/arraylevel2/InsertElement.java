package arraylevel2;

import java.util.Scanner;

public class InsertElement {
       public static void isInsert(int[] ar,int index,int ele){
           //new array
           int br[] = new int[ar.length+1];

           if(index <= 0 || index >=ar.length){
               System.out.println("Index is Invaild");
           } else
           {
               br[index] = ele;
               for (int i = 0;i< ar.length;i++){
                   if (i< index){
                       br[i] = ar[i];
                   }
                   else
                       br[i+1]=ar[i];
               }
               ArrayOperatons.display(br);


           }

       }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ar = ArrayOperatons.readArray();

        System.out.println("Enter the index where you want to insert the ele");
        int  index = sc.nextInt();

        System.out.println("Enter the ele to be inserted - ");
        int ele = sc.nextInt();

        isInsert(ar,index,ele);
    }
}
