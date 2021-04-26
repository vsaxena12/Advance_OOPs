package stringIsFun;

public class CipherDecipher 
{
	/*
	 * 1. Swap the string upper-case to lower-case and vice versa
	 * 2. Reverse the String
	 * 3. Replace the String spaces with *
	 * 4. Replace the Characters in even positions with their ASCII position
	 */
	
	
	public String cipher(String normal)
	{
		//normal = "Hello World";
		StringBuffer newStr=new StringBuffer(normal);  
		String ciphered = null;
        
        for(int i = 0; i < normal.length(); i++) {    
                
            //Checks for lower case character    
            if(Character.isLowerCase(normal.charAt(i))) {    
                //Convert it into upper case using toUpperCase() function    
                newStr.setCharAt(i, Character.toUpperCase(normal.charAt(i)));    
            }    
            //Checks for upper case character    
            else if(Character.isUpperCase(normal.charAt(i))) {    
                //Convert it into upper case using toLowerCase() function    
                newStr.setCharAt(i, Character.toLowerCase(normal.charAt(i)));    
            }    
        } 
        
        StringBuffer reverseString = newStr.reverse();
        ciphered = reverseString.toString();
        char ch = '*';    
        
        //Replace space with specific character char   
        ciphered = ciphered.replace(' ', ch);    
		
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ciphered.length(); i++) {
            if (i % 2 != 0) {
                int m = ciphered.charAt(i);
                sb.append(m); // add the ascii value to the string
            } else {
                sb.append(ciphered.charAt(i)); // add the normal character
            }
        }
        //System.out.println(sb.toString());
        sb.append (3);
		return sb.toString();
	}
	
	public String decipher(String ciphered)
	{
        String newCiphered = null;
		if ((ciphered != null) && (ciphered.length() > 0)) {
			newCiphered = ciphered.substring(0, ciphered.length() - 1);
		}
		
		StringBuilder sb = new StringBuilder();
        for (int i = 0; i < newCiphered.length(); i++) {
            System.out.println(newCiphered.charAt(i));
        }
		
        
        
		return ciphered;
	}
	
	
	
}
