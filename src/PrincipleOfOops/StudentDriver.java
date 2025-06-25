//Driver Code Of Student 
package PrincipleOfOops;

public class StudentDriver {
	public static void main(String[]args)
	{
		Student s1 = new Student("Raju", 35000, 9.5, "B-tech", 91.30,90.0, 9876543210l);
		
		System.out.println(s1.getCgpa());
		System.out.println(s1.getDegree());
		System.out.println(s1.getFees());
		System.out.println(s1.getInstituteName());
		System.out.println(s1.getName());
		System.out.println(s1.getSscPer());
		System.out.println(s1.getHsc());
		System.out.println(s1.getPhoneNo());
		
		s1.setInstituteName("Hudpsar", "Raju");
		s1.setPhoneNo(9876543210l, 1234567890l);
	}
}

/*
 35000.0
Q-spider
Raju
91.3
90.0
9876543210
Institute Changed!
Changed Institute: Hudpsar
Phone Number Changed!
Changed Phone No.: 1234567890
*/
