package inheritance;

public class BankAccountDriver {
	
	public static void main(String[]args) {
		
		SavingsAccount s1 = new SavingsAccount("Raju", "IJklokAxis4001", "IDBI", 1234567898l, 1234, "Ichalkaranji", 
				9373408742l, 5000.0, 3, "SavingAccount");
		s1.displayBankAccount();
		System.out.println("———————————————————————————————————————");
		
		s1.displaySavingsAccount();	
	}
	

}

/* output :-
Raju
IJklokAxis4001
IDBI
1234567898
1234
Ichalkaranji
9373408742
———————————————————————————————————————
Raju
IJklokAxis4001
IDBI
1234567898
1234
Ichalkaranji
9373408742
5000.0
3.0
SavingAccount
*/
