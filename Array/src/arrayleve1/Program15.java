package arrayleve1;
//Largest element given arry
public class Program15 {
    public static void main(String[] args) {

        int[] ar = {1,2,6,4,5};
        int large = ar[0];

        for(int i =0;i<ar.length;i++){
            if(ar[i] > large)
                large = ar[i];
        }
        System.out.println(large);

    }
}
