package LinkedListPrograms;

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data=data;
        next=null;
    }


}
public class LinkedList {
    
    Node head = null; 

    public void add(int data){

        Node newNode = new Node(data);

        Node current = head;

        // make the head to the first node if it's empty
        if(head == null)
            head = newNode;
        else {
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void printValues(){
        Node current = head;

        while (current != null) {
            System.out.print(current.data+" ");
            current=current.next;
        }
        System.out.println();
    }

    // Add node at the beginning
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head; // pehle waale head ko newNode ka next banate hain
        head = newNode;     // head ko update karte hain
    }

    public void delete(int data){
        Node current = head;
        while (current.next != null && current.next.data != data) {
            current = current.next;
        }
        if (current.next != null) {
            current.next = current.next.next;
        }
    }
    public void addLast(int data){
        
    }
}
