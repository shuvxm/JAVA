import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
class StringLengthComparator implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
      return o2.length() - o1.length();
    }
}

class MyComparator implements Comparator<Integer>{
    @Override
    public int compare(Integer o1, Integer o2){
        // return o1 - o2; // ascending order
        return o2 - o1; // descending order
    }
}

 */

public class _2ComparatorUse {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(50);
        list.add(10);
        list.add(80);

        // list.sort(new MyComparator());
        list.sort( (a,b) -> b - a); // lambda expression
        System.out.println(list);

        List<String> words = Arrays.asList("banana", "apple","date");
        // words.sort(new StringLengthComparator());
        words.sort( (a,b) -> a.length()-b.length());  // lambda expression
        System.out.println(words);
    }
}
