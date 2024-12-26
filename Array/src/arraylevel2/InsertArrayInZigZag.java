package arraylevel2;

public class InsertArrayInZigZag {
    public static void isMerge(int[] ar,int[] br, int[] cr){
        int i = 0;
        int j = 0;
        int k = 0;
        while(k<cr.length){
            if(i<ar.length)
                cr[k++] = ar[i++];

            if (j<br.length){
                cr[k++] = br[j++];
            }
            ArrayOperatons.display(cr);
        }
    }
    public static void main(String[] args) {
        //first array
        int[] ar = ArrayOperatons.readArray();

        //second array
        int[] br =  ArrayOperatons.readArray();

        //third array
        int[] cr = new int[ar.length + br.length];
        isMerge(ar,br,cr);
    }
}
