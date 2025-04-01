package OOPs;

class Programmer {
    private String name;

    public Programmer(String name){
        this.name = name;
    }

    // getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}

public class Encapsulation {
    public static void main(String[] args) {
        System.out.println("helo");

        Programmer p = new Programmer("xyz");
        System.out.println(p.getName());
        p.setName("Simoga");
        System.out.println(p.getName());
        
    }
}