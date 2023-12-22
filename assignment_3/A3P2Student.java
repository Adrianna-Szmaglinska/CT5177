package assignment_3;

public class A3P2Student {
	
	private String name;
    private long idNumber;

    // Default constructor
    public A3P2Student() {
    }

    // Parameterized constructor
    public A3P2Student(String name, long idNumber) {
        this.name = name;
        this.idNumber = idNumber;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Setter for idNumber
    public void setID(long idNumber) {
        this.idNumber = idNumber;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for idNumber
    public long getID() {
        return idNumber;
    }

    // toString method to represent the object as a string
    public String toString() {
        return "Student [Name: " + name + ", ID: " + idNumber + "]";
    }

}
