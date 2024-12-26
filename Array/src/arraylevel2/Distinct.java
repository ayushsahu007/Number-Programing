package arraylevel2;

public class Distinct {
    public static void main(String[] args) {
        int[] ar = ArrayOperatons.readArray();
        int[] br = ArrayOperatons.readArray();

        for(int i = 0;i<ar.length;i++){
            for(int j = 0;j<br.length;j++){
                if (ar[i] != br[j]) {
                    System.out.println(ar[i]);
                    break;
                }
            }
        }
    }
}
