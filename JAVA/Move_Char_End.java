import java.util.*;

public class Move_Char_End {
    public static void moveX(String str, int index, int count, String newString){
        if(index==str.length()){
            for(int i=0; i<count; i++){
                newString+='x';
            }
            System.out.println("New string is: "+newString);
            return;
        }
        char current=str.charAt(index);
        if(current== 'x'){
            count++;
            moveX(str, index+1, count, newString);
        }
        else{
            newString+=current;
            moveX(str, index+1, count, newString);
        }
    }
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str=sc.next();
        moveX(str, 0, 0, "");
    }
}
