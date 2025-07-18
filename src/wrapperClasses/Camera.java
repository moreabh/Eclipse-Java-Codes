package wrapperClasses;

public class Camera {
	String brand;
	double price;
	int mp;
	int ports;
	boolean nightVision;
	
	public Camera() {
		// TODO Auto-generated constructor stub
	}
	
	public Camera(String brand, double price, int mp, int ports, boolean nightVision) {
		
		this.brand = brand;
		this.price = price;
		this.mp = mp;
		this.ports = ports;
		this.nightVision = nightVision;
		
	}
	
	public String toString() {
		
		return "[Brand: "+brand+",Price: "+price+",MP: "+mp+", NightVision: "+nightVision+"]";
	}
	
	public boolean equals(Object o)
	{
		if(o !=null) 
		{
			Camera c = (Camera)o;
		
			return this.brand == brand && this.price == price && this.mp == mp &&
					this.nightVision == nightVision;
		}
		return false;
		
	}
	
	public int hashcode()
	{
		return brand.hashCode()+ Double.hashCode(price)+mp+ports+Boolean.hashCode(nightVision);
	}
}
