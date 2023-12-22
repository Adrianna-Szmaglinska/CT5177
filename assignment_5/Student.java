package assignment_5;

public class Student {
	
	//declare variables
	private String name;
	private long id;
	private String grade;
	private int[] test;
	private int NUM_TESTS = 3;
	
	//default constructor
	public Student() {
		//this("Unassigned", 0);
		//this.test = new int[NUM_TESTS];
	}
	
	//constructor
	public Student(String name, long id) {
		this.name = name;
		this.id = id;
		this.test = new int[NUM_TESTS];
		this.grade = "";
	}

	//setter for name
	public void setName(String name) {
		this.name = name;
	}
	
	//setter for ID
	public void setID(long id) {
		this.id = id;
	}
	
	//setter for grades
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	//setter for test score
	public void setTestScore(int testNumber, int score) {
		if (testNumber >= 1 && testNumber <= NUM_TESTS && score >= 0 && score <= 100) {
				//isValidScore(score)) {
			this.test[testNumber - 1] = score;
		} else {
			System.out.println("Invalid test number or score. Test score must be between 0 and 100.");
		}
	}
		
		//private boolean isValidScore(int score){
			//return score <= 100;
					//score >= 0 && score <= 100;
		//}
	
	//getter for test score
	public int getTestScore(int testNumber) {
		if (testNumber >=1 && testNumber <= NUM_TESTS) {
			return this.test[testNumber -1];
		} else {
			System.out.println("Invalid test number.");
			return -1;
		}
	}
	
	//getter for NUM_TESTS
	public int getNumTests() {
		return NUM_TESTS;
	}
	
	//getter for name
	public String getName() {
		return name;
	}
	
	//getter for ID
	public long getID() {
		return id;
	}
	
	//getter for grade
	public String getGrade() {
		return grade;
	}
	
	//toString
	@Override
	public String toString() {
		return "Student Name: " + name + "\tID: " + id + "\tGrade: " + grade;
				//To make into tabular form replace above code with below (after return)
				//String.format("Student Name: %-20s | ID: %-15s | Grade: %-10s", name, id, grade);
	}
	
	//calculate results
	public void calculateResult() {
		int totalScore = 0;
		for (int score : test) {
			totalScore += score;
	}
		int averageScore = totalScore / NUM_TESTS;
		//int passingMark = (this instanceof PostGraduate) ? 50 : 40;
		
		//if loop to check if student has passed or not
		if (averageScore >= 40) {
			grade = "PASS"; 
		} else {
			grade = "FAIL";
		}
	}
}

//public void calculateResult() {
//int totalScore = 0;
//for (int score : test) {
    ///totalScore += score;
//}

//int averageScore = totalScore / NUM_TESTS;

// Array of passing marks
//int[] passingMarks = {40, 50};

// Check if the average score is greater than or equal to any passing mark
//boolean passed = false;
//for (int passingMark : passingMarks) {
    //if (averageScore >= passingMark) {
        //passed = true;
        //break;  // If passed, no need to check further
    //}
//}

// Set the grade based on the result
//grade = passed ? "PASS" : "FAIL";
//}
