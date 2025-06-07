class Demo{
    
    static void mul(){
        System.out.println("Mul");

    }
}
public class Methods{

    public static void main(String[] args) {
        System.out.println("hello");

        // creation of obj
        Methods method = new Methods();

        method.add(5,6);
        method.sub();

        // sub();

        // Demo d = new Demo();
        Demo.mul();
        
    }

    // parametrized
    public void add(int a, int b){
        // a= 5; b=6;
        int result = a+b;
        System.out.println(result);

       
    }
    // non parametrized
    public  void sub(){
        int a =6, b=5;
        int result = a-b;
        System.out.println(result);
    }

}