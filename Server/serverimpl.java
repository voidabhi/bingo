import java.rmi.*;
import java.rmi.server.*;
public class serverimpl extends UnicastRemoteObject implements serverinterface
{
	public serverimpl()throws RemoteException
	{
		super();
	}

	public void print()throws RemoteException
	{
		System.out.println("Server Implementation");
	}
}