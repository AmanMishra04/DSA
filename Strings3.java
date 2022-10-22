/* Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user. */

import java.util.*;
public class Strings3 {
    public static void main(String args[]){ 
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the email: ");
        String email=sc.next();
        String user="";

        for(int i=0; i<email.length(); i++){
            if(email.charAt(i)=='@'){
                break;
            }
            else{
                user+=email.charAt(i);
            }
        }
        System.out.println("Email: "+email);
        System.out.println("User_name: "+user);
    }
}
