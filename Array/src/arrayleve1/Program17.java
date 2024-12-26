package arrayleve1;


/// 2nd Largest element
/// This logic work sort and unsort array
public class Program17{
    public static void main(String[] args) {

        int[] ar = {1,2,6,4,5};
        int flarge = ar[0];
        int  slarge = ar[1];
        for(int i =0;i<ar.length;i++){
            if(ar[i] > flarge) {
                slarge = flarge;
                flarge = ar[i];
            }
            else if(ar[i]>slarge && ar[i]!= flarge){
                slarge = ar[i];
            }

        }
        System.out.println(slarge);

    }
}
