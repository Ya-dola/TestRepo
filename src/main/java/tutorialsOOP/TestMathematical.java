package tutorialsOOP;

public class TestMathematical {

	public static void main(String[] args) {

		double numDouble = -15.5;
		int numInt = 16;

		// Testing the absolute value methods with both an int and a double
		System.out.println("The absolute value (double) is: " + MathematicalOperations.abs(numDouble));
		System.out.println("The absolute value (int) is: " + MathematicalOperations.abs(numInt));

		int prime = 2;

		// Testing if the determining that the number is a prime number works
		System.out.println("The number is a prime number? : " + MathematicalOperations.isPrime(prime));

		prime = 6;
		System.out.println("The number is a prime number? : " + MathematicalOperations.isPrime(prime));

		double sqrt = 16;

		// Testing the square root method
		System.out.println("The square root is: " + MathematicalOperations.sqrt(sqrt));

		double log10 = 100;

		// Testing the logarithmic method
		System.out.println("The logarithm is: " + MathematicalOperations.log(log10));

		double power2 = 11;

		// Testing the power 2 method
		System.out.println("The power of two is: " + MathematicalOperations.powerOfTwo(power2));

	}

}
