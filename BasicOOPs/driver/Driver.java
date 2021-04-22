package driver;
import myFirstMethod.PrimeChild;
import myFirstMethod.ParentFilter;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParentFilter prime = new PrimeChild();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the Start Element: ");
		int startElement = scan.nextInt();
		//System.out.println(startElement);
		
		System.out.print("Enter the End Element: ");
		int endElement = scan.nextInt();
		//System.out.println(endElement);
		
		System.out.println(prime.filter(startElement, endElement));
		
	}

}
