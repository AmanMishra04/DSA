import java.util.Scanner;
import java.util.ArrayList;

public class ArrayList2 {
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<Integer>();

        System.out.print("Enter the size of ArrayList: ");
        int n= sc.nextInt();

        //Adding element at the end of the ArrayList using add function
        System.out.println("Enter the elements: ");
        for(int i=0; i<n; i++){
            int element=sc.nextInt();
            list.add(element);
        }

        //Getting element and print the ArrayList using get function
        System.out.println("Elements in the ArrayList are: ");
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

        //Add element at a given index
        System.out.print("Enter the index to add: ");
        int index=sc.nextInt();
        System.out.print("Enter the element to add: ");
        int element=sc.nextInt();
        list.add(index, element);

        System.out.println("Elements in the ArrayList are: ");
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

        //Updating the element using set funtion
        System.out.print("Enter the index to set: ");
        int setidx= sc.nextInt();
        System.out.print("Enter the element to set: ");
        int setele=sc.nextInt();
        list.set(setidx, setele);

        System.out.println("Elements in the ArrayList are: ");
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }
}