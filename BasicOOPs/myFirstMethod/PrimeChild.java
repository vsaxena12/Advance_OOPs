package myFirstMethod;

public class PrimeChild extends ParentFilter{
	
	/*
	 * Return a string of prime numbers
	 */
	
	public static boolean isPrime(int n) 
	{  
		if (n <= 1) 
		{  
			return false;  
		}  
   
		for (int i = 2; i <= Math.sqrt(n); i++) 
		{  
			if (n % i == 0) 
			{  
				return false;  
			}  
		}  
		return true;  
	} 
	
	public String filter(int startElement, int endElement) //Parameters 
	{
		String str = "";
		for (int i = startElement; i <= endElement; i++) 
		{  
           if (isPrime(i)) 
           {  
        	   str = str + i + " ";
               
           }
		}
		return str;
	}
}
