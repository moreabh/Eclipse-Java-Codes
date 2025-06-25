//multilevel inheritance 

package inheritance;

public class Aeroplane {
	
	String brand;
	double price;
	int engines;
	int year;
	int fuelCap;
	int speed;
	int wt;
	int cap;
	
	public Aeroplane() {
		//Default constructor
	}
	
	public Aeroplane(String brand, double price, int engines, int year, int fuelCap, 
			int speed, int wt, int cap) 
	{
		this.brand = brand;
		this.price = price;
		this.engines = engines;
		this.year = year;
		this.fuelCap =fuelCap;
		this.speed = speed;
		this.wt = wt;
		this.year = year;
		
	}
	
	public void displayAeroplane()
	{
		System.out.println(brand);
		System.out.println(price);
		System.out.println(engines);
		System.out.println(year);
		System.out.println(fuelCap);
		System.out.println(speed);
		System.out.println(wt);
		System.out.println(cap);
	}
}
