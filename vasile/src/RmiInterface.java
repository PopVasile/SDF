
import java.rmi.*;
public interface RmiInterface extends Remote {
	
	public String[] lista(String serverpath) throws RemoteException;
	public boolean creaza(String serverpath) throws RemoteException;
	public boolean sterge(String serverpath) throws RemoteException;
       
        

}
