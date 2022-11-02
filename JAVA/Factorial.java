import java.util.*;
public class Factorial {
    public static int calFact(int n){
        if(n==0 || n==1){
            return 1;
        }
        int fact_n=n*calFact(n-1);
        return fact_n;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();

        int fac=calFact(n);
        System.out.println("Factoria of "+n+" is: " +fac);
    }
}