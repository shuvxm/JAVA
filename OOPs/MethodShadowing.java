package OOPs;

class S{
    public static void m1(){
        System.out.println("m1 in parent class");
    }
}
class T extends S{
    public static void m1(){
        System.out.println("m1 in child class");
    }
}
public class MethodShadowing {
    public static void main(String[] args) {
        S s = new T();
        s.m1();
    }
}
