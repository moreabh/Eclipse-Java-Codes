package abstraction;

public class CalculatorDriver {
	
	public static void main(String[] args)
	{
		Calculator c1 = new CalculatorImp();
		
		c1.addition(10,30);
		c1.substraction(100, 1);
		c1.multiplication(100, 0);
		c1.division(1000, 100);
	}
}
/*
 40
99
0
10.0
*/
