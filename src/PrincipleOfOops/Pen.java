package PrincipleOfOops;

public class Pen {
	String brand;
	double price;
	String type;
	Refill rf;
	
	public Pen(){}
	
	public Pen(String brand, double price, String type, String color, double size, String refillType, double refPrice)
	{
		
		rf = new Refill(color, size, refillType, refPrice);
		
		this.brand = brand;
		this.price = price;
		this.type = type;
		System.out.println("Pen Created");
		
	}
	
	public void displayPen()
	{
		System.out.println(brand);
		System.out.println(price);
		System.out.println(type);
	}	
}
