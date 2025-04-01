/* Reverse Number : 
Input: 15786
Output: 68751
 */
public class _9ReverseNo {
    public static void main(String[] args) {
        int number = 10123345;
        reverse(number);
    }

    private static void reverse(int number) {
        int rev = 0;
        int lastDigit ;
        System.out.println("Original number is: "+number);
        while(number > 0){
            lastDigit = number % 10;
            rev = rev * 10 + lastDigit;
            number/= 10;
        }
        System.out.println("reverse number is: "+ rev);
    }
}
