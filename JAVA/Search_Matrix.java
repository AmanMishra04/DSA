import java.util.*;

class Search_Matrix{
    public static void main(String args[]){

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int m=sc.nextInt();
        System.out.print("Enter number ofcolumns: ");
        int n=sc.nextInt();
        
        int matrix[][]=new int[m][n];
        System.out.print("Enter thr elements: ");

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.print("Enter the element to seach: ");
        int x=sc.nextInt();

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if( matrix[i][j]==x){
                    System.out.println("Element found at "+i+", "+j);
                }
            }
        }        
    }
}