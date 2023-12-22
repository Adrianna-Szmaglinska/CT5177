package assignment_2;

// Import scanner
import java.util.Scanner;

//start of class
public class Assignmnet2Part2 {

	//start of main method
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Ask the user for year to test if Leap Year
		System.out.print("Enter a year: ");
		int year = input.nextInt();
		
		//Close the scanner
		input.close();
		
		//Check if year is a Leap Year
		boolean isLeapYear = false;
		
		// if condition check
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			isLeapYear = true;
		}

		//Display the result using if-else
		if (isLeapYear) {
			System.out.println(year + " is a Leap Year.");
		} else {
			System.out.println(year + " is Not a Leap Year.");
		}	
		
	}  //end main method
	
} // end class