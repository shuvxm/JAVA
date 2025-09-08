package Basic.Grooming;

public class Swap2String {
    public static void main(String[] args) {
        String s1 = "java";
        String s2 = "program";

        // 1st logic
        // String temp = s1;
        // s1 = s2;
        // s2 = temp;

        // 2nd logic
        s1 = s1 + s2; // s1 = "javaprogram"
        // Extract original s1 (i.e. first part)
        s2 = s1.substring(0, s1.length() - s2.length()); // s2 = "java"
        // Extract original s2 (second part) : begin index start from s2 length to pura
        s1 = s1.substring(s2.length());

        System.out.println("After swappping");
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);

    }
}
