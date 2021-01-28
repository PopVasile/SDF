

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.logging.Level;
import java.util.logging.Logger;


public class RmiImplementation extends UnicastRemoteObject implements RmiInterface, Serializable{

	protected RmiImplementation(String s) throws RemoteException {
		File storageDir = new File (s);
		storageDir.mkdir();
	}
	
    
	
        @Override
	public String[] lista(String serverpath) throws RemoteException {
		File serverpathdir = new File(serverpath);
		return serverpathdir.list();
		
	}
	
        @Override
	public boolean creaza(String serverpath) throws RemoteException {	
		File serverpathdir = new File(serverpath);
		try{
                    return serverpathdir.createNewFile();
                } catch (IOException ex) {
                Logger.getLogger(RmiImplementation.class.getName()).log(Level.SEVERE, null, ex);
            }
		return false;
	}

        @Override
	public boolean sterge(String serverpath) throws RemoteException {
		File serverpathdir = new File(serverpath);
                
		return serverpathdir.delete();
		
	}
    
}
