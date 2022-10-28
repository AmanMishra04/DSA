import java.util.Scanner;
public class Tower_Of_Hanoi{

    public static void Tower(int n, String src, String help, String dest){

        if(n==1){
            System.out.println("Tranfer disc "+n+" from "+src+" to "+dest);
            return;
        }
        Tower(n-1, src, dest, help);
        System.out.println("Tranfer disc "+n+" from "+src+" to "+dest);
        Tower(n-1, help, src, dest);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n=sc.nextInt();

        Tower(n, "S", "H", "D");
    }
}