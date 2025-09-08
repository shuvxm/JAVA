
class Dummy {
    void study() {
        System.out.println("eng");
    }

}

class Child extends Dummy {

    void study(int a) {
        System.out.println("disc");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Child c1 = new Child();
        c1.study();
        c1.study(0);
    }
}
