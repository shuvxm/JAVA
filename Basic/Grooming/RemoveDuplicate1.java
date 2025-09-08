package Basic.Grooming;

public class RemoveDuplicate1 {
    public static void main(String[] args) {
        String str = "banana";
        String result = "";
        String unique = "";

        while (str.length() > 0) {
            char ch = str.charAt(0);
            result = str.replace(ch + "", "");
            unique += ch;
            str = result;
        }
        System.out.println(unique);
    }
}
