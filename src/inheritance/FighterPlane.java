package inheritance;

public class FighterPlane extends Aeroplane {
	
	int gen;
	int seat;
	int range;
	int type;
	int refuel;
	
	public FighterPlane() {
		//Default Constructor
	}
	
	public FighterPlane(String brand, double price, int engines, int year, int fuelCap, 
			int speed, int wt, int cap, int gen, int seat, int range, int type, int refuel)
	{
		this.brand = brand;
		this.price = price;
		this.engines = engines;
		this.year = year;
		this.fuelCap =fuelCap;
		this.speed = speed;
		this.wt = wt;
		this.year = year;
		
		this.gen = gen;
		this.seat =seat;
		this.range = range;
		this.type = type;
		this.refuel = refuel;
	}
	
	public void displayFighterPlane()
	{
		System.out.println(brand);
		System.out.println(price);
		System.out.println(engines);
		System.out.println(year);
		System.out.println(fuelCap);
		System.out.println(speed);
		System.out.println(wt);
		System.out.println(cap);
		
		System.out.println(gen);
		System.out.println(seat);
		System.out.println(range);
		System.out.println(type);
		System.out.println(refuel);
	}
}
