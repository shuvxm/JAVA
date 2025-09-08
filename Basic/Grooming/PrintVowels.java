package Basic.Grooming;

public class PrintVowels {
    public static void main(String[] args) {
        String s = "shubham";
        printVowe1(s);

        int i = 0, j = s.length() - 1;
        while (i <= j) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' ||
                    s.charAt(i) == 'o'
                    || s.charAt(i) == 'u') {
                System.out.println(s.charAt(i));
            }
            i++;
        }
    }

    static void printVowe1(String s) {
        char[] ch = s.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' ||
                    ch[i] == 'o' || ch[i] == 'u') {
                System.out.println("Vowel found: " + ch[i]);
            }
        }
    }

}
