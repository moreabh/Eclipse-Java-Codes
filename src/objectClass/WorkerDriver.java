package objectClass;

public class WorkerDriver {
	
	public static void main(String[]args) {
		
		Worker w1 = new Worker("Ram",34, "TCS", "Software Tester");
		
		Worker w2 = new Worker("Ram",34, "TCS", "Software Tester");
		
		System.out.println(w1.hashCode()); //Checking for same hashCode 
		System.out.println(w2.hashCode()); //Because both object has same attributes
		
		System.out.println(w2.equals(w1)); // comparing both object by their attributes
		
		System.out.println(w2.toString()); //Checking both object reference 
		System.out.println(w1.toString());
	}

}
