import java.rmi.*;
public interface serverinterface extends Remote
{
	public void print()throws RemoteException;
}
