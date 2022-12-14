import java.rmi.*;
import java.rmi.registry.*;

class FactorialClient
{
	public static void main(String args[]) 
	{
		try{
		System.out.println("Start Client.... ");
		Registry r1 = LocateRegistry.getRegistry("localhost",8888);
		Factorial c = (Factorial) r1.lookup("FactorialSum");
		int ans = c.sum(5);
		System.out.println("Factorial is : " + ans);
		}
		catch(Exception e) {
		System.out.println("Error : "+e);	
		}
	}
}