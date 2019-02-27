package rmi;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import rmi.*;
public class Logout extends Pedido {
	
	public String username = "";
    public String password = ""; 
    public String type = "";
    
	public Logout(String type,String username) {
		super(Pedido);
		this.username=username;
		this.password = password;
		this.type = type;

	}
	
	 @Override
	    public Response execute(RMI rmiServer){
		 	
	        boolean verifica = false;
	        while(!verifica){
	            try {
	            	/*
	                rmiServer  = (RMI) LocateRegistry.getRegistry(TCPserver.RMIadress, TCPserver.rmiport).lookup("rmi");
	                */
	            	rmiServer  = (RMI) LocateRegistry.getRegistry("localhost", 12345).lookup("rmi");
	                
	                rmiServer.sair(username);
	                verifica = true;
	                return new Response(type);
	            } catch (RemoteException e) {
	                verifica = false;
	            }  catch (NotBoundException e) {
	                System.out.println(e);
	            }
	        }

	        return new Response(type,new String[]{""});
	    }

	

}
