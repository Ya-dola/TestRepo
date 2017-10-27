package tutorialsOOP;

public class MathematicalOperations {

	// Calculate the absolute value of an int
	public static int abs(int x) {

		if (x < 0) {

			x *= -1;

		}

		return x;

	}

	// Calculate the absolute value of a double
	public static double abs(double x) {

		if (x < 0) {

			x *= -1;

		}

		return x;

	}

	// Checks if the int is a prime number or not
	public static boolean isPrime(int x) {

		// Checks if x is 2
		if (x == 2) {

			return true;

		}

		// Checks if x is a multiple of 2
		if (x % 2 == 0) {

			return false;

		}

		// If it isn't it checks the odd numbers
		for (int i = 3; i * i <= x; i += 2) {

			if (x % i == 0) {

				return false;

			}

		}

		return true;

	}

	// Gets the square root of a double
	public static double sqrt(double x) {

		return Math.sqrt(x);

	}

	// Gets the logarithmic value of a double to the base 10
	public static double log(double x) {

		return Math.log10(x);

	}

	// Returns the square of the double entered
	public static double powerOfTwo(double x) {

		return x * x;

	}

}
