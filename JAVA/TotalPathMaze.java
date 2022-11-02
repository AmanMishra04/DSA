import java.util.*;

public class TotalPathMaze {
    public static int countPath(int i, int j, int n, int m){
        if(i==n || j==m){
            return 0;
        }
        if(i==n-1 && j==m-1){
            return 1;
        }
        //Count Downwards
        int downPath= countPath(i+1, j, n, m);

        //Count Rightwards
        int rightPath= countPath(i, j+1, n, m);

        return downPath+rightPath;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        
        System.out.print("Enter the number of rows: ");
        int n= sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int m= sc.nextInt();

        int totalPath= countPath(0, 0, n, m);
        System.out.println("Total paths= "+totalPath);
    }
}