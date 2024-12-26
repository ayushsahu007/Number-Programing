package arraylevel2;

public class MissingElement {
    public static void main(String[] args) {
        int[] ar = ArrayOperatons.readArray();

        int min = ar[0];
        int max = ar[ar.length-1];
        int j = 0;
        for (int i = min;i<max;i++){
            if (i!=ar[j]){
                System.out.println(i+" ,");
                }else
                    j++;


            }
        }
    }

