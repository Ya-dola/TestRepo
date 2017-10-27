package tutorialsOOP;

public class Circle {

	// Instance variables of the class
	private double radius;
	private String colour;

	// Default Constructor
	public Circle() {

		// Calls the super constructor
		super();

		this.radius = 1;
		this.colour = "blue";

	}

	// Overloaded Constructor
	public Circle(double radius) {

		// Calls the super constructor
		super();

		this.radius = radius;
		this.colour = "blue";

	}

	// Overloaded Constructor
	public Circle(double radius, String colour) {

		// Calls the super constructor
		super();

		this.radius = radius;
		this.colour = colour;

	}

	// Defining the getters and setters
	public void setRadius(double radius) {

		this.radius = radius;

	}

	public double getRadius() {

		return this.radius;

	}

	public void setColour(String colour) {

		this.colour = colour;

	}

	public String getColour() {

		return this.colour;

	}

	// Returns the area of the circle
	public double getArea() {

		return Math.PI * Math.pow(this.radius, 2);

	}

	// Overridden Method of the toString() Method in the super class
	@Override
	public String toString() {

		/*
		 * I have used String.format to format the output of the area to 2
		 * decimal places
		 */
		return String.format("The circle has a radius of " + this.radius + " and is " + this.colour
				+ " in colour with an area of %.2f !", getArea());

	}

}
