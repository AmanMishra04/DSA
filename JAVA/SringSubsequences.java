import java.util.*;
public class SringSubsequences {
    public static void printSequence(String str, int index, String newString){

        if(index==str.length()){
            System.out.println(newString);
            return;
        }
        char currChar=str.charAt(index);

        //to be
        printSequence(str, index+1, newString+currChar);

        //not to be
        printSequence(str, index+1, newString);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str=sc.next();
        System.out.println("Subsequences are: ");
        printSequence(str, 0, "");
    }
}
