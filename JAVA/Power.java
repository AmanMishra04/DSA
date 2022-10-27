import java.net.SocketTimeoutException;
import java.util.*;
public class Power {

    public static int calPower(int x, int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        //n is even
        if(n%2==0){
            return calPower(x, n/2)*calPower(x, n/2);
        }
        else{
            return calPower(x, n/2)*calPower(x, n/2)*x;
        }
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the value of x: ");
        int x=sc.nextInt();

        System.out.print("Enter the value of n:");
        int n=sc.nextInt();

        int power=calPower(x,n);
        System.out.println(x+" to the power "+n+" is: "+power);
    }
}