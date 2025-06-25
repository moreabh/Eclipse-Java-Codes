//instanceof operator
//It is use to check if an object has all the members of specific class or subclass

package inheritance;

public class FatherSonDriver2 {     
	
	public static void main(String []args)
	{  
		Son s1 = new Son();
		
		System.out.println(s1 instanceof Son);//true 
		System.out.println(s1 instanceof Father);//true
		
		Father f1 = new Father();
		
		System.out.println(f1 instanceof Father); // true 
		System.out.println(f1 instanceof Son); // false
		//System.out.println(f1 instanceof Neurologist); CTE
	   }

}
