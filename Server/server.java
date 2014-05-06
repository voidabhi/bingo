import java.rmi.*;
public class server
{
	public static void main(String[] args)throws RemoteException
	{
		try
		{
		serverinterface si=new serverimpl();
		Naming.rebind("SS",si);
		System.out.println("Ready");
		}
		catch(Exception e){System.out.println(e);}
	}
}
