// for public String toString()

package objectClass;

public class Student {
	
	String name;
	String college;
	int roll;
	String degree;
	String stream;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(String name, String college, int roll, String degree, String stream) {
		
		this.name = name;
		this.college = college;
		this.roll = roll; 
		this.degree = degree;  
		this.stream = stream;
	}
	
	public java.lang.String toString()  //String Customization 
	{
		//return name+ college+ roll+ degree+ stream;
		return "Name: "+name+"," +" college: "+college+"," + " roll: "+roll+"," + " degree: "+degree+"," + " stream: "+stream;
	}
}
