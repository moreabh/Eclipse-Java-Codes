package wrapperClasses;

public class CameraDriver {
	public static void main(String[] args) {
		
		Camera c1 = new Camera("Canon",500000, 48, 4, true);
		Camera c2 = new Camera("Canon",500000, 48, 4, true);
		
		System.out.println(c1);
		System.out.println(c1==c2);  //false comparing its object reference
		
		System.out.println(c1.equals(c2)); //true Comparing its attributes 
		
		System.out.println(c1.hashcode());
		System.out.println(c2.hashcode());
	}

}
/*
 * [Brand: Canon,Price: 500000.0,MP: 48, NightVision: true]
false
true
1157395218
1157395218
*/
