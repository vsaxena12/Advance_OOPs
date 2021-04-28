package CharacterEncoding;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class IODemoEncoding {
	
	public void applyEncoding()
	{
		printEncodingDetails("a");
		printEncodingDetails("#");
		printEncodingDetails("\u1F602");
	}
	private static void printEncodingDetails(String symbol)
	{ 
		System.out.println("\nSymbol: "+symbol);
		try {
			System.out.println("ASCII: " + Arrays.toString(symbol.getBytes("US-ASCII")));
			System.out.println("ISO-8859-1: " + Arrays.toString(symbol.getBytes("ISO-8859-1")));
			System.out.println("UTF-8: " + Arrays.toString(symbol.getBytes("UTF-8")));
			System.out.println("UTF-16: " + Arrays.toString(symbol.getBytes("UTF-16")));
			System.out.println("UTF-16 BE: " + Arrays.toString(symbol.getBytes("UTF-16BE")));
			System.out.println("UTF-16 LE: " + Arrays.toString(symbol.getBytes("UTF-16LE")));
		}
		catch(Exception e1) {
			e1.printStackTrace();
		}
	}
}
