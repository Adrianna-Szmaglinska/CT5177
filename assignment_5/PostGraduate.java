package assignment_5;

class PostGraduate extends Student {

	public PostGraduate() {
        // Default constructor
    }

    public PostGraduate(String name, long id) {
        super(name, id);
    }

    //toString
    @Override
    public void calculateResult() {
        //int totalScore = 0;
        //for (int score : test) {
        	//totalScore += score;
        //}
        
        //int averageScore = totalScore / NUM_TESTS;
        
        //if (averageScore >= 50) {
        	//grade = "PASS";
        //} else {
        	//grade = "FAIL";
        //}
    	//super call
    	super.calculateResult(); // Utilize the calculation logic in the superclass
    }
}
