import java.io.*;
import java.util.*;

class Register {
    
    private static Register register = null;
    /*
     * Complete the 'getTotalBill' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts MAP itemDetails as parameter.
     */
     
    private Register() {}
    
    public static synchronized Register getInstance()
    {
        if(register == null)
            register = new Register();
        return register;
    }

    public String getTotalBill(Map<String,Integer> itemDetails) {

        // Write your code here
        double apple = 0;
        double orange = 0;
        double mango = 0;
        double grape = 0;
        
        if(itemDetails.containsKey("apple"))
        {
            apple = itemDetails.get("apple");
            apple = apple * 2.0;
            
        }
        if(itemDetails.containsKey("orange"))
        {
            orange = itemDetails.get("orange");
            orange = orange * 1.5;
            
        }
        
        if(itemDetails.containsKey("mango"))
        {
            mango = itemDetails.get("mango");
            mango = mango * 1.2;
            
        }
        
        if(itemDetails.containsKey("grape"))
        {
            grape = itemDetails.get("grape");
            grape = grape * 1.0;
            
        }
        
        System.out.println("Output: "+itemDetails.toString()+"\n"+apple+"\n"+orange+"\n"+mango+"\n"+grape);

        Double result = apple + orange + mango + grape;
        
        return result.toString();
    }

}


public class SolutionSingleton {
    public static void main(String[] args) throws IOException {
        
        Scanner readInput = new Scanner(System.in);        
        String[] input=readInput.nextLine().split(" ");                
        Map<String,Integer> myItems=new HashMap<String,Integer>();
        for(int i=0;i<input.length;i+=2){
          myItems.put(input[i],Integer.parseInt(input[i+1]));	
        }
        Register regObj = Register.getInstance();        
        System.out.println(regObj.getTotalBill(myItems));
        readInput.close();
        
    }
}