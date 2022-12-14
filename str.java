//1. str

import java.rmi.*;
import java.rmi.registry.*;

public interface str extends Remote
{
	public String add(String nm) throws java.rmi.RemoteException;
}
	