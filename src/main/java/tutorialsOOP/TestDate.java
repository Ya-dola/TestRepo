package tutorialsOOP;

import java.util.Scanner;

public class TestDate {

	public static void main(String[] args) {

		// Creating a scanner object to get information from the user
		Scanner scan = new Scanner(System.in);

		// Gets the data to create a date object from the user with validations
		int day = rangeValidator(scan, "Enter the Day: ", 1, 31);
		int month = rangeValidator(scan, "Enter the Month: ", 1, 12);
		int year = rangeValidator(scan, "Enter the Year: ", 1940, 2100);

		// Creating the date object
		Date date = new Date(day, month, year);

		// Printing the date object
		System.out.println(date);

		// Using the getters of the date object
		day = date.getDay();
		month = date.getMonth();
		year = date.getYear();

		// Printing the date object
		System.out.println(date);

		/*
		 * Using the setters in the date object and displaying the results they
		 * produce one by one
		 */
		date.setDay(rangeValidator(scan, "Enter the Day: ", 1, 31));
		System.out.println(date);

		date.setMonth(rangeValidator(scan, "Enter the Month: ", 1, 12));
		System.out.println(date);

		date.setYear(rangeValidator(scan, "Enter the Year: ", 1940, 2100));
		System.out.println(date);

		// Getting the date of the date object and displaying it
		System.out.println(date.getDate());

		// Using the date setter and displaying the result it produces
		date.setDate(rangeValidator(scan, "Enter the Day: ", 1, 31), rangeValidator(scan, "Enter the Month: ", 1, 12),
				rangeValidator(scan, "Enter the Year: ", 1940, 2100));

		// Displaying the date object through the overridden toString() method
		System.out.println(date.toString());

	}

	/*
	 * To validate that the input the user enters is an integer and within the
	 * acceptable range
	 */
	protected static int rangeValidator(Scanner scan, String message, int min, int max) {

		int value = 0;

		do {

			// To display the message to the user
			System.out.print(message);

			// Makes sure the input is a whole number (integer)
			while (!scan.hasNextInt()) {

				System.err.println("Invalid input ! \nPlease enter a number !");
				scan.next();

				System.out.print(message);

			}

			value = scan.nextInt();

			// Makes sure the number entered is within the acceptable range
			confirmation: if (!(value >= min && value <= max)) {

				System.err.println("The number entered must be between " + min + " and " + max + " !");

				break confirmation;

			}

			// Only if the value is valid can the user proceed
		} while (!(value >= min && value <= max));

		return value;

	}

}
