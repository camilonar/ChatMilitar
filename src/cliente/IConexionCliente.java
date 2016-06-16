package cliente;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IConexionCliente extends Remote {
	
	public void getMensaje(String mensaje, String userName) throws RemoteException;
}
