import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class _7Map {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Simo");
        map.put(2, "Shubham");
        map.put(3, "Anamikaoo");
        System.out.println(map);
        System.out.println(map.containsKey(2)); // true

        // only value will get from this
       for(int i : map.keySet()){
        System.out.println(map.get(i));
       }

       // both key & value want
       Set<Map.Entry<Integer, String>> entries = map.entrySet();
       for( Entry<Integer, String> entry: entries){
            System.out.println(entry.getKey() +" : "+ entry.getValue());
       }


    }
}
