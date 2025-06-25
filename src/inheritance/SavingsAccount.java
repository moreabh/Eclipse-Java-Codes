package inheritance;

public class SavingsAccount extends BankAccount{
	
	double balance;
	double interest;
	String type;
	
	public SavingsAccount() {
		//Default Constructor
	}
	
	public SavingsAccount(String name, String ifsc, String bankName, long accno, int pin, String branch,
			long phno, double balance, double interest, String type)
	{
		
		this.name = name;
		this.ifsc = ifsc;
		this.bankName = bankName;
		this.accno = accno;
		this.pin = pin;
		this.branch = branch;
		this.phno = phno;
		
		this.balance = balance;
		this.interest = interest;
		this.type = type;
	}
	
	public void displaySavingsAccount()
	{
		displayBankAccount();
		
		System.out.println(balance);
		System.out.println(interest);
		System.out.println(type);
	}
	
	

}
