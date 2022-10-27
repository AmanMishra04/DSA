import java.util.*;

public class naturalSum {

    public static int printSum(int i, int n){
        if(i>n){
            return 0;
        }
        int sum=0;
        sum+=i+printSum(i+1, n);
        return sum;
    }
    
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int n=sc.nextInt();

        int x=printSum(1,n);
        System.out.print("Sum of the numbers is: "+x);
    }
}