import java.util.Scanner; //import scanner class to read user inpout

public class Calculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in); //object to read input from the user

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        // Prompt the user to enter an operation (+, -, *, /)
        System.out.print("Enter an operation (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Variable to store the result
        double result = 0;

        // Perform the operation based on user input
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                // Check for division by zero
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    return; // Exit the program
                }
                break;
            default:
                System.out.println("Error: Invalid operation.");
                return; // Exit the program
        }

        // Display the result
        System.out.println("The result is: " + result);

        scanner.close();
    }
}