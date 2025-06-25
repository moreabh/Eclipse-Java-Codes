package inheritance;

public class FatherUpcastingSonUpcastingDriver
{
	
	 public static void main(String[]args)
	 {
		//Here first upcasting was done then the Downcast Done  
		 
		 
		 FatherUpcasting f1 = new SonUpcasting();   // Upcasting
		 
		 f1.drinking();
	//	 f1.smoking();   CTE
		 
		 SonUpcasting s1 =  (SonUpcasting) f1;      // Downcasting 
		 
		 s1.drinking();
		 s1.smoking();
	 
		 
/*
// Here without upcasting downcasting was done so here class cast exception occurs .  
		 
		 FatherUpcasting f1 = new FatherUpcasting();
		 
		 SonUpcasting s1 = (SonUpcasting) f1; // class cast exception occuring 
		 //without upcasting downcasting was done here.
		 
		 s1.smoking();
		 s1.drinking(); */
	 }	 
		 
}        