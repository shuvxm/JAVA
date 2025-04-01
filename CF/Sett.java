import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sett {
    public static void main(String[] args) {
        Set<Object> set = new LinkedHashSet<>();
        set.add(10);
        set.add(20);
        set.add("hetrogenous");
        set.add(null); // accepts null value

        // System.out.println(set);

        TreeSet<Object> ts = new TreeSet<>();
        ts.add(11);
        ts.add(22);
        // ts.add("set"); // gives classCastException bcz we are storing hetrogenous data in TreeSet
        // ts.add(null); // gives NullPointerException bcz your storing null in treeset (not allowed)
        // System.out.println(ts);
        m1();
    }

    static void m1(){
        TreeSet<Integer> t = new TreeSet<>();
        t.add(101);
        t.add(100);
        t.add(104);
        t.add(103);

        System.out.println(t);
    }
}
