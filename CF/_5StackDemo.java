import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class _5StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack);
        Integer removedElement = stack.pop();
        System.out.println(stack);


        // linkedlist as stack bcz linkedlist is non synchronized but stack is synchronized
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.addLast(3);
        linkedList.addLast(4);
        linkedList.getLast(); // works as peek (stack)
        linkedList.removeLast();  // pop

        linkedList.size();

        // not recommended
        // ArrayList<Integer> arrayList = new ArrayList<>();
        // arrayList.add(1);  
        // arrayList.add(2);
        // arrayList.add(3);
        // arrayList.get(arrayList.size() - 1); // peek
        // arrayList.remove(arrayList.size() - 1); // pop



    }
}
