import java.util.Scanner;

public class PatternPallindromicPyramid {
    public static void main(String ars[]){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){

            // spaces
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            // left half
            for (int j=i; j>=1; j--){
                System.out.print(j);
            }

            // right half
            for (int j=2; j<=i; j++){
                System.out.print(j);
            }

            System.out.println();
        }
        
        sc.close();
    }
}
