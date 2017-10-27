package tutorialsOOP;

public class Date {

	// Instance variables of the class
	private int day;
	private int month;
	private int year;

	/*
	 * Constructor which requires the user to enter the date when trying to
	 * instantiate an object of this class
	 */
	public Date(int day, int month, int year) {

		// Calling the super constructor
		super();

		this.day = day;
		this.month = month;
		this.year = year;

	}

	// Defining the getters and setters
	public int getYear() {

		return year;

	}

	public void setYear(int year) {

		this.year = year;

	}

	public int getMonth() {

		return month;

	}

	public void setMonth(int month) {

		this.month = month;

	}

	public int getDay() {

		return day;

	}

	public void setDay(int day) {

		this.day = day;

	}

	/*
	 * Returns the date in a formatted version of dd/mm/yyyy and adds a leading
	 * zero when needed
	 */
	public String getDate() {

		if (month < 10) {

			if (day < 10) {

				return "0" + day + "/" + "0" + month + "/" + year;

			} else {

				return day + "/" + "0" + month + "/" + year;

			}

		} else {

			return day + "/" + month + "/" + year;

		}

	}

	public void setDate(int day, int month, int year) {

		this.day = day;
		this.month = month;
		this.year = year;

	}

	/*
	 * Overridden Method of the toString() Method in the super class that
	 * returns the date in a formatted version of dd/mm/yyyy and adds a leading
	 * zero when needed
	 */
	@Override
	public String toString() {

		if (month < 10) {

			if (day < 10) {

				return "0" + day + "/" + "0" + month + "/" + year;

			} else {

				return day + "/" + "0" + month + "/" + year;

			}

		} else {

			return day + "/" + month + "/" + year;

		}

	}

}
