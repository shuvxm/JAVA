package Basic.Grooming;

// abstract interface Honda {
//     int price = 1000;
// }
// OR both same. Every interface in Java is implicitly abstract whether you specify it or not.
// interface Honda {
//     int price = 1000;
// }

class A {
    int a = 10;
}

class Demo {
    {
        System.out.println("Instance Initializer Block");
    }

    static {
        System.out.println("Static Initializer Block");
    }
}

// class Test {
// // not possible
// private {
// System.out.println("Invalid initializer block");
// }
// }
class Test {

    {
        System.out.println("Valid instance initializer block");
    }

    static {
        System.out.println("Valid static initializer block");
    }

    public static void main(String[] args) {
        // new Test(); // if we dont create obj, then only static block execute
    }
}

public class InitializerBlock {

    private InitializerBlock() {
        int a = 10;
        System.out.println(a);
    }

    {
        System.out.println("Valid instance initializer block");
    }

    static {
        System.out.println("Valid static initializer block");
    }

    public static void main(String[] args) {
        new InitializerBlock();
    }
}

// public class AccessModfier {

// }
