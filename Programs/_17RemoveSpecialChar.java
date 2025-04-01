public class _17RemoveSpecialChar {
    public static void main(String[] args) {
        String str = "$ja!va$&st%ar0";

        // replaceAll() method
        String plainstr = str.replaceAll("[^a-zA0-9]","");
        System.out.println(plainstr);
    }
}
