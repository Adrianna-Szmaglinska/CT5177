package assignment_2;

// Import Scanner 
import java.util.Scanner;

//start of class
public class Assignmnet2Part1 {

	//start of main method
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Ask the user for array size
		System.out.print("How many numbers are in your array? ");
		int arraySize = input.nextInt();
		
		//Create an array of the given size
		double[] userNumbers = new double[arraySize];
		
		//Populate the array using a for loop
		for (int i = 0; i < arraySize; i++) {
			System.out.print("Enter number " + i + " in your array: ");
			userNumbers[i] = input.nextDouble();
		}

		//Close the scanner
		input.close();
		
		//Calculate the sum and display the array contents
		double sum = 0.0;
		System.out.println("\nArray contents: \n");
		
		for (int i = 0; i < arraySize; i++) {
			System.out.println("Number " + i + ": " + userNumbers[i]);
			sum += userNumbers[i];
		}
		
		//Display the sum
		System.out.println("\nTotal of all the numbers in your array is " + sum);
	
	} // end main method

} //end class
