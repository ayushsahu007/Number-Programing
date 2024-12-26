package arraylevel2;

public class SumOfTwoElement {
    public static void main(String[] args) {
        int[] ar = ArrayOperatons.readArray();
        int sum = 0;
        for(int i =0; i<ar.length;i++){
            for (int j =i+1;j<ar.length;j++){
                if(ar[i] + ar[j] >sum){
                    sum = ar[i] + ar[j];
                }
            }
        }
        System.out.println("Gretest sum of Two Element is :"+sum);
    }
}
