import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaExp {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(5);

        list.sort((a, b) -> a-b); // for ascending by lambda
        // list.sort((a, b) -> b-a); // for descending by lambda
        // System.out.println(list);

        List<String> words = Arrays.asList("banana","date","apple");
        // words.sort((a, b) -> a.length() - b.length());  // for ascending by lambda
        words.sort((a, b) -> b.length() - a.length());  // for descending by lambda
        System.out.println(words);
    }
    
}
