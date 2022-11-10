import java.util.*;
public class LinkedList6 {
    static Node head;
    
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

        //Inertion from beginning
        public void insBeg(int data){
            Node fresh = new Node(data);
            
            if(head==null){
                head=fresh;                
            }

            fresh.next=head;
            head=fresh;
        }

        //Insertion from end
        public void insEnd(int data){
            Node fresh= new Node(data);
            if(head==null){
                head=fresh;
                return;
            }
    
            Node temp=head;
            while(temp.next!=null){
                temp= temp.next;
            }
            temp.next=fresh;
        }

        //Deletion from beginning
        public void delBeg(){
            if(head==null){
                System.out.println("No data in the list");
            }
            
            if(head.next==null){
            head=null;
            }
            
            head=head.next;
            System.out.println("Deleted from beginning");
        }

        //Deletion from end
        public void delEnd(){
            if(head==null){
                System.out.println("No data in the list");
            }
            
            if(head.next==null){
            head=null;
            }

            Node temp=head;
            Node temp1=head;

            while(temp.next!=null){
                temp=temp.next;
            }
            while(temp1.next!=temp){
                temp1=temp1.next;
            }

            temp1.next=null;
            System.out.println("Deleted from end");
        }

        //Printing the List
        public void traverse(){
            Node temp=head;
            while(temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
        }


    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        LinkedList6 list= new LinkedList6();

        while(true){
            System.out.print("Enter a choice: ");
            int choice= sc.nextInt();

            switch(choice){ 
                case 1:
                System.out.print("Enter the data: ");
                int data= sc.nextInt();
                list.insBeg(data);
                break;
                
                case 2:
                System.out.print("Enter the data: ");
                data= sc.nextInt();
                list.insEnd(data);
                break;

                case 3:
                list.delBeg();
                break;

                case 4:
                list.delEnd();
                break;

                case 5:
                list.traverse();

                default:
                System.exit(0);

            }
        }
    }
}