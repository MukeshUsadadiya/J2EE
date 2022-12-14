import java.rmi.*;
import java.rmi.registry.*;

class CalculatorServer
{
	public static void main(String args[])
	{
		try{
		System.out.println("Start Server.... ");
		Calculator c = new CalculatorImpl();
		Registry r1 = LocateRegistry.createRegistry(8888);
		r1.bind("CalculatorService",c);

		}catch(Exception e){
			
		}
	}
}