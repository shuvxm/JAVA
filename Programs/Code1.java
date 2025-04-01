import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class StringLengthComparator implements Comparator<String>{

    @Override
    public int compare(String s1, String s2) {
    //   return s1.length() - s2.length(); // length wise ascending
      return s2.length() - s1.length();  // length wise descending
    } 
}

class IntegerComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
    //    return o1 - o2; // for ascending order
        return o2 - o1; // for descending print 
    }
    
}
public class Code1{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(5);

        list.sort(new IntegerComparator());
        // System.out.println(list);

        List<String> words = Arrays.asList("banana","date","apple");
        words.sort(new StringLengthComparator());
        System.out.println(words);

    }
    
}