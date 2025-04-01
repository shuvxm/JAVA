public class _18RemoveAllWhiteSpace {
    public static void main(String[] args) {
        String str = "  j  a va   s   ta   r";

        // trim() method is used to trim all leading and trailing spaces only but not in between
//        String trimStr = str.trim();

/*
\\s in Java is a regular expression (regex) pattern that matches any whitespace character
 */
        // Remove all whitespace characters
        String str1 = str.replaceAll("\\s","");
        System.out.println(str1);
    }
}
