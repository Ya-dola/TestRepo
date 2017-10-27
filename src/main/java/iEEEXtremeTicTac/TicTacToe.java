package iEEEXtremeTicTac;

import java.util.ArrayList;
import java.util.Scanner;

public class TicTacToe {

	// Scanner
	private Scanner scan = new Scanner(System.in);

	// Play area
	private String[][] ticTacToe = new String[3][3];

	private ArrayList<String> bobPlayedSpots = new ArrayList<String>();

	private ArrayList<String> compPlayedSpots = new ArrayList<String>();

	private String[] bobPref;

	private int currentPref = 0;

	public static void main(String[] args) {

	}

	protected void storeBobPref() {

		String line;

		// To store bobs preference
		for (int i = 0; i < 9; i++) {

			line = scan.nextLine();

			// Adding each line to bob pref list
			bobPref[i] = line;

		}

	}

	protected String getRowColumn(int prefNum) {

		String rowColumn = null;

		switch (prefNum) {

		case 0:

			rowColumn = bobPref[prefNum];

			break;

		case 1:

			rowColumn = bobPref[prefNum];

			break;

		case 2:

			rowColumn = bobPref[prefNum];

			break;

		case 3:

			rowColumn = bobPref[prefNum];

			break;

		case 4:

			rowColumn = bobPref[prefNum];

			break;

		case 5:

			rowColumn = bobPref[prefNum];

			break;

		case 6:

			rowColumn = bobPref[prefNum];

			break;

		case 7:

			rowColumn = bobPref[prefNum];

			break;

		case 8:

			rowColumn = bobPref[prefNum];

			break;

		}

		return rowColumn;

	}

	protected boolean bobWon() {

		boolean bobWon = false;

		String position1 = null;
		String position2 = null;
		String position3 = null;

		// checks if all rows are X
		check: for (int i = 0; i < 3; i++) {

			position1 = ticTacToe[i][0];
			position2 = ticTacToe[i][1];
			position3 = ticTacToe[i][2];

			if (position1.equalsIgnoreCase("x") & position2.equalsIgnoreCase("x") & position3.equalsIgnoreCase("x")) {

				bobWon = true;

				break check;

			}

		}

		// Check if all columns are x
		check: for (int i = 0; i < 3; i++) {

			position1 = ticTacToe[0][i];
			position2 = ticTacToe[1][i];
			position3 = ticTacToe[2][i];

			if (position1.equalsIgnoreCase("x") & position2.equalsIgnoreCase("x") & position3.equalsIgnoreCase("x")) {

				bobWon = true;

				break check;

			}

		}

		// Check if diagonals are all x
		position1 = ticTacToe[0][0];
		position2 = ticTacToe[1][1];
		position3 = ticTacToe[2][2];

		if (position1.equalsIgnoreCase("x") & position2.equalsIgnoreCase("x") & position3.equalsIgnoreCase("x")) {

			bobWon = true;

		}

		position1 = ticTacToe[0][2];
		position2 = ticTacToe[1][1];
		position3 = ticTacToe[2][0];

		if (position1.equalsIgnoreCase("x") & position2.equalsIgnoreCase("x") & position3.equalsIgnoreCase("x")) {

			bobWon = true;

		}

		return bobWon;

	}

	protected int getRow(String rowColumn) {

		String[] strRow = rowColumn.split(" ");

		int row = Integer.parseInt(strRow[0]);

		return row - 1;

	}

	protected int getCol(String rowColumn) {

		String[] strCol = rowColumn.split(" ");

		int col = Integer.parseInt(strCol[1]);

		return col - 1;

	}

	protected void playBob() {

		String choice = "x";

		check: for (int i = 0; i < 9; i++) {

			String rowColumn = getRowColumn(currentPref++);

			int row = getRow(rowColumn);
			int column = getCol(rowColumn);

			// Checks if the preference is already used
			if (ticTacToe[row][column] != null) {

				bobPlayedSpots.add(rowColumn);

				ticTacToe[row][column] = choice;

				break check;

			}

		}

	}

	protected void playComp() {

		String choice = "o";

		String tempRowColumn = null;

		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {

				if (ticTacToe[i][j].equalsIgnoreCase("x")) {
					
					ticTacToe[0][1].equalsIgnoreCase("x") && ticTacToe[0][2] == null;
					
				}

			}

		}

	}

}
