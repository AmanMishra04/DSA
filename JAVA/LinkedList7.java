import java.util.*;

public class LinkedList7 {
    public static void main(String args[]){

        Scanner sc= new Scanner(System.in);
        LinkedList<Integer> list= new LinkedList<>();

        System.out.print("Enter the numner of elements: ");
        int n= sc.nextInt();

        System.out.print("Enter the elements: ");
        while(n>0){
            int element=sc.nextInt();
            list.add(element);
            n--;
        }

        System.out.println(list);

    }
}