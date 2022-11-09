public class LinkedList4 {
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
        Node fresh=new Node(data);
        if(head==null){
            head= fresh;
            return;
        }

        fresh.next= head;
        head= fresh;
    }


    //Insertion at the end
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


    //Printing the list
    public void traverse(){
        if(head==null){
            System.out.println("No data in the list");
        }

        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    //Reverse the Linked List
    public Node reverseRecursive(Node head){
        
        if(head==null || head.next==null){
            return head;
        }
        
        Node newHead= reverseRecursive(head.next);
        head.next.next = head;
        head.next=null;

        return newHead;
    }

    public static void main(String args[]) {
        
        LinkedList4 list=new LinkedList4();
        
        list.insEnd(5);
        list.insEnd(10);
        list.insEnd(15);
        list.insEnd(20);

        System.out.println("Original LinkedList: ");
        list.traverse();

        list.head= list.reverseRecursive(list.head);
        
        System.out.println("Reversed LinkedList: ");
        list.traverse();
        
    }
}