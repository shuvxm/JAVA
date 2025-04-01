package OOPs;

import java.util.LinkedList;

class Parent {
    private void display() {
        System.out.println("Parent method");
    }
}

class Child extends Parent {
    // @Override
    void display() {
        System.out.println("Child method");
    }
}

public class Test1 {
    public static void main(String[] args) {
        // Child obj = new Child();
        // obj.display(); // Compilation error

        // Character.isWhitespace(0);

        String str = "abc ABC 123 abc";
        System.out.println(str.replace("a", "")); // replace a with nothing
        System.out.println(str.replace(" ", "")); // replace space

        String str1 = "hello";
        // The replace method returns a new string with the modifications, it does not
        // change the original string.
        // To see the modified string, we need to store the result in a variable or use
        // it directly.
        // str1 = str1.replace("hello", "hi");
        // System.out.println(str1); // "hi"
        System.out.println(str1.replace("hello", "hi"));

        LinkedList<Integer> ll = new LinkedList<>();

        ll.add(1);
        ll.add(2);
        ll.add(3);

        System.out.println(ll);

        LinkedList<Integer> ll1 = new LinkedList<>();

        ll.descendingIterator().forEachRemaining(ll1::add);

        System.out.println(ll1);
    }
}

// str1.replace("hello", "hi") creates a new string "hi".
// Since replace() returns a new String, it is immediately passed to
// System.out.println().
