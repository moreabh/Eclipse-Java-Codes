package selfJavaDBCreation;

public class Employee {
	
	String name;
	int empid;
	int deptNo;
	int managerNo;
	String hireDate;
	double sal;
	double job;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(String name, int empid, int deptNo, int managerNo, 
			String hireDate, double sal, double job) {
		
		this.name = name;
		this.empid =  empid;
		this.deptNo = deptNo;
		this.managerNo = managerNo;
		this.hireDate = hireDate;
		this.sal = sal;
		this.job = job;
	}
	
	public String toString() {
		
		return "[Name: "+name+",Emp_ID: "+empid+",Dep_No"+deptNo+",ManagerNo: "+managerNo+
				",Hire_Date: "+hireDate+",Salary: "+sal+",Job_Role"+job+"]";
	}
	
	
	

}
