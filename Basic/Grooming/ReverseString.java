package Basic.Grooming;

/* 
1. check given string is palindrome
2. swap two string using 3rd variable e.g s1="java", s2="program"
3. to print vowels in a name
4. count how many alphabets , special chars, numbers present from string.eg:s="java@123"
5. to remove special chars and numbers, print only alphabets from that string
*/
public class ReverseString {
    public static void main(String[] args) {
        String s = "java";
        reverse(s);
        char[] ch = s.toCharArray();

        int start = 0, end = s.length() - 1;
        while (start < end) {
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;

            start++;
            end--;
        }
        // System.out.println(ch); // print reversed character array directly

        // convert the reversed character array back to a string
        // String s2 = new String(ch);
        // System.out.println(s2);
        // System.out.println(new String(ch)); // slighlt memory benefit by not storing
        // intemediate result if not needed
        // and eliminated extra variable

    }

    static void reverse(String str) {
        StringBuilder sb = new StringBuilder(str);
        // .reverse() returns a StringBuilder object, .toString() convert the
        // StringBuilder to string
        System.out.println(sb.reverse().toString()); // sopln expects string not stringbuilder
        System.out.println("h------------");
    }
}
