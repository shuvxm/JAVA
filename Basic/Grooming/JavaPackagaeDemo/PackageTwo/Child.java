package Basic.Grooming.JavaPackagaeDemo.PackageTwo;

import Basic.Grooming.JavaPackagaeDemo.PackageOne.Parent;

public class Child extends Parent {
    public void display() {
        show(); // Accessing protected method
    }

    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
    }
}
