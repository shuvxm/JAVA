package LinkedListPrograms;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(5);
        list.add(9);
        list.add(3);
       
        list.addFirst(7);
        System.out.println("Original List:");
        list.printValues();
        
        list.delete(9);
        System.out.println("after deleting List:");
        list.printValues();

        // System.out.println("Reversed List:");
        // list.reverse();
        // list.printList();
    }
}
