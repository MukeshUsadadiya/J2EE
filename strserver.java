//3. strserver

import java.rmi.*;
import java.rmi.registry.*;

class strserver
{
	public static void main(String args[])
	{
		try{
		System.out.print("Server Start..");
		str s = new strimpl();
		Registry r1 = LocateRegistry.createRegistry(8383);
		r1.bind("strservices",s);
		}
		catch(Exception e){}
	}
}