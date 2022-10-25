import java.util.*;
public class ClearBit {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n =sc.nextInt();

        System.out.print("Enter the position: ");
        int pos= sc.nextInt();

        int bitMask= 1<<pos;

        int notBitMask= ~(bitMask);
        int newNum= notBitMask & n;
        
        System.out.println("New number becomes: "+newNum);
    }
}