// Find the first and last occurance of an element in a String.

import java.util.*;

public class First_Last_Occurance {
    public static int first=-1;
    public static int last=-1;

    public static void find(String str, int index, char element){
        if(index==str.length()){
            System.out.println("First occurance at: "+first);
            System.out.println("Last occurance at: "+last);
            return;
        }
        if(str.charAt(index)==element){
            if(first==-1){
                first=index;
            }
            else{
                last=index;
            }
        }
        find(str, index+1, element);
    }

    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter the String: ");
        String str=sc.next();

        System.out.println("Enter the element to find: ");
        char element= sc.next().charAt(0);

        find(str, 0, element);
    }
}