package assignment_6;

class SalesAgent extends SalesEmployee {
	public SalesAgent() {
		super();
	}
	public SalesAgent (String first, String last, String pps) {
		super (first, last, pps);
	}
	
	//toString
	@Override
	public void calculateCommission() {
		commission = sales * 0.1;
	}
}
