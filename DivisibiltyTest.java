import java.util.Scanner; // import the scanner class for reding user input

public class DivisibilityTest {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // initializes scanner to take user input

        // Input: Getting a number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt(); // reads the input number
        
        // Checking divisibility using for loop iterates numbers 1 to 9 to check visibility
        for (int i = 1; i <= 9; i++) {
            if (isDivisibleBy(number, i)) {
                System.out.println("The number " + number + " is divisible by " + i + " because " + getReason(number, i));
            } else {
                System.out.println("The number " + number + " is not divisible by " + i);
            }
        }
        
        // Close the scanner to avoid resource leak
        scanner.close();
    }
    
    // Method to check if a number is divisible by a given divisor
    public static boolean isDivisibleBy(int number, int divisor) {
        return number % divisor == 0;
    }
    
    // Method to provide reasons for the divisibility rules
    public static String getReason(int number, int divisor) {
        switch (divisor) {
            case 1:
                return "every number is divisible by 1.";
            case 2:
                // Reason for divisibility by 2
                return "it is even.";
            case 3:
                // Reason for divisibility by 3
                return "the sum of its digits is divisible by 3.";
            case 4:
                // Reason for divisibility by 4
                return "the last two digits form a number divisible by 4.";
            case 5:
                // Reason for divisibility by 5
                return "it ends with 0 or 5.";
            case 6:
                // Reason for divisibility by 6
                return "it is divisible by both 2 and 3.";
            case 7:
                // Reason for divisibility by 7
                return "the double of the last digit subtracted from the rest of the number is divisible by 7.";
            case 8:
                // Reason for divisibility by 8
                return "the last three digits form a number divisible by 8.";
            case 9:
                // Reason for divisibility by 9
                return "the sum of its digits is divisible by 9.";
            default:
                return "";
        }
    }
}