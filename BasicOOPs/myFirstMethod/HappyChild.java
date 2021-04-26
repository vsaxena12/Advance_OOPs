package myFirstMethod;
import java.util.*;

public class HappyChild extends ParentFilter{
	 private int getNext(int n) {
        int totalSum = 0;
        while (n > 0) {
            int d = n % 10;
            n = n / 10;
            totalSum += d * d;
        }
        return totalSum;
	}
	public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();
        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = getNext(n);
        }
        return n == 1;
    }
	
	public String filter(int startElement, int endElement) //Parameters 
	{
		String str = "";
		for (int i = startElement; i <= endElement; i++) 
		{  
           if (isHappy(i)) 
           {  
        	   str = str + i + " ";
               
           }
		}
		return str;
	}
}
