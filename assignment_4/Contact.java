package assignment_4;

public class Contact {
	
	private String name;
	private long number;
	
	//constructor
	public Contact(String name, long number) {
		this.name = name;
		this.number = number;
	}
			
		//getter for name
		public String getName(){
			return name;
		}
		
		//getter for number
		public long getNumebr() {
			return number;
		}

		//setter for name
		public void setName(String name) {
			this.name = name;
		}
		
		//setter for number
		public void setNumber(long number) {
			this.number = number;
		}
		
		//toString method to represent the object as a String
		public String toString() {
			return "\nContact: "  + "\nName = " + name + "\nNumber = " + number;
		}
}