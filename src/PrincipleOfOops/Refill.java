package PrincipleOfOops;

public class Refill {
	String brand;
	double refPrice;
	String color;
	double size;
	
	public Refill() {}
	
	public Refill(String brand, double refPrice, String color, double size)
	{
		this.brand = brand;
		this.refPrice = refPrice;
		this.color = color;
		this.size = size;
		System.out.println("Refill Created");
	}
	public void displayRefill()
	{
		System.out.println("................Refill Specifications.........");
		System.out.println(brand);
		System.out.println(refPrice);
		System.out.println(color);
		System.out.println(size);
	}
}
