//2. strimpl

import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;

class strimpl extends UnicastRemoteObject implements str
{
	public strimpl() throws java.rmi.RemoteException 
	{
		super();	
	} 
	public String add(String nm) throws java.rmi.RemoteException
	{
		StringBuffer sr = new StringBuffer(nm);
		sr.reverse();
		return sr.toString();
	}
}
