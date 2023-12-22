package assignment_6;

abstract class SalesEmployee {
	
	//declare variables
	private String firstName;
	private String lastName;
	private String ppsNumber;
	protected double sales = 0.0;
	protected double commission = 0.0;
	
	//default constructor
	public SalesEmployee() {	
	}
	
	//constructor
	public SalesEmployee (String firstName, String lastName, String ppsNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.ppsNumber = ppsNumber;
	}
	
	//setter for first name
	public void setFirstName (String first) {
		this.firstName = first;
	}
	
	//setter for last name
	public void setLastName (String last) {
		this.lastName = last;
	}
	
	//setter for ppsn
	public void setPPS (String pps) {
		this.ppsNumber = pps;
	}
	
	//getter for first name
	public String getFirstName (String firstName) {
		return firstName;
	}
	
	//getter for last name
	public String getLastName (String lastName) {
		return lastName;
	}
	
	//getter for ppsn
	public String getPPS (String ppsNumber) {
		return ppsNumber;
	}
	
	//toString
	@Override
	public String toString() {
		return "\n" + "First Name: " + firstName + "\nLast Name: " + lastName + "\nPPSN: " + ppsNumber + "\n"; 
	}
	
	//calculate commission
	abstract void calculateCommission();

}
