package arrayleve1;

/// 2nd Largest element
/// This logic work only sorted array
public class Program16{
    public static void main(String[] args) {

        int[] ar = {1,2,6,4,5};
        int flarge = ar[0];
        int  slarge = ar[1];
        for(int i =0;i<ar.length;i++){
            if(ar[i] > flarge)
                slarge = flarge;
                flarge = ar[i];

        }
        System.out.println(slarge);

    }
}
