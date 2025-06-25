package abstraction;

public class Games extends Compition2025{
	
	
	public Games(int cricketFees, String cricketDate, int vollyFees, String vollyDate,
			int footFees, String footDate, int basketFees, String basketdate,
			int soloFees,String soloDate,int groupFees,String groupDate,
			int soloPlayFees,String soloPlayDate,int squadFees,String squadDate,
			int soloSingingFees,String soloSingingDate,int groupSingingFees,
			String groupSingingDate) 
	{
		this.cricketFees = cricketFees;
		this.cricketDate = cricketDate;
		this.vollyFees = vollyFees;
		this.vollyDate = vollyDate;
		this.footFees = footFees;
		this.footDate = footDate;
		this.basketFees = basketFees;
		this.basketdate = basketdate;
		this.soloFees = soloFees;
		this.soloDate = soloDate;
		this.groupFees = groupFees;
		this.soloPlayFees = soloPlayFees;
		this.soloPlayDate = soloPlayDate;
		this.squadFees = squadFees;
		this.squadDate = squadDate;
		this.soloSingingFees = soloSingingFees;
		this.soloSingingDate = soloSingingDate;
		this.groupSingingFees = groupSingingFees;
		this.groupSingingDate = groupSingingDate;
		
		
	
		
	}
	
	@Override
	public void cricket() {
		System.out.println("Cricket:-");
		System.out.println("Entry Fee:-"+cricketFees);
		System.out.println("Date:- "+cricketDate);
	}
	@Override
	public void crickRegister() {
	System.out.println("You registerd For Cricket, Your Compition Details:- "+"Fees:-"+cricketFees+" Date:- "+cricketDate);		
	}
	
	
	public void vollyball() {
		System.out.println("Vollyball:-");
		System.out.println("Entry Fee:-"+vollyFees);
		System.out.println("Date:- "+vollyDate);
		
	}
	@Override
	public void vollyRegister() {
		// TODO Auto-generated method stub
		System.out.println("You registerd For Vollyball, Your Compition Details:- "+vollyFees+" Date:-  "+vollyDate);	
	}
	
	@Override
	public void football() {
		System.out.println("Football:-");
		System.out.println("Entry Fees:- "+footFees);
		System.out.println("Date:- "+ footDate);
	}
	@Override
	public void footRegister() {
		// TODO Auto-generated method stub
		System.out.println("You registerd For Football, Your Compition Details:- "+"Fees:- "+footFees+" Date:-  "+footDate);	
	}
	
	 @Override
	public void basketball() {
		 System.out.println("Basketball:-");
		System.out.println("Entry Fees:- "+basketFees);
		System.out.println("Date:- "+basketdate);
	}
	 @Override
	public void basketRegister() {
		// TODO Auto-generated method stub
		 System.out.println("You registerd For Basketball, Your Compition Details:- "+"Fees:- "+basketFees+" Date:-  "+basketdate);	
	}

	@Override
	public void soloDance() {
		System.out.println("Solo Dance:-");
		System.out.println("Entry Fees:- "+soloFees);
		System.out.println("Date:- "+soloDate);
		
	}
	@Override
	public void soloDanceRegister() {
		// TODO Auto-generated method stub
		System.out.println("You registerd For Solo Dance, Your Compition Details:- "+"Fees:- "+soloFees+" Date:-  "+soloDate);	
	}

	@Override
	public void groupDance() {
		System.out.println("Group Dance:-");
		System.out.println("Entry Fees:- "+groupFees);
		System.out.println("Date:- "+groupDate);
		
	}
	@Override
	public void groupDanceRegister() {
		// TODO Auto-generated method stub
		System.out.println("You registerd For Group Dance, Your Compition Details:- "+"Fees:- "+groupFees+" Date:-  "+groupDate);	
	}
	

	@Override
	public void soloPlay() {
		System.out.println("Solo Play:-");
		System.out.println("Entry Fees:- "+soloPlayFees);
		System.out.println("Date:- "+soloPlayDate);
		
	}
@Override
public void soloPlayRegister() {
	// TODO Auto-generated method stub
	System.out.println("You registerd For Solo Play, Your Compition Details:- " +"Fees:- "+soloPlayFees+" Date:- "+soloPlayDate);	
}

	@Override
	public void squadPlay() {
		
		System.out.println("Sqad Play:-");
		System.out.println("Entry Fees:- "+squadFees);
		System.out.println("Date:- "+squadDate);
		
	}
	@Override
	public void squadPlayRegister() {
		// TODO Auto-generated method stub
		System.out.println("You registerd For Squad Play, Your Compition Details:- "+"Fees:- "+squadFees+" Date:-  "+squadDate);	
	}

	@Override
	public void soloSinging() {
		System.out.println("Solo Singing:-");
		System.out.println("Entry Fees:- "+soloFees);
		System.out.println("Date:- "+soloDate);	
	}
	@Override
	public void soloSingingRegister() {
		// TODO Auto-generated method stub
		System.out.println("You registerd For Solo Singing, Your Compition Details:- "+"Fees:- "+soloFees+" Date:-  "+soloDate);	
	}
    
	@Override
	public void groupSinging() {
		System.out.println("Group Singing:- ");
		System.out.println("Entry Fees:- "+groupSingingFees);
		System.out.println("Date:- "+groupSingingDate);
	}
@Override
public void groupSingingRegister() {
	// TODO Auto-generated method stub
	System.out.println("You registerd For Group Singing, Your Compition Details:- "+"Fees:- "+groupSingingFees+" Date:-  "+groupSingingDate);	
}
	
}

