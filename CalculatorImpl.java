import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;

class CalculatorImpl extends UnicastRemoteObject implements Calculator
{
	public CalculatorImpl() throws java.rmi.RemoteException
	{
		super();
	}	
	public int add(int a,int b) throws java.rmi.RemoteException
	{
		return a + b;
	}
	public int minus(int a,int b) throws java.rmi.RemoteException
	{
		return a - b;
	}
	public int multi(int a,int b) throws java.rmi.RemoteException
	{
		return a * b;
	}
	public int divide(int a,int b) throws java.rmi.RemoteException
	{
		return a / b;
	}
}