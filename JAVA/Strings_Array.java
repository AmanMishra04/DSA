import java.util.*;
class Strings_Array{
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        int total=0;

        System.out.print("Enter the numebr of elements: ");
        int n= sc.nextInt();
        String array[]=new String[n];

        System.out.println("Enter the Strings: ");
        for (int i=0; i<n; i++){
            array[i]=sc.next();
            total+= array[i].length();
        }

        System.out.println("Total length is: "+total);
    }
}