package arrayas;

public class ArrayVotingDB {
	String name;
	int age;
	int wardNo;
	long adharNo;
	
	public ArrayVotingDB() {
		// TODO Auto-generated constructor stub
	}
	
	public ArrayVotingDB(String name, int age, int wardNo, long adharNo) {
		
		this.name = name;
		this.age = age;
		this.wardNo = wardNo;
		this.adharNo = adharNo;
		
	}
	
	public String toString() {
		
		return "[Name: "+name+",Age: "+age+",Ward No.:"+wardNo+",Adhar No.: "+adharNo+"]";
	}

}
