//Encapsulation Data Hinding:-
//bluePrint of Student
package PrincipleOfOops;

public class Student {
	private String institutionName = "Q-spider";
	private String name;
	private double fees;
	private double cgpa;
	private String degree;
	private double sscPer;
	private double hscPer;
	private long phno;
	
	public Student(String name, double fees, double cgpa, String degree, double sscPer, double hscPer, long phno) 
	{
		this.name = name;
		this.fees = fees;
		this.cgpa = cgpa;
		this.degree = degree;
		this.sscPer = sscPer;
		this.hscPer = hscPer;
		this.phno = phno;
	}
	
	public String getInstituteName ()
	{
		return institutionName;
	}
	public void setInstituteName( String newName, String name)
	{
		if(this.name == name )
		{
			institutionName = newName;
			System.out.println("Institute Changed!");
			System.out.println("Changed Institute: "+institutionName);
			
		}
		else {
			System.out.println("Authentication Fail!!!!");
		}
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getFees()
	{
		return fees;
	}
	
	public double getCgpa()
	{
		return cgpa;
	}
	
	public String getDegree()
	{
		return degree;
	}
	
	public double getSscPer()
	{
		return sscPer;
	}
	 
	public double getHsc()
	{
		return hscPer;
	}
	
	public long  getPhoneNo()
	{
		return phno;
	}
	
	public void setPhoneNo(long phno, long newPhone)
	{
		if( this.phno != newPhone )
		{
			phno = newPhone;
			System.out.println("Phone Number Changed!");
			System.out.println("Changed Phone No.: "+phno);
		}
		else
		{
			System.out.println("Don't Repeat Old Phone Number");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
