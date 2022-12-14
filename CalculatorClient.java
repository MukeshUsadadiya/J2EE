import java.rmi.*;
import java.rmi.registry.*;

class CalculatorClient
{
	public static void main(String args[]) 
	{
		try{
		System.out.println("Start Client.... ");
		Registry r1 = LocateRegistry.getRegistry("localhost",8888);
		Calculator c = (Calculator) r1.lookup("CalculatorService");
		int ans1 = c.add(10,20);
		int ans2 = c.minus(20,10);
		int ans3 = c.multi(20,10);
		int ans4 = c.divide(20,10);
		System.out.println("Total is : " + ans1);
		System.out.println("Minus is : " + ans2);
		System.out.println("Multi is : " + ans3);
		System.out.println("Divide is : " + ans4);
		}
		catch(Exception e) {
		System.out.println("Error : "+e);	
		}
	}
}