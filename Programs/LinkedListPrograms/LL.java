package LinkedListPrograms;

// LL = LinkedList
public class LL {
    
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

    public void insertLast(int data){

        if (tail == null) {
            insertFirst(data);
            return;
        }
        Node node = new Node(data);
        tail.next = node;
        tail = node;
        // if (tail == null) {
        //     tail = node.next;
        // }
        size +=1;
    }

    public void insert(int data, int index){

        if (head == null) {
            insertFirst(data);
            return;
        }
        if (index == size) {
            insertLast(data);
            return;
        }

        Node temp = head;
        for(int i=1; i< index;i++){
            temp = temp.next;
        }
        Node node = new Node(data,temp.next);
        temp.next=node;
        size++;
    }

    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public int deleteFirst(){
        int data = head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return data;    
    }

    public int deleteLast(){
        if (size <= 1) {
            return deleteFirst();
        }
        Node secondLast = get(size - 2);
        int data = tail.data;
        tail = secondLast;
        tail.next = null;
        return data;
    }

    public void display(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }


 
}
