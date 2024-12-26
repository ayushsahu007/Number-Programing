package arraylevel2;

public class TwoEqualHalves {
    public static void twoEqualHalves(int[] ar){
        if(ar.length%2==0){
            //second array
            int[] br = new int[ar.length/2];
            //third array
            int[] cr = new int[ar.length/2];

            for(int i= 0; i<ar.length;i++){
                if (i< ar.length/2)
                    br[i] = ar[i];
                else
                    cr[i- ar.length/2]=ar[i];
            }
            ArrayOperatons.display(br);
            System.out.println("------------------");
            ArrayOperatons.display(cr);
        }

    }
    public static void main(String[] args) {
        //first array
        int[] ar = ArrayOperatons.readArray();
        twoEqualHalves(ar);

    }
}
