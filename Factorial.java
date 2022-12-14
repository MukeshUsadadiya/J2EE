import java.rmi.*;
import java.rmi.registry.*;

public interface Factorial extends Remote
{
	public int sum(int a) throws java.rmi.RemoteException;
}		