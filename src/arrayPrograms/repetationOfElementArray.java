package arrayPrograms;

public class repetationOfElementArray {
	public static void main(String[] args) {
		
		int [] ar = {2,3,4,5,6,2,3,4,3,3,3,3,3,3};
		System.out.println(repetationElement(ar)); 
		
	}
	
	public static int repetationElement(int[]ar)
	{
		int count = 0;
		int key = 3;
		for (int i = 0; i < ar.length; i++)
		{
			if(key == ar[i])
			{
				count++;
			}
		}
		System.out.println("No:"+key+", Repetation: "+count);
		return count;
	}
}
/*
 * No:3, Repetation: 8
8
*/
