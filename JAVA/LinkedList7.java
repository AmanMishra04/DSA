import java.util.*;

public class LinkedList7 {
    public static void main(String args[]){

        Scanner sc= new Scanner(System.in);
        LinkedList<Integer> list= new LinkedList<>();

        System.out.println("1. Insertion from First");
        System.out.println("2. Insertion from Last");
        System.out.println("3. Deletion from First");
        System.out.println("4. Deletion from Last");
        System.out.println("5. Traverse");

        while(true){
            System.out.println("Enter a choice: ");
            int choice = sc.nextInt();

            switch(choice){
                case 1:
                System.out.println("Enter the data: ");
                int data=sc.nextInt();
                list.addFirst(data);
                break;

                case 2:
                System.out.println("Enter the data: ");
                data =sc.nextInt();
                list.addLast(data);
                break;

                case 3:
                list.removeFirst();
                break;

                case 4:
                list.removeLast();
                break;

                case 5:
                System.out.println(list);
                break;

                default:
                System.exit(0);
            }
        }
        sc.close();
    }
}