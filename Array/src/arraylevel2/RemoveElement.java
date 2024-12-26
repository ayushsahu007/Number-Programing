package arraylevel2;

import java.util.Scanner;

public class RemoveElement {
    public static void isRemove(int[] ar,int index){
        int[] br = new int[ar.length-1];

        if(index<0 || index>br.length){
            System.out.println("Invaild index");
        }else
        {
           for(int i =0;i<br.length;i++){
               if (i<index)
                   br[i]=ar[i];
               else
                   br[i]=ar[i+1];
           }
        }
        ArrayOperatons.display(br);

    }
    public static void main(String[] args) {
        //Tp read the size and aray elements
        int[] ar = ArrayOperatons.readArray();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter index");
        int index = sc.nextInt();

        isRemove(ar,index);
        sc.close();
    }
}
