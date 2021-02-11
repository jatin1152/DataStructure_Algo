package linkedlist.singlylinkedlist;

public class singlyLinkedList {
    Node head;
    public singlyLinkedList(){
        head = null;
    }

    //Insert A Node
    public void insert(Node newnode){
        if(head == newnode){
            head = newnode;
        }
        else{
            Node temp = head;
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = newnode;
        }
    }

    //Traversing or Printing
    public void traverseLinkedList(){
        Node temp = head;
        while(temp.next != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println(); //For next Line after completing the loop
    }
}