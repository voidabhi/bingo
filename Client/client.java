import java.rmi.*;
public class client
{
	public static void main(String[] args)throws Exception
	{
		try
		{
			serverinterface si=(serverinterface)Naming.lookup("SS");
			si.print();
		}
		catch(Exception e){}
	}
}
