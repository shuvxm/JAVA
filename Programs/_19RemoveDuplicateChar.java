import java.util.LinkedHashSet;
import java.util.Set;

public class _19RemoveDuplicateChar {
    public static void main(String[] args) {
        String str = "programming";

        removeDupChar1(str);
        removeDupChar2(str);
        removeDupChar3(str);
        removeDupChar4(str);
    }

    // 1. by usingdistinct() method in  Java8
    static void removeDupChar1(String str){
        StringBuilder sb1 = new StringBuilder();
        str.chars().distinct().forEach(c -> sb1.append((char)c));
        System.out.println(sb1);
    }

    // 2. by using indexOf() method
    static void removeDupChar2(String str){
        StringBuffer sb1 = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // The indexOf method is used to find the index of the first occurrence of the character ch after the current position i. If the character ch is not found again, indexOf returns -1.
            int indx = str.indexOf(ch, i+1);
            // If the character ch does not occur again in the rest of the string (indx == -1), it is appended to the StringBuffer object sb1.
            if(indx == -1)
                sb1.append(ch);
        }
        System.out.println(sb1);
    }

    // 3. by converting string to char array
    static void removeDupChar3(String str){
        char[] chArr =str.toCharArray();
        StringBuilder sb1 = new StringBuilder();
        for (int i = 0; i < chArr.length; i++) {
            boolean repeated = false;
            for (int j = i+1; j < chArr.length; j++) {
                if(chArr[i] == chArr[j]){
                    repeated = true;
                    break;
                }
            }
            if(!repeated)
                sb1.append(chArr[i]);
        }
        System.out.println(sb1);
    }

    // 4. by using Set interface cos set interface does not allow duplicate
    static void removeDupChar4(String str){
        StringBuffer sb1 = new StringBuffer();
        Set<Character> set = new LinkedHashSet<>();
        for (int i = 0; i < str.length(); i++) {
            // Add each character to the set (duplicates will be ignored)
            set.add(str.charAt(i));
        }
        // Loop through each character in the set (unique characters)
        for (Character ch : set) {
            // Append each character to the StringBuffer
            sb1.append(ch);
        }
        System.out.println(sb1);
    }
}
