package abstractClass;

public class StringManipulation {
	
	public static void returnValidStringFormat(String str)
	{
		String marks[] = str.split("\\|");
		String NCC = null;
		String aid = null;
		//String markCode[] = marks[0];
		
		
		
		
		System.out.println(marks[0]);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		returnValidStringFormat("100 5,100 5,100 5|1 25 0|0 20 4");
	}

}
