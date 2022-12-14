import java.rmi.*;
import java.rmi.registry.*;

class FactorialServer
{
	public static void main(String args[])
	{
		try{
		System.out.println("Start Server.... ");
		Factorial c = new FactorialImpl();
		Registry r1 = LocateRegistry.createRegistry(8888);
		r1.bind("FactorialSum",c);

		}catch(Exception e){
			
		}
	}
}