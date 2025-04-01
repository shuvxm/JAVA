package OOPs;

class GrandParent{
    String name = "Anil";
    private int age = 50;
}

class Parent extends GrandParent{
    String name = "pushpa";
    int age = 35;

    void displayGrandParent(){
        System.out.println("GrandParent's info: "+super.name + " " + super.age);
        displayParent();
    }
    void displayParent(){
        System.out.println("Parent's info: "+name +", "+age);
    }
}
public class Super {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.displayGrandParent();
    }
}
