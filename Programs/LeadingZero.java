import java.util.Scanner;

public class LeadingZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String inputNumber = sc.nextLine();
        sc.close(); // close the scanner object to avoid resource leaks
        
        // for all words count number n string both
        // System.out.println("Number of digits: " + countDigits(inputNumber)); 

        // for number only
        if (inputNumber.matches("^0*[0-9]+$")) { // checks if the input is a positive number with leading zeros
            System.out.println("Number of digits (including leading zeros): " + countDigits(inputNumber));
        } else {
            System.out.println("Please enter a valid number.");
        }
    }

    private static int countDigits(String inputNumber) {
        if (inputNumber == null || inputNumber.isEmpty()) return 0; // handle empty input

        // Counting digits including leading zeros
        return inputNumber.length();
    }
}
