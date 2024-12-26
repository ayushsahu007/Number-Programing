package arraylevel2;

public class MoveNegativeElementstoLeft {
    public static void main(String[] args) {
        int[] ar = ArrayOperatons.readArray();
        for (int i = 0;i<ar.length;i++){
            int temp = 0;
            for (int j=i+1;j<ar.length;j++){
                if(ar[j]<0){
                    temp = ar[j];
                    ar[j] = ar[i];
                    ar[i] = temp;
                }
            }
        }
        ArrayOperatons.display(ar);
    }
}
