/* Find occurence of each character in given string
    * Input: "hello"
    * Output: h=1, e=1, l=2, o=1
 */

import java.util.HashMap;
import java.util.Map;

public class _23CharacterOccurence {
    public static void main(String[] args) {
        // String input = "hello";
        String input = "aaheallolo";
        findOccurence(input);
    }

    private static void findOccurence(String input) {
        Map<Character,Integer> maps = new HashMap<>(); 

        char[] chArray = input.toCharArray();
        for (char c : chArray) {
            if ( !maps.containsKey(c)) {
                maps.put(c, 1);
            }else{
                int count = maps.get(c);
                maps.put(c, count+1);
            }
        }
        System.out.println(maps);
    }

}
