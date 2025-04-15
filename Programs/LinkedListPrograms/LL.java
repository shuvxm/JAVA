package LinkedListPrograms;

public class LL {
    
    private Node head;
    private Node tail;
    private int size;

    public LL(){
        this.size=0;
    }

    public void insertFirst(int data){
        Node node = new Node(data);
        node.next = head;
        head = node;

        if(tail ==null){
            tail=head;
        }
        size += 1;
    }
    public void printValues(){
        
    }


    private class Node{

        private int data;
        private Node next;

        public Node(int data){
            this.data=data;
        }
        public Node(int data,Node next){
            this.data=data;
            this.next=next;
        }
    }
}
