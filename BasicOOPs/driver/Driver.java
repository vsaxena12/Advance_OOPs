package driver;
import myFirstMethod.PrimeChild;
import myFirstMethod.HappyChild;
import myFirstMethod.ParentFilter;
import stringIsFun.CipherDecipher;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * ParentFilter prime = new PrimeChild(); Scanner scan = new Scanner(System.in);
		 * 
		 * System.out.print("Enter the Start Element: "); int startElement =
		 * scan.nextInt(); //System.out.println(startElement);
		 * 
		 * System.out.print("Enter the End Element: "); int endElement = scan.nextInt();
		 * //System.out.println(endElement);
		 * 
		 * System.out.println(prime.filter(startElement, endElement));
		 * 
		 * 
		 * ParentFilter happy = new HappyChild();
		 * System.out.println(happy.filter(startElement, endElement));
		 */
			
			
		
		  Scanner scan = new Scanner(System.in);
		  System.out.print("Enter the String: "); String s = scan.nextLine();
		  System.out.println("S: "+s);
		  
		  CipherDecipher code = new CipherDecipher(); 
		  
		  String decode = code.cipher(s);
		  System.out.println("Lower-Upper Case: "+code.cipher(s));
		  
		  code.decipher(decode); 
		  System.out.println("Decoded: "+code.decipher(decode));
		  
		  scan.close();
		 
		
		
	}

}
