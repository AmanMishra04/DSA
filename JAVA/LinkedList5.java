/* Delete Nth node from the end */

public class LinkedList5 {
    static Node head;

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data= data;
            this.next=null;
        }
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


    //Finding and Deleting Nth Node from from last
    public Node removeNthFromEnd( Node head, int n){
        if(head==null){
            return null;
        }

        //Finding the size of the LinkedList
        int size=0;
        Node currNode= head;
        while(currNode!=null){
            currNode=currNode.next;
            size++;
        }
        if(size==n){
            return head.next;
        }

        //Finding prev index of the current Node
        int prevIndex=size-n;
        int i=1;

        //Finding previous Node
        Node prevNode=head;
        while(i!= prevIndex){
            prevNode=prevNode.next;
            i++;
        }

        //Deleting current Node
        prevNode.next= prevNode.next.next;
        return head;
    }

    
    public static void main(String args[]) {
        
        LinkedList5 list=new LinkedList5();
        
        list.insEnd(5);
        list.insEnd(10);
        list.insEnd(15);
        list.insEnd(20);
        
        list.traverse();

        list.removeNthFromEnd(head, 2);
        System.out.println("2nd Node from is deleted");
        list.traverse();
    }
}