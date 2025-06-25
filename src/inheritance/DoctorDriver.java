package inheritance;

public class DoctorDriver {
	
	public static void main(String [] args)
	{
		Cardiologist c1 = new Cardiologist("Ramesh", 300.0, "MD(Cardio)", 4, "Sahyadri Hospital", "Heart",
				"Cardio Specialist");
		
		c1.displayDoctor();
		c1.displayCardiologist();
		
		System.out.println("________________________________________________________");
		
		Neurologist n1 = new Neurologist("Rajesh", 500.0, "MD(NeuroLogist)", 8, "Poona Hospital", "Brain",
				"Brain Specialist");
		
		n1.displayDoctor();
		n1.displayNeurologist();
	}
}
/*
O/P :-
Ramesh
300.0
MD(Cardio)
4
Sahyadri Hospital
Ramesh
300.0
MD(Cardio)
4
Sahyadri Hospital
Heart
Cardio Specialist
________________________________________________________
Rajesh
500.0
MD(NeuroLogist)
8
Poona Hospital
Rajesh
500.0
MD(NeuroLogist)
8
Poona Hospital
Brain
Brain Specialist
*/
