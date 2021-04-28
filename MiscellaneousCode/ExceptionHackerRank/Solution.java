package ExceptionHackerRank;

import java.util.Scanner;

class InvalidMessageException extends Exception
{
	InvalidMessageException(String s){
		super(s);
	}
}

class Encrypter
{
    static String encryptMessage(String name) throws InvalidMessageException
    {
        
        String reverse = null;
        
	    if(Validator.validate(name) && name.length() < 100)
        {
            byte strAsByteArray[] = name.getBytes();
            byte[] result = new byte[strAsByteArray.length];

            // Store result in reverse order into the
            // result byte[]
            for (int i = 0; i < strAsByteArray.length; i++)
                result[i] = strAsByteArray[strAsByteArray.length - i - 1];
            reverse = new String(result);
            reverse = reverse.toLowerCase();
            return reverse;
        }
        else
        	throw new InvalidMessageException("Try again with valid message");
        
        
    }
}








class Validator {
    public static boolean validate(String message) {
        return message.matches("[A-Za-z0-9 ]+");
    }
}





public class Solution {
    private static final Scanner INPUT_READER = new Scanner(System.in);
    
    public static void main(String[] args) {
        String message = INPUT_READER.nextLine();
        
        try {
            String encrypted_message = Encrypter.encryptMessage(message);
            if(! encrypted_message.startsWith("InvalidMessageException"))
                System.out.println(encrypted_message);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
