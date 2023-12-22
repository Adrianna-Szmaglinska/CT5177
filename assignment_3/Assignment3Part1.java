package assignment_3;

import java.util.Scanner; // import scanner

public class Assignment3Part1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// Print the purpose of the program
		System.out.println("This program counts the number of digits in a given number entered by the user.\nEnter -1 to exit the program.\n");
			
		while (true) {
			
			// Asking the user for input
			System.out.print("Enter a number: ");
			String userNum = input.nextLine(); //note how we use String - this is due to String.valueOf(...).length()
					
			if (userNum.equals("-1")) {
				System.out.println("\nYou've decided to exit the program. Goodbye!");
				break;
			}
			
			 // source: https://www.baeldung.com/java-number-of-digits-in-int#:~:text=Perhaps%20the%20easiest%20way%20of,valueOf(number).
			int count = String.valueOf(userNum).length(); 
			System.out.println("The number of digits in " + userNum + " is " + count + "\n");
			
		}
		
		//Close the scanner
		input.close();

	}

}



//System.out.println("Enter your number: ");
//int userNum = input.nextInt();