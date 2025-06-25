package objectClass;

public class StudentDriver {
	
	public static void main(String[]args)
	{            
		Student s1 = new Student("Raju", "FC college", 1234, "BE", "IT");
		System.out.println(s1);
		 
		Student s2 = new Student("Rani", "Modern College", 5345, "BE", "ENTC");
		System.out.println(s2);
	}	
}