import java.rmi.*;
import java.rmi.registry.*;

public interface Calculator extends Remote
{
	public int add(int a,int b) throws java.rmi.RemoteException;
	public int minus(int a,int b) throws java.rmi.RemoteException;
	public int multi(int a,int b) throws java.rmi.RemoteException;
	public int divide(int a,int b) throws java.rmi.RemoteException;
}		