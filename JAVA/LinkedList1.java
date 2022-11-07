public class LinkedList1 {
    static Node head;
    
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
    public static void insEnd(int data){
        Node newNode = new Node(data);
        if(head==null){
            head= newNode;
            return;
        }

        Node lastNode=head;
        while(lastNode.next!=null){
            lastNode=lastNode.next;
        }
        lastNode.next=newNode;

    }

    public void traverse(){
        if(head==null){
            System.out.println("No data in the list");
        }

        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+" ");
            currNode=currNode.next;
        }

        System.out.println("NULL");
    }

    public static void main(String args[]) {
        
        LinkedList1 list=new LinkedList1();
        list.insBeg(5);
        list.insBeg(10);
        list.insBeg(15);
 
        list.traverse();
    }
}