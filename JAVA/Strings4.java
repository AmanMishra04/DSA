import java.util.*;

public class Strings4{
    public static void printRev(String str, int index){
        if(index<0){
            return;
        }
        System.out.print(str.charAt(index));
        printRev(str, index-1);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str= sc.next();
        System.out.print("Reverse of the String: ");
        printRev(str, str.length()-1);
    }
}