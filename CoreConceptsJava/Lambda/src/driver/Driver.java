package driver;

public class Driver {

	public void greet(interfaceDriver testDriver)
	{
		testDriver.perform();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Driver driver = new Driver();
		//HelloWorld hello = new HelloWorld();
		//driver.greet(hello);
		
		
		//Implementing a function and not a class
		//functional interface -> Only one interface method
		//Provides in-line functions using Lambda 
		
		interfaceDriver mylambda = ()->System.out.println("Hi");
		mylambda.perform();
	}

}

