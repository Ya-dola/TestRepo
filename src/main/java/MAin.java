import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class MAin {

	
	
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>(); // ArrayList to store student details
		
		//You should create a menu here using a do while loop and switch case
		
		getInput(list);
		
		toDisplay(list);
		
		Student[] arr = new Student[list.size()];
		arr = list.toArray(arr); // convert list to array
		sortStudentsUsingName(arr); // sort method is called
		
		List<Student> list1 = Arrays.asList(arr); // converting back array to list
	
		toDisplay(list1);
	}
	
	private static void toDisplay(List<Student> list){ // to display the student details
		System.out.println("==================Displaying Student Details=================");
		for(Student obj : list){
			System.out.println(obj);
		}
	}
	
	private static void getInput(List<Student> array) {
		Scanner sc = new Scanner(System.in);// for input
		int i = 0;
		String conti = "No";

		do{
			System.out.println("Input Student Details "+i);

			String studentName = sc.next(); 

			String studentID = sc.next();
			int proj01 = getMarksAsInput(sc, "Please enter the Project 01 Marks!");
			int ict01 = getMarksAsInput(sc, "Please enter the ICT 01 Marks!");
			int activeP01 = getMarksAsInput(sc, "Please enter the  Active Participation 01 Marks!");
			int codeAss = getMarksAsInput(sc, "Please enter the Coding Assignment Marks!");
			int ict02 = getMarksAsInput(sc, "Please enter the ICT 02 Marks!");
			int activeP02 = getMarksAsInput(sc, "Please enter the Active Participation 02 Marks!");
			int ict03 = getMarksAsInput(sc, "Please enter the ICT 03 Marks!");
			int activeP03 = getMarksAsInput(sc, "Please enter the Active Participation 03 Marks!");
			
			
			array.add( new Student(studentName, studentID, proj01, ict01, activeP01, codeAss, ict02, activeP02, ict03, activeP03));
			System.out.print("Do you want to Input more Student details Say \"Yes\" to continue \"No\" to exit : ");
			conti = sc.next();
			i++;
			
		}while(!conti.toLowerCase().equals("no"));

	}
		
	private static int getMarksAsInput(Scanner sc, String inputMessage){
		int marks;
		do {
			System.out.println(inputMessage+"!!!");
			while (!sc.hasNextInt()) { // to validate the input 
				System.out.println("That's not a number!");
				sc.next(); // this is important!
			}
			marks = sc.nextInt();
		} while (marks < 0 || marks > 100);
		
		return marks;
	}

	public static void sortStudentsUsingName(Student []array){
		System.out.println("==================Sorting Student Details using Name in Ascending Order=================");
		for (int i = 0; i < array.length; i++){
			Student min = array[i];
			
			int minIndex = i;
			for (int j = i + 1; j < array.length; j++){
				if (min.getStudentName().compareTo(array[j].getStudentName()) > 0){ 
					// How compareTo method works
					//a.compareTo(b) == 0 means both a and b are equal
					//a.compareTo(b) > 0 means a is large and b is small
					//a.compareTo(b) < 0 means b is large and a is small
					//for Descending order change the conditions to: 
					//min.getStudentName().compareTo(array[j].getStudentName()) < 0
					min = array[j];
					minIndex = j;
				}
			}
			if (i != minIndex){
				Student temp = array[minIndex];
				array[minIndex] = array[i];
				array[i] = temp;
			}
		}
	}
}
