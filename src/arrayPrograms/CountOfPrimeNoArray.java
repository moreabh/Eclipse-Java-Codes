package arrayPrograms;

public class CountOfPrimeNoArray 
{

    public static void main(String[] args) 
    {
    	int count = 0;

        int[] ar = { 2, 3, 5, 7, 11, 12, 14};
        
        for (int i = 0; i < ar.length; i++) 
        {
        	if(isPrime(ar[i])) 
        	{
        		count++;
        		System.out.println(ar[i]);
        	}
		}
        System.out.println("Count of Prime: "+count); 
    }

    public static boolean isPrime(int num)
    {
    	int den = 2;
        
    	if (num <= 1) 
        {
            return false;
        }
        
    	while(den<num)
    	{
    		if(num % den == 0)
    		{
    			break;
    		}
    		den++;
    	}
    	return num == den;  
    }
}
/*
 * 2
3
5
7
11
Count of Prime: 5
*/
