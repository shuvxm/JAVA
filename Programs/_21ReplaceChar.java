/*
 * Replace all the 'T' with its occurence in the given string.
 * Input: OPENTEXT
 * OUTPUT: OPEN1EX2
 */

public class _21ReplaceChar {
    public static void main(String[] args) {
        String str = "OPENTEXT";
        char charToReplace = 'y';
        replaceChar1(str,charToReplace);
        replaceChar2(str,charToReplace);

    }

    private static void replaceChar1(String str, char charToReplace) {
       // check char present in string
       if(str.indexOf(charToReplace) == -1){
           System.out.println("Given character not found in input string");
        //    return;
           System.exit(0);;
       }

       // logic to replace char occurance in string
       char[] chArr = str.toCharArray();  // o  p  e  n  t  e  x  t
       int count = 1;
       for(int i=0; i<chArr.length;i++){
        if(chArr[i] == charToReplace){ // check, o==t, p==t
            // chArr[i] = count; but i hv to convert it into char from int bcz count is in int
            chArr[i] = String.valueOf(count).charAt(0); // convert it into String then take method to take out char
            count++;
          }
       }
       System.out.println(chArr);
    }

    // 2. replacing char with occurence by using method replaceFirst()
    private static void replaceChar2(String str, char charToReplace) {
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == charToReplace) {
                str = str.replaceFirst(String.valueOf(charToReplace), String.valueOf(count));
                count++;
            }
        }
        System.out.println(str);
    }

}
