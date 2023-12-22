package assignment_6;

class SalesPerson extends SalesEmployee {
	public SalesPerson() {
		super();
	}
	public SalesPerson (String first, String last, String pps) {
		super (first, last, pps);
	}
	
	//toString
	@Override
	public void calculateCommission() {
		commission = sales * 0.15;
	}
}
