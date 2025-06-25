package objectClass;

public class ShapesImp implements Shapes {
	
	@Override
	public void areaOfCircle(int rad) {
		
		double area = pi*(rad*rad);
		System.out.println("Area Of Circle: "+area);
	}
	
	@Override
	public void areaOfSquare(int sides) {
	
		int area = sides * sides;
		System.out.println("Area Of Square: "+area);
	}
	
	@Override
	public void perimeterOfSquare(int sides) {
	
		int perimeter = 4 * sides;
		System.out.println("Perimeter Of Square: "+perimeter);
	}
}
