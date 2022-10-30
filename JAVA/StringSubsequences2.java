import java.util.*;

public class StringSubsequences2 {
    public static void printSequence(String str, int index, String newString, HashSet<String> set){

        if(index==str.length()){
            if(set.contains(newString)){
                return;
            }
            else{
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char currChar= str.charAt(index);

        //to be added
        printSequence(str, index+1, newString+currChar, set);

        //not to be added
        printSequence(str, index+1, newString, set);
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the string:");
        String str=sc.next();
        HashSet<String> set= new HashSet<>();

        printSequence(str, 0, "", set);
    }
}
