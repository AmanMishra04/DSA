import java.util.Scanner;

public class Maxtrix_SearchElement {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int row = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int col = sc.nextInt();

        int matrix[][] = new int[row][col];

        // Taking element as input from user
        System.out.println("Enter the elements of the matrix: ");
        for (int i= 0; i<row; i++){
            for (int j=0; j<col; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        // Taking element to be searched as input from user
        System.out.print("Enter the element to be searched: ");
        int search = sc.nextInt();

        // Searching the element in the matrix
        System.out.println("Enter the elements of the matrix: ");
        for (int i= 0; i<row; i++){
            for (int j=0; j<col; j++){
                if (matrix[i][j] == search){
                    System.out.println("Element found at position: " +i +" " +j);
                }
            }
        }

        sc.close();
    }
}
