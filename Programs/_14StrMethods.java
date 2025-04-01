public class _14StrMethods{
    public static void main(String[] args) {
        String str = "Hello";
        // char result = str.charAt(0); // return H
        int result = str.codePointAt(0); // 72-> H unicode asci

        System.out.println(result);

        System.out.println(Math.abs(-3.677));
    }
}