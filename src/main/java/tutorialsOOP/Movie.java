package tutorialsOOP;

public class Movie {

	// Instance Variables of the class
	private String title;
	private String category;
	private Director director;
	private int numAward;

	// An overloaded Constructor
	public Movie(String title, String category, Director director) {

		// Calls the super class constructor
		super();

		this.title = title;
		this.category = category;
		this.director = director;

	}

	// Getters and setters of the class
	public String getTitle() {

		return this.title;

	}

	public String getCategory() {

		return this.category;

	}

	public Director getDirector() {

		return this.director;

	}

	public void setNumAward(int numAward) {

		this.numAward = numAward;

	}

	public int getNumAward() {

		return this.numAward;

	}

	/*
	 * The overridden toString method that displays the information of the class
	 * when an object of this class is printed
	 */
	@Override
	public String toString() {

		return "Movie [title = " + this.title + ", category = " + this.category + ", director name= "
				+ this.director.getName() + ", director surname= " + this.director.getSurname() + ", numAward = "
				+ this.numAward + "]";

	}

}
