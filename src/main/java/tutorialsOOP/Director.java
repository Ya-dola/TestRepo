package tutorialsOOP;

public class Director {

	// Instance Variables of the class
	private String name;
	private String surname;
	private int numDirectedMovie;
	private Date dob;

	// An overloaded Constructor
	public Director(String name, String surname) {

		// Calls the super class constructor
		super();

		this.name = name;
		this.surname = surname;

	}

	// Getters and setters of the class
	public String getName() {

		return this.name;

	}

	public String getSurname() {

		return this.surname;

	}

	public void setDob(Date dob) {

		this.dob = dob;

	}

	public int getNumberOfMovie() {

		return this.numDirectedMovie;

	}

	public void setNumberOfMovie(int nMovie) {

		this.numDirectedMovie = nMovie;

	}

	public Date getDob() {

		return this.dob;

	}

	/*
	 * The overridden toString method that displays the information of the class
	 * when an object of this class is printed
	 */
	@Override
	public String toString() {

		return "Director [name = " + this.name + ", surname = " + this.surname + ", dob = " + this.dob
				+ ", movies directed = " + this.numDirectedMovie + "]";

	}

}
