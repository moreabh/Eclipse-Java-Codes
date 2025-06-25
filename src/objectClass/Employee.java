//for public boolean equals(Object o)

package objectClass;

public class Employee {
	
	String name;
	int age;
	double salary;
	String company;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(String name, int age, double salary, String company) {
		
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.company = company;
	}
	
	public boolean equals(Object o) 
	{
		
		Employee e1 = (Employee) o; //Downcasting
		
		if(this.name == e1.name && this.age == e1.age && this.salary == e1.salary && this.company == e1.company)
		{
			return true;
		}
		else
		{
			return false;  
		}
     }
	
	
}



