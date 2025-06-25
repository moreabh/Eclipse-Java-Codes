package inheritance;

public class AeroplaneDriver {
	
	public static void main(String[]args)
	{
		Aeroplane a1 = new Aeroplane("airline", 50000000, 2, 2025, 1000, 500, 300, 150);
		
		a1.displayAeroplane();
		System.out.println("___________________________________________________");
		
		
		FighterPlane f1 = new FighterPlane("F-16", 800000000, 4, 2026, 2000, 1000, 500,
				2, 3, 2, 5000, 1, 1);
		
		f1.displayAeroplane();
		f1.displayFighterPlane();
		System.out.println("___________________________________________________");
		
		
		
		Sukhoi s1 = new Sukhoi("Hindustan Aeronautics Limited", 100000000, 5, 2025, 3000, 
				1000, 500, 3, 1, 3, 3000, 2, 1, "indian", 4, "air-to-air","india", "Hindustan air limited");
		
		s1.displayAeroplane();
		s1.displayFighterPlane();
		s1.displaySukhoi();
	}
	
}

/*
 O/P:- 
 airline
5.0E7
2
2025
1000
500
300
0
___________________________________________________
F-16
8.0E8
4
2026
2000
1000
500
0
F-16
8.0E8
4
2026
2000
1000
500
0
3
2
5000
1
1
___________________________________________________
Hindustan Aeronautics Limited
1.0E8
5
2025
3000
1000
500
0
Hindustan Aeronautics Limited
1.0E8
5
2025
3000
1000
500
0
1
3
3000
2
1
Hindustan Aeronautics Limited
1.0E8
5
2025
3000
1000
500
0
1
3
3000
2
1
indian
4
air-to-air
india
Hindustan air limited
*/
