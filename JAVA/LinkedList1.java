public class LinkedList1 {
    static Node head;
    private static int size;

    LinkedList1(){
        this.size=0;
    }

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data= data;
            this.next=null;
            size++;
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


    //Deletion from the beginning
    public static void delBeg(){
        if(head==null){
            System.out.println("No data in the list");
        }

        head=head.next;
        size--;
        System.out.println("Deleted from beginning");
    }


    //Deletion from the end
    public static void delEnd(){
        if(head==null){
            System.out.println("No data in the list");
        }

        size--;
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


    //Size of the Linked List
    public int getSize(){
        return size;
    }

    
    public static void main(String args[]) {
        
        LinkedList1 list=new LinkedList1();
        
        list.insBeg(10);
        list.insEnd(15);
        list.insBeg(5);
        list.insEnd(20);
        list.traverse();

        list.delBeg();
        list.traverse();
        list.delEnd();
        list.traverse();

        System.out.println("Size of the list is: "+list.getSize());
    }
}