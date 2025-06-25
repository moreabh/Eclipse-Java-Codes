// for public int hashCode()

package objectClass;

public class Worker {
	
	String name;
	int id;
	String company;
	String role;
	
	public Worker() {
		// TODO Auto-generated constructor stub
	}
	
	public Worker(String name, int id, String company, String role) {
		
		this.name = name;
		this.id = id;
		this.company = company;
		this.role = role;
		
	}
	
	public boolean equals(Object o) {
		
		Worker w1 = (Worker) o;
		
		if(this.name == w1.name && this.id == w1.id && this.company == w1.company && this.role == w1.role)
		{
			return true;
		}
		else {
			return false;
		}
	}
	
	public int hashCode() {
		return name.hashCode() + id + company.hashCode() + role.hashCode();   
	}
}
