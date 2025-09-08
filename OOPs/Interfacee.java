package OOPs;

interface A {
    default void m1() {
        System.out.println("from A interface");
    }
}

interface B {
    default void m1() {
        System.out.println("from A1 interface");
    }
}

public class Interfacee implements A, B {

    @Override
    public void m1() {
        // Resolving ambiguity manually
        A.super.m1(); // Calls A's implementation
        B.super.m1(); // Calls B's implementation
        System.out.println("from Interfacee class");
    }

    public static void main(String[] args) {
        Interfacee obj = new Interfacee();
        obj.m1();
    }

}
