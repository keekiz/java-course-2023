package java2023.day1;
import java.util.Scanner;
public class Exercise_4 {

	public static void main(String[] args) {
		        // Define a constant for pi
		        final double PI = 3.14159265359;

		        // Create a Scanner object to read user input
		        Scanner scanner = new Scanner(System.in);

		        // Prompt the user to enter the radius
		        System.out.print("Enter the radius of the circle: ");

		        try {
		            // Read the radius as a double
		            double radius = scanner.nextDouble();

		            // Calculate the area and circumference
		            double area = PI * Math.pow(radius, 2);
		            double circumference = 2 * PI * radius;

		            // Display the results
		            System.out.println("The area of the circle with radius " + radius + " is " + area);
		            System.out.println("The circumference of the circle with radius " + radius + " is " + circumference);
		        } catch (java.util.InputMismatchException e) {
		            // Handle input that is not a valid double
		            System.out.println("Invalid input. Please enter a valid number for the radius.");
		        } finally {
		            // Close the scanner
		            scanner.close();
		        }
		    }
		
	}
