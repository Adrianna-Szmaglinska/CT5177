package assignment_6;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SalesEmployeeClient {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		//type string declared
		String type;
		
		//array populated with staff
		SalesEmployee[] employee = new SalesEmployee[3];
		employee[0] = new SalesAgent("Mary", "James", "843988PP");
		employee[1] = new SalesPerson("Jonny", "Brave", "8343999F");
		employee[2] = new SalesAgent("Casper", "Chance", "485774Y");
	
		//for-if-else loop to assign and display type of employee, 
		//take in sales input from users,
		//and calculate commission received on sales.
		//iterates through every employee in the array
		for (int i = 0; i < employee.length; i++) {
			if (employee[i] instanceof SalesPerson) {
				type = "Sales Person";
			} else {
				type = "Sales Agent";
			}
			
			//print out staff type
			System.out.println("Employee Type: " + type);
			System.out.println(employee[i]);
							
			//enter sales
			System.out.print("Enter the value of the sale: $ ");
			double sales = input.nextDouble();
			employee[i].sales = sales;
			//calculate commission 
			employee[i].calculateCommission();
			
			//print commission from sales
			System.out.println("Commission earned: $ " + df.format(employee[i].commission) + "\n");
			System.out.println("-----------------------------------------------------\n");
						
		}
		
		// close input
		input.close();
	
	}
	
}

