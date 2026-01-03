package methodChaining;

public class Mango {

	double price;
	String type;
	String origin;
	
//	public Mango(double price, String type, String origin ){
//		this.price = price;
//		this.type = type;
//		this.origin = origin;
//	}

	
	public Mango printPrice() {
		System.out.println(price);
		return this;	
	}
	
	public Mango printType() {
		System.out.println(type);
		return this;
		
	}
	
	public Mango printOrigin() {
		System.out.println(origin);
		return this;
	}
	
	
}

