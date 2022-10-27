import java.util.*;

public class naturalSum {

    public static void printSum(int i, int n, int sum){
        if(i==n){
            sum+=i;
            System.out.println("Sum of the numbers is: "+sum);
            return;
        }
        sum+=i;
        printSum(i+1, n, sum);
    }
    
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int n=sc.nextInt();

        printSum(1, n, 0);
    }
}
