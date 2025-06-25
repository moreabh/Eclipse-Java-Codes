//Driver Code of BankAccount
package PrincipleOfOops;

public class BankAccountDriver {
	public static void main(String[]args)
	{
		BankAccount b1 = new BankAccount("Raju", "IDBI" , 98756636226l, 1234, "IDBI2340456");
		
		System.out.println(b1.getBalance(98756636226l, 1234));
		
		b1.credit(98756636226l, 1234 , 5000);
		b1.debit(98756636226l, 1234, 1000);
		
		System.out.println(b1.bankName);
		System.out.println(b1.accno);
		
		System.out.println(b1.getBalance(98756636226l, 1234));
		
		b1.setPin(98756636226l, 1234, 9876);
		
		b1.debit(98756636226l, 9876, 500);
		
	}
}
/*
 Current Balance: 5000.0
1000.0 Amount Debited
Current Balance: 4000.0
IDBI
98756636226
4000.0
Pin Updated
500.0 Amount Debited
Current Balance: 3500.0
*/
