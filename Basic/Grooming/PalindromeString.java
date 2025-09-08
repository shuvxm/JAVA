package Basic.Grooming;

/*
uses == to compare two String objects, which in Java checks for reference
equality, not the content of the strings. This means even if the contents are
the same, == may return false because they're two different objects in memory.
You should use .equals() for content comparison: */
public class PalindromeString {
    public static void main(String[] args) {
        String s = "naman";
        String reverese = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            reverese = reverese + s.charAt(i);
        }
        System.out.println(s.equals(reverese));

        // boolean flag;
        // if (s.equals(reverese)) {
        // flag = true;
        // } else
        // flag = false;
        // System.out.println(flag);
    }
}
