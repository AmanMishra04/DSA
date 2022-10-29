import java.util.Scanner;

public class Delete_Duplicate {
    public static boolean map[]=new boolean[26];

    public static void delete(String str, int index, String newString){

        if(index==str.length()){
            System.out.println("Modified string is: "+newString);
            return;
        }
        char current=str.charAt(index);
        if(map[current-'a']){
            delete(str, index+1, newString);
        }
        else{
            newString+=current;
            map[current-'a']=true;
            delete(str, index+1, newString);
        }
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str=sc.next();

        delete(str, 0, "");
    }
}
