import java.util.Scanner;

public class PatternButterfly {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        // upper half
        for (int i=1; i<=n; i++){

            // left half
            for (int j=1; j<=i; j++){
                System.out.print("* ");
            }

            // spaces
            for (int j=1; j<=2*(n-i); j++){
                System.out.print("  ");
            }

            // right half
            for (int j=1; j<=i; j++){
                System.out.print("* ");
            }

            System.out.println();
        }

        // lower half
        for (int i=n; i>=1; i--){

            // left half
            for (int j=1; j<=i; j++){
                System.out.print("* ");
            }

            // spaces
            for (int j=1; j<=2*(n-i); j++){
                System.out.print("  ");
            }

            // right half
            for (int j=1; j<=i; j++){
                System.out.print("* ");
            }

            System.out.println();
        }
        
        sc.close();
    }
}
