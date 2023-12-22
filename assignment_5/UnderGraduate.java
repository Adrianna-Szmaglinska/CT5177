package assignment_5;

class UnderGraduate extends Student {

	public UnderGraduate() {
        // Default constructor
    }

    public UnderGraduate(String name, long id) {
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
         
         //if (averageScore >= 40) {
         	//grade = "PASS";
         //} else {
         	//grade = "FAIL";
         //}
    	//super call
    	super.calculateResult(); // Utilize the calculation logic in the superclass
    }
         
}
    
    