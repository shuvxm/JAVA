import java.util.LinkedList;

public class _3LinkedLists {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        // System.out.println(linkedList.get(2));  // O(n)
        // System.out.println(linkedList);

        linkedList.addFirst(60);
        linkedList.addLast(80);
        System.out.println(linkedList);
        // linkedList.remove(4);
        // System.out.println(linkedList);
        linkedList.removeIf( x -> x%2 == 0);
        System.out.println(linkedList);
    }
}
