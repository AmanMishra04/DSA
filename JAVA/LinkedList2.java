import java.util.*;

public class LinkedList2 {
    public static void main(String args[]){

        LinkedList<Integer> list= new LinkedList<>();

        //Add from first
        System.out.println("Add from first: ");
        list.addFirst(10);
        list.addFirst(5);
        System.out.println(list);


        //Add from first
        System.out.println("Add from end: ");
        list.addLast(15);
        list.addLast(20);
        System.out.println(list);


        //Remove from first
        list.removeFirst();
        System.out.println("Removed from first");
        System.out.println(list);


        //Remove from last
        list.removeLast();
        System.out.println("Removed from last");
        System.out.println(list);


        //Get Function
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}