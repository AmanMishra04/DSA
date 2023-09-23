import java.util.Scanner;

public class PatternRhombus {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            
            // for spaces
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            // for stars
            for (int j=1; j<=n; j++){
                System.out.print("*");
            }

            System.out.println();
        }

        sc.close();
    }
}
