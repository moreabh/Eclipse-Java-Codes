package abstraction;

public class CalculatorImp extends Calculator {
	
	public void addition(int x,int y)
	{
		System.out.println(x+y);
	}
	
	public void substraction(int a, int b)
	{
		System.out.println(a-b);
	}
	
	public void multiplication(int c, int d)
	{
		System.out.println(c*d);
	}
	
	public void division(double e, double f)
	{
		System.out.println(e/f);
	}
}
