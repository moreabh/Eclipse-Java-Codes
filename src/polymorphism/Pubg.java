package polymorphism;

public class Pubg {
	int bullets = 30;
	
	public void turnRight()
	{
		System.out.println("Turned Right");
	}
	public void turnLeft()
	{
		System.out.println("Turned Right");
	}
	public void fire()
	{
		if(bullets<0)
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
	public void reload()
	{
		if(bullets>0) {
		bullets = 30;
		System.out.println("Reloaded");
		}   
	}
	public void forward(int steps)
	{
		System.out.println("Went "+steps+" Steps Forward");
	}
	public void backward(int steps)
	{
		System.out.println("Went "+steps+" Steps Forward");
	}
}
