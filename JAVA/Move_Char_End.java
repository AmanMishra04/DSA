import java.util.*;

public class Move_Char_End {
    public static void moveX(String str, char ch, int index, int count, String newString){
        if(index==str.length()){
            for(int i=0; i<count; i++){
                newString+=ch;
            }
            System.out.println("New string is: "+newString);
            return;
        }
        char current=str.charAt(index);
        if(current== ch){
            count++;
            moveX(str, ch, index+1, count, newString);
        }
        else{
            newString+=current;
            moveX(str, ch, index+1, count, newString);
        }
    }
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str=sc.next();
        System.out.print("Enter the character you want to move at the end: ");
        char ch=sc.next().charAt(0);
        moveX(str, ch, 0, 0, "");
    }
}
