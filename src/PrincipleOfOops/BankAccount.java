//Encapsulation Data Hinding:-
//bluePrint of BankAccount 
package PrincipleOfOops;

public class BankAccount {
	String username;
	String bankName;
	
	int pin;
	long accno;
	double balance;
	String ifsc;
	
	public BankAccount(String userName, String bankName, long accno, int pin, String ifsc )
	{
		userName = username;         
		this.accno = accno;
		this.ifsc = ifsc;  
		this.pin = pin;                                                             
		this.bankName = bankName;
		
	}
	
//	user can only read the username but cant change it 
	public String getUserName()
	{
		return username;
	}
	
//	user can only read the BankName but cant chang it 
	public String getBankName()
	{
		return bankName;
	}
	
//	user can only read the Account No but cant change it 
	public long getAccno()
	{
		return accno;
		
	}
	
//	user can change the pin but cant read(get) the pin &before changing pin first validation is important 
	public void setPin(long accno, int oldPin, int newPin )
	{
		if(this.accno == accno && pin == oldPin)
		{
			pin = newPin;
			System.out.println("Pin Updated");	
		}
		else
		{
			System.out.println("Invalid Credentials");
		}	
	}
	
//	user can only read the IFSC but cant change it
	public String getIFSC()
	{
		return ifsc;
		
	}
	
//	user can only read the balance but cant change it
	public double getBalance(long accno, int pin)
	{
		if(this.accno == accno && this.pin == pin)
		{
			return balance;
		}
		else
		{
			System.out.println("Invalid Credentials");
			
			return 0;
		}
	}
	
//	at credit time user can only add ammount in current balance
	public void credit(long accno, int pin, double amt)
	{
		if(this.accno == accno && this.pin == pin )
		{
			if(amt >0)
			{
				balance = balance + amt;
				System.out.println("Amount credited "+amt);
				System.out.println("Current Balance: "+balance);
			}
			else 
			{
				System.out.println("Invalid Amount");
			}
		}
		else
		{
			System.out.println("Invalid Credentials");
		}
	}
	
//	at debit time user can only debit the ammount from the current balance
	public void debit(long accno, int pin, double amt)
	{
		if(this.accno == accno && this.pin == pin)
		{
			if(amt>0)
			{
				if(balance - amt >1000)
				{
					balance = balance - amt;
					System.out.println(amt+" Amount Debited");
					System.out.println("Current Balance: "+balance);
				}
				else
				{
					System.out.println("Insuffiient Balance");
				}
					
			}
			else
			{
				System.out.println("Invalid Amount");
			}
		}
		else 
		{
			System.out.println("Invalid Credentials");
		}
	}
}
