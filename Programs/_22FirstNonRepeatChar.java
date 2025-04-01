/*
 * Finding first non repeated char in given string
 * Input: "AABCDBE"
 * 
 * 2 ways: 1) without collection framework(CF)
 *          2) by using CF
 */
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class _22FirstNonRepeatChar {
    public static void main(String[] args) {
        String input = "AABCDCBE";
        firstNonRepeatChar(input);
        uniquePrintChar1(input);
        uniquePrintChar2(input);
    }

    // 1. without CF
    private static void firstNonRepeatChar(String input) {
        for (int i = 0; i < input.length(); i++) {
            boolean unique = true;
            for (int j = 0; j < input.length(); j++) {
                if (i != j && input.charAt(i) == input.charAt(j)) {
                    unique = false;
                    break;
                }
            }
            if (unique) {
                System.out.println(input.charAt(i));
                break;
            }
        }
    }

    // 2. half done by using Set CF
    static void uniquePrintChar1(String input){
        Set<Character> set = new LinkedHashSet<>();

        for (int i = 0; i < input.length(); i++) {
            set.add(input.charAt(i));
        }
        System.out.println(set);
    }

    // 3. by using Map CF
    static void uniquePrintChar2(String input){
        Map<Character,Integer> maps = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if(maps.containsKey(ch)){
                maps.put(ch, maps.get(ch)+1);
            }
            else{
                maps.put(ch, 1);
            }    
        }
        System.out.println(maps);
        for(Entry<Character,Integer> entrySet: maps.entrySet()){
            if(entrySet.getValue() == 1){
                System.out.println(entrySet.getKey());
                break;
            }
        }
    }

}
