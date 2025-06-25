package objectClass;

public class ShapesDriver {
	
	public static void main(String[] args) {
		
		Shapes s1 = new ShapesImp();
		
		s1.areaOfCircle(5);
		s1.areaOfSquare(15);
		s1.perimeterOfSquare(15);
	}
}

/*
Area Of Circle: 78.5
Area Of Square: 225
Perimeter Of Square: 60 
*/
     