package bank;

public class AxisBank extends BankInfo{
	// Override the method deposit in AxisBank.
	//  --------Assignment 3 Main --------------
	
	public double deposit()
	{
		System.out.print(" From  AxisBank - Deposit method - Interest rate is  ");
		return 11.5;
	}

	public static void main(String[] args) {
		AxisBank ax = new AxisBank();
		ax.saving();
		ax.fixed();
		System.out.println(ax.deposit());
		
	
	}

}
