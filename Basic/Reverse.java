package Basic;

public class Reverse {
    public static void main(String[] args) {
        int n = 34567;
        System.out.println(reverseNumber(n));

        String str = "hello world";
        System.out.println(reverseString(str));
    }

    static int reverseNumber(int n){
        int rev = 0;
        while(n != 0){
            int digit = n%10;
            rev = rev * 10 + digit;
            n/=10;
        }
        return rev;
    }

    static String reverseString(String str){
        String reversed = "";
        for (int i = str.length()-1; i>=0;i--) {
            reversed = reversed + str.charAt(i);
        }
        return reversed;
        // using recursion
        // if (str.isEmpty()) 
        //     return str;
        // return reverseString(str.substring(1)) + str.charAt(0);
            
    }
}
