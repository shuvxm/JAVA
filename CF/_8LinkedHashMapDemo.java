import java.util.LinkedHashMap;

public class _8LinkedHashMapDemo {
    public static void main(String[] args) {
        // linked list internally works as doubly linked list and LinkedHashMap also same
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>(11,0.8f,true);
        map.put(1, "Simo");
        map.put(2, "Shubham");
        map.put(3, "Anamika");
        map.put(3, "Anamika");

        // 2:46 (LRU cache)
    }
}
