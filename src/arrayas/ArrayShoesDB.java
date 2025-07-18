package arrayas;

public class ArrayShoesDB {
	
	String brand;
	int price;
	int size;
	String type;
	
	public ArrayShoesDB() {
		// TODO Auto-generated constructor stub
	}
	
	public ArrayShoesDB(String brand, int price, int size, String type  ) {
		
		this.brand = brand;
		this.price = price;
		this.size = size;
		this.type = type;
		
	}
	
	public String toString()
	{
		return "[Brand :"+brand+",Price: "+price+",Size: "+size+",Type: "+type+"]";
	}
	
	public boolean equals(Object o) {
		
		ArrayShoesDB ardb = (ArrayShoesDB) o;
		
		return this.brand == brand && this.price == price && this.size == size &&  this.type == type;
	}
	
}
