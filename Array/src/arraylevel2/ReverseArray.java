package arraylevel2;

public class ReverseArray {
    public static void main(String[] args) {
        //first array
        int[] ar = ArrayOperatons.readArray();

        int i = 0;
        int j = ar.length-1;
        int temp = 0;
        while (i<j){
            temp = ar[i];
            ar[i] = ar[j];
            ar[j]=temp;
            i++;
            j--;
        }
        ArrayOperatons.display(ar);
    }
}
