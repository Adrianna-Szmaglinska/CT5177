package assignment_3;

public class A3P2StudentTester {

	public static void main(String[] args) {
		
		// Create an array to hold Student objects
        A3P2Student[] students = new A3P2Student[3];

        // Add instances of Student to the array
        students[0] = new A3P2Student("John Bloggs", 12345);
        students[1] = new A3P2Student("Tarzan Bobbins", 67890);
        students[2] = new A3P2Student("Hugo Boss", 54321);

        // Traverse the array and display the contents
        for (A3P2Student a3P2Student : students) {
            System.out.println(a3P2Student);
        }
	}
}
