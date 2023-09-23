// solid rectangle pattern

import java.util.Scanner;
public class PatternFloydTriangle {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
    
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        int number = 1;

        for (int i=1; i<=n; i++){
            
            for (int j=1; j<=i; j++){
                System.out.print(number++);
            }

            System.out.println();
        }

        sc.close();
    }    
}