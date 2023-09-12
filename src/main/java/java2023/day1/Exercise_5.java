package java2023.day1;
import java.util.Scanner;
public class Exercise_5 {


	    public static void main(String[] args) {
	        // Create a Scanner object to read user input
	        Scanner scanner = new Scanner(System.in);

	        // Prompt the user to enter an integer
	        System.out.print("Enter an integer: ");
	        
	        // Read the integer as a string
	        String input = scanner.nextLine();

	        try {
	            // Initialize a variable to store the result
	            int result = 1;

	            // Iterate through each character in the input string
	            for (int i = 0; i < input.length(); i++) {
	                // Check if the character is a digit
	                if (Character.isDigit(input.charAt(i))) {
	                    // Multiply the result by the digit (converted to an integer)
	                    int digit = Character.getNumericValue(input.charAt(i));
	                    result *= digit;
	                }
	            }

	            // Display the result
	            System.out.println("The product of the digits is: " + result);
	        } catch (NumberFormatException e) {
	            // Handle input that is not a valid integer
	            System.out.println("Invalid input. Please enter a valid integer.");
	        } finally {
	            // Close the scanner
	            scanner.close();
	        }
	    }
	}
