package LinkedListPrograms;

public class LLMain {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(8);
        list.insertFirst(17);        
        list.insertFirst(27);        
        list.insertFirst(10);

        list.insertLast(99);
        list.insert(65, 4);

        list.display();
    }
    
}
