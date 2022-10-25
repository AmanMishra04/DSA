import java.util.*;
public class UpdateBit {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n =sc.nextInt();

        System.out.print("Enter the position: ");
        int pos= sc.nextInt();

        System.out.print("Enter 1 for set and 0 for clear: ");
        int op= sc.nextInt();

        int bitMask= 1<<pos;

        if(op==1){
            int newNum= (bitMask | n);
            System.out.println("New number is: "+newNum);            
        }
        else{
            int notBitMask= ~(bitMask);
            int newNum= (notBitMask & n);
            System.out.println("New number is: "+newNum);
        }
    }
}