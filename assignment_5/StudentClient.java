package assignment_5;

import java.util.Scanner;

public class StudentClient {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Student[] students = new Student[3];

        for (int i = 0; i < students.length; i++) {
        	System.out.println("----------------------------------------------------------------");
        	System.out.print("Enter student type (U for Undergraduate, P for Postgraduate): ");
            char studentType = input.next().charAt(0);
            input.nextLine();
            System.out.println("----------------------------------------------------------------");

            // enter student name
            System.out.print("Enter student name: ");
            String name = input.nextLine();

            //enter student id
            System.out.print("Enter student ID: ");
            long id = input.nextLong();
            if (id <= 0) {
            	System.out.println("Invalid ID. Please enter correct format.");
            	i--;
            	continue;
            }
            
            //System.out.print("Enter student ID: ");
            //long id = input.nextLong();
            //input.nextLine(); //consume the newline character

            //finding out the student type - undergrad or postgrad
            if (studentType == 'U') {
                students[i] = new UnderGraduate(name, id);
            } else if (studentType == 'P') {
                students[i] = new PostGraduate(name, id);
            } else {
                System.out.println("Invalid student type. Please enter U or P.");
                i--; // Decrement i to re-enter the current student's details
                continue;
            }

            //inputting test scores with for loop
            for (int j = 1; j <= students[i].getNumTests(); j++) {
                System.out.print("Score for " + students[i].getName() + " on test " + j + ": ");
                int score = input.nextInt();
                students[i].setTestScore(j, score);
            }

            students[i].calculateResult();
        }
        
        //display the results in tabular view
        //System.out.println("\nStudent Results:\n");
        //System.out.println("--------------------------------------------------------");
        //System.out.printf("%-20s %-15s %-10s\n", "Student Name", "ID", "Grade");
        //System.out.println("--------------------------------------------------------");

        //for (Student student : students) {
            //System.out.printf("%-20s %-15s %-10s\n", student.getName(), student.getID(), student.getGrade());
        //

        //System.out.println("--------------------------------------------------------");
        
        System.out.println("--------------------------------------------------------");
        System.out.println("Student Results");
        System.out.println("--------------------------------------------------------");
        for (Student student : students) {
        	System.out.println(student.toString());
            //System.out.println("\n" + student.toString());
        }

        input.close();
    }
}


