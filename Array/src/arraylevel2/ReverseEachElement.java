package arraylevel2;

public class ReverseEachElement {
    public static int isReverse(int n){
        int rev = 0;
        while (n!=0){
            int digit = n%10;
            rev = rev * 10+digit;
            n = n/10;
        }
        return rev;
    }


    public static void main(String[] args) {
        int[] ar = ArrayOperatons.readArray();
        for(int i = 0;i<ar.length;i++){
            ar[i] = isReverse(ar[i]);
        }
        ArrayOperatons.display(ar);
    }
}
