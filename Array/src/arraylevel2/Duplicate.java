package arraylevel2;

import java.util.Scanner;

public class Duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ar = new int[5];
        int[] br = new int[5];
        for (int i = 0; i < ar.length; i++) {
        ar[i] = sc.nextInt();
        }
        System.out.println("-------------------------");
        for (int j = 0; j < br.length; j++) {
            br[j] = sc.nextInt();
        }

        for (int i = 0; i < ar.length; i++) {
            boolean flag = false;
            for (int j = 0; j < br.length; j++) {
                if (ar[i] == br[j]) {
                    flag = true;
                    br[j] = 0;
                    break;
                }
            }
            if (flag == true){
                System.out.println(ar[i]);
            }
        }
    }
}
