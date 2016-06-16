package Servidor;
import cliente.IConexionCliente;
import java.rmi.*;

/**
 * This interface extends the class Remote and specifies the remote accessible 
 * methods login and broadcast, which can be accessed externally. 
 * @autor Matthias Braunhofer
 */
public interface IconexionServidor extends Remote {

	public void login(IConexionCliente client, String userName) throws RemoteException;
	
	public void enviarMensaje(String mensaje, String userName) throws RemoteException;
}

