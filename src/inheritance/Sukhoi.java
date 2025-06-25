package inheritance;

public class Sukhoi extends FighterPlane {
	
	String model;
	int years;
	String weapon;
	String country;
	String service;
	
	public Sukhoi() 
	{
		//Default Constructor
	}
	
	public Sukhoi(String brand, double price, int engines, int year, int fuelCap, 
			int speed, int wt, int cap, int gen, int seat, int range, int type, int refuel, 
			String model, int years, String weapon, String country, String service)
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
		
		this.model = model;
		this.years = years;
		this.weapon = weapon;
		this.country = country;
		this.service = service;
	}
	
	public void displaySukhoi()
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
		
		System.out.println(model);
		System.out.println(years);
		System.out.println(weapon);
		System.out.println(country);
		System.out.println(service);
	}

}
