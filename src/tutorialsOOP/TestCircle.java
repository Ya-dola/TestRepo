package tutorialsOOP;

public class TestCircle {

	public static void main(String[] args) {

		// Instantiating the First Circle Object
		Circle circle1 = new Circle();

		// Assigning the values to the first circle object
		circle1.setRadius(6);
		circle1.setColour("black");

		// Printing the details of the first circle object
		System.out.printf("The circle has a radius of " + circle1.getRadius() + " and an area of %.2f with a colour of "
				+ circle1.getColour() + "\n", circle1.getArea());

		// Instantiating the Second Circle Object
		Circle circle2 = new Circle(8);

		/*
		 * Assigning the values to the second circle object while changing the
		 * initial value of the radius that was assigned in the constructor
		 */
		circle2.setRadius(10);
		circle2.setColour("green");

		// Printing the details of the second circle object
		System.out.printf("The circle has a radius of " + circle2.getRadius() + " and an area of %.2f with a colour of "
				+ circle2.getColour() + "\n", circle2.getArea());

		// Instantiating the Third Circle Object
		Circle circle3 = new Circle(4, "red");

		/*
		 * Assigning the values to the third circle object while changing the
		 * initial value of the radius and colour that was assigned in the
		 * constructor
		 */
		circle3.setRadius(12);
		circle3.setColour("yellow");

		// Printing the details of the third circle object
		System.out.printf("The circle has a radius of " + circle3.getRadius() + " and an area of %.2f with a colour of "
				+ circle3.getColour() + "\n", circle3.getArea());

		// Printing the third circle object with the toString() method
		System.out.println(circle3.toString());

		// Printing the third circle object without the toString() method
		System.out.println(circle3);

	}

}
