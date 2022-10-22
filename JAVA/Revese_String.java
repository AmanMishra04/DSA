/* Print the reverse of a String */

import java.util.*;
public class Revese_String {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the string: ");
        StringBuilder sb= new StringBuilder("");
        sb= sb.append(sc.next());

        for(int i=0; i<sb.length()/2; i++){
            
            int front=i;
            int end=sb.length()-i-1;

            char frontChar=sb.charAt(front);
            char endChar=sb.charAt(end);

            sb.setCharAt(front, endChar);
            sb.setCharAt(end, frontChar);  
        }
        System.out.println(sb);
    }    
}