package polymorphism;

public class PubgV2 extends Pubg {
	
	public void turnLeft()
	{
		System.out.println("Turned Left");
	}
	public void backward(int steps)
	{
		System.out.println("went "+steps+" Steps Backward");
	}
	public void fire()
	{
		if(bullets>0)
		{
			bullets--;
			System.out.println("Fired");
			System.out.println("Bullets Left "+bullets);
		}
		else
		{
			System.out.println("Reload");
		}
   }
}

