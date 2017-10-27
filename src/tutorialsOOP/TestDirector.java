package tutorialsOOP;

public class TestDirector {

	public static void main(String[] args) {

		// Creating a director object
		Director director = new Director("James", "Cameron");

		// Creating a date object
		Date dob = new Date(16, 8, 1954);

		// Setting the date of the director object to the date object
		director.setDob(dob);

		// Setting the number of movies for the director object
		director.setNumberOfMovie(23);

		// Printing out details of the director object
		System.out.println(director);
		System.out.println("Name is: " + director.getName());
		System.out.println("Surname is: " + director.getSurname());
		System.out.println("Date of Birth is: " + director.getDob().getDate());
		System.out.println("Number of Directed Movies is: " + director.getNumberOfMovie());

	}

}
