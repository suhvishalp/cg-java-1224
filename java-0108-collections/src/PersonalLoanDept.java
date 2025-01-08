
public class PersonalLoanDept implements Bank {
	
	private int[] loanAmounts;
	
	public PersonalLoanDept(int clients) {
		this.loanAmounts = new int[clients];	//4
		//print
	}

	@Override
	public void assignLoans(int[] loans) {		//2
		// TODO Auto-generated method stub
		
		//check the length of both the arrays
		
		//if the length is same
		this.loanAmounts = loans;
		
		
		//hint = consider using Arrays.copyOf()
		
	}

	@Override
	public void averageLoan() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void maxLoan() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void minLoan() {
		// TODO Auto-generated method stub
		
	}

}
