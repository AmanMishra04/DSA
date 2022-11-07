import java.util.Currency;

public class LinkedList1 {
    Node head;
    
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data= data;
            this.next=null;
        }
    }

    //Insertion at the beginning
    public void insBeg(int data){
        Node newNode=new Node(data);
        if(head==null){
            head= newNode;
            return;
        }

        newNode.next= head;
        head= newNode;
    }

    //Insertion at the end
    public void insEnd(int data){
        Node newNode= new Node(data);
        if(head==null){
            head=newNode;
            return;
        }

        Node currNode=head;
        while(currNode.next!=null){
            currNode= currNode.next;
        }
        currNode.next=newNode;
    }
    
    //Printing the list
    public void traverse(){
        if(head==null){
            System.out.println("No data in the list");
        }

        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+" ");
            currNode=currNode.next;
        }
    }

    public static void main(String args[]) {
        
        LinkedList1 list=new LinkedList1();
        list.insBeg(10);
        list.insEnd(15);
        list.insBeg(5);
        list.insEnd(20);

        list.traverse();
    }
}