package Basic.Grooming;

// swap 2 string without temp variable
public class Panagram {
    public static void main(String[] args) {
        String s1 = "the quick brown fox jumps over the lazy dog";
        System.out.println(isPanagram(s1) ? "panagram" : " not a panagram");
    }

    static boolean isPanagram(String s1) {
        s1 = s1.toLowerCase();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (s1.indexOf(ch) == -1)
                return false;
        }
        return true;
    }
}
/*
 * if (s1.charAt(0) == 'a' || s1.charAt(1) == 'b' ||
 * s1.charAt(2) == 'c' || s1.charAt(3) == 'd' || s1.charAt(4) == 'e' ||
 * s1.charAt(5) == 'c'
 * || s1.charAt(3) == 'd' || s1.charAt(4) == 'e') {
 * 
 * }
 */