package assignment_1;

// Import java.util.Scanner and DecimalFormat
import java.util.Scanner;
import java.text.DecimalFormat;

// Start of class
public class Assignment1 {

	//Start of main method
	public static void main(String[] args) {
		
		// Creating Scanner and DecimalFormat objects
		Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        
        // Input for A seats
        System.out.print("Enter number of A seats sold: ");
        int numATickets = input.nextInt();
        System.out.print("Enter price of A tickets: € ");
        double priceATickets = input.nextDouble();

        // Input for B seats
        System.out.print("Enter number of B seats sold: ");
        int numBTickets = input.nextInt();
        System.out.print("Enter price of B tickets: € ");
        double priceBTickets = input.nextDouble();

        // Input for C seats
        System.out.print("Enter number of C seats sold: ");
        int numCTickets = input.nextInt();
        System.out.print("Enter price of C tickets: € ");
        double priceCTickets = input.nextDouble();

        // End of input
        input.close();

        // Calculate total sales
        double totalSales = (numATickets * priceATickets) + (numBTickets * priceBTickets) + (numCTickets * priceCTickets);

        // Display the results
        System.out.println("\n\t\t Tickets Sold \t Price per Ticket");
        System.out.println("\t\t -------------   ----------------");

        System.out.println("A Tickets:" + "\t\t" + numATickets + "\t\t" + "€ " + df.format(priceATickets));
        System.out.println("B Tickets:" + "\t\t" + numBTickets + "\t\t" + "€ " + df.format(priceBTickets));
        System.out.println("C Tickets:" + "\t\t" + numCTickets + "\t\t" + "€ " + df.format(priceCTickets));

        System.out.println("\n\t" + "Total Sales € " + df.format(totalSales));
        
        
	}//End main method

} //End class
