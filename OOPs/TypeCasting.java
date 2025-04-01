package OOPs;

class Test {
    void m1() {
        System.out.println("m1 in parent");
    }

    void m2() {
        System.out.println("m2 in parent");
    }
}

class TestDemo extends Test {
    void m3() {
        System.out.println("m3 in child");
    }

    void m4() {
        System.out.println("m4 in child");
    }

    // in typecasting: we can access parent class properties (methods) & get the
    // implementation of child class 
    @Override
    void m1() {
        System.out.println("m1 in child");
    }
}

public class TypeCasting {
    public static void main(String[] args) {
        Test t = new TestDemo();  // upcasting
        t.m1();
        t.m2();
        // t.m3();  // for access subclass properties (bcz already done upcasting) we need to downcast
        // t.m4();

        TestDemo td = (TestDemo) t;  // downcasting
        td.m3();
        td.m4();
        td.m1();
        td.m2();

        System.out.println(td instanceof TestDemo);
    }
}
