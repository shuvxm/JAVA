/*
input: hello
output: olleh
 */
public class _15ReverseString {
    public static void main(String[] args) {

        String str = "hello";
        reverseString5(str);
    }

    // 5.
    private static void reverseString5(String str) {
        String nstr = "";
        char ch;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            nstr = ch + nstr;
        }
        System.out.println(nstr);
    }

    // 4. by using reverse method so first convert string into StringBuilder
    private static void reverseString4(String str) {
        StringBuilder sbuilder = new StringBuilder(str);
        System.out.println(sbuilder.reverse());
    }

    // 3. by using reverse method so first convert string into StringBuffer
    private static void reverseString3(String str) {
        StringBuffer sb = new StringBuffer(str);
        System.out.println(sb.reverse());
    }

    // 2. by using charAt() method
    private static void reverseString2(String str) {
        for (int i = str.length() - 1; i >= 0 ; i--) {
            System.out.print(str.charAt(i));
        }
    }

    // 1: by using toCharArray() method
    private static void reverseString1(String str) {
        char[] charArray= str.toCharArray(); // this method used to convert string to character Array

        for (int i = charArray.length - 1; i >= 0; i--) {
            System.out.print(charArray[i]);
        }
    }
}
