package arraylevel2;

public class MergeTwoArray {
    public static void main(String[] args) {
             //first aray
         int[] ar = ArrayOperatons.readArray();

         //second array
        int[] br = ArrayOperatons.readArray();
        System.out.println(br.length);

        int[] cr = new int[ar.length + br.length];

        //to store 1st array elements
        for(int i = 0; i<ar.length;i++)
            cr[i] = ar[i];

        //to store 2nd Array elements
        for (int j = 0 ; j<br.length;j++){
            cr[ar.length+j] = br[j];

        }
        ArrayOperatons.display(cr);
    }
}
