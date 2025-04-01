package OOPs;

class Sample1{
    void m1(){
        System.out.println("m1 of parent");
    }
    Sample1 display(){
        System.out.println("parent class");
        return new Sample1();
    }
}
class Sample2 extends Sample1{

    // return type changing in method overriding for only non-primitve data type
    @Override
    Sample2 display(){
        System.out.println("child class");
        return new Sample2();
    }

    @Override
    void m1(){
        System.out.println("m1 of child");
    }
}
public class Overriding {
    public static void main(String[] args) {
        Sample2 s = new Sample2();
        s.display();
        s.m1();
    }
}
