package arrayas;

public class ArrayStudentDB {
	
	String name;
	String Collage;
	int roll;
	int age;
	
	public ArrayStudentDB() {
		// TODO Auto-generated constructor stub
	}
	
	public ArrayStudentDB(String name, String Collage, int roll, int age) 
	{
		this.name = name;
		this.Collage = Collage;
		this.roll = roll;
		this.age = age;
	}
	
	public String toString()
	{
		return "[Name:"+name+",Collage: "+Collage+",roll: "+roll+",age: "+age+"]";
	}

}
