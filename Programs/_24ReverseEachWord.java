/*
 * Reverse Each word:-
 * input: "java code"
 * output: "avaj edoc"
 */

import java.util.Arrays;

public class _24ReverseEachWord {
    public static void main(String[] args) {
        // String input = "java code";
        String input = "Java is good programming langauges";
        System.out.println("Original input: "+input);
        reverseEach(input);
    }
    private static void reverseEach(String input){
        String output = "";
        String[] words = input.split(" ");
        // System.out.println(Arrays.toString(words));
        for (String word : words) {
            String reversedWord = "";
            for (int i = word.length() -1; i>=0; i--) {
                reversedWord += word.charAt(i);
            }
            output = output + reversedWord +" ";
        }
        System.out.println("Reversed input: "+output);
    }
}
