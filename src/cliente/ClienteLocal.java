
package cliente;

import Interface.GUI;
import cliente.IConexionCliente;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ClienteLocal extends UnicastRemoteObject implements IConexionCliente {

	
	public ClienteLocal() throws RemoteException {
	}
	public void getMensaje(String mensaje, String userName) throws RemoteException {
		GUI.showMensaje(mensaje, userName);
	}
}
