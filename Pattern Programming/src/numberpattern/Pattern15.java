package numberpattern;

//   5 4 3 2 1 2 3 4 5
//     5 4 3 2 3 4 5
//       5 4 3 4 5
//         5 4 5
//           5
import java.util.Scanner;

public class Pattern15{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number - ");
        int n = sc.nextInt();
        for (int i=1; i<=n; i++) {
            int a=n;
            for (int j = 1;j<=2*n-1;j++){
                if(i<=j && i+j<=n*2){
                    if(j<n){
                        System.out.print(a--+" ");
                    }
                    else
                        System.out.print(a+++" ");
                }
                else
                    System.out.print(" "+" ");
            }
            System.out.println();
        }

    }

}


