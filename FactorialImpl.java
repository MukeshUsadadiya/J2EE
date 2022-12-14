import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;

class FactorialImpl extends UnicastRemoteObject implements Factorial
{
	public FactorialImpl() throws java.rmi.RemoteException
	{
		super();
	}	
	public int sum(int a) throws java.rmi.RemoteException
	{
		int i,f=1;
		for(i=1;i<=a;i++)
		{
			f=f*i;
		}
		return f;
	}
}