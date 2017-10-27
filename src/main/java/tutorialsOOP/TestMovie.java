package tutorialsOOP;

public class TestMovie {

	public static void main(String[] args) {

		// Creating a director object
		Director director = new Director("James", "Cameron");

		// Creating a date object
		Date dob = new Date(16, 8, 1954);

		// Setting the date of the director object to the date object
		director.setDob(dob);

		// Setting the number of movies for the director object
		director.setNumberOfMovie(23);

		// Printing the director object
		System.out.println(director);

		// Creating a movie object
		Movie movie = new Movie("Avatar", "Fantasy", director);

		// Setting the number of awards to 23
		movie.setNumAward(23);

		// Printing the details of the movie object
		System.out.println(movie);
		System.out.println("title is: " + movie.getTitle());
		System.out.println("category is: " + movie.getCategory());
		System.out.println("name of director is: " + movie.getDirector().getName());
		System.out.println("surname of director is: " + movie.getDirector().getSurname());
		System.out.println("number of awards is: " + movie.getNumAward());

	}

}
