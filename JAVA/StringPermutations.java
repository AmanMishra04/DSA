import java.util.Scanner;
import java.util.*;

public class StringPermutations {

    public static void printPer(String str, String permutation){
        if(str.length()==0){
            System.out.println(permutation);
            return;
        }
        for(int i=0; i<str.length(); i++){
            char currChar=str.charAt(i);

            String newStr=str.substring(0, i)+str.substring(i+1);
            printPer(newStr, permutation+currChar);
        }
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str=sc.next();

        printPer(str, "");
    }
}
