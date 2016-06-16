package Servidor;
import cliente.IConexionCliente;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class ServidorLocal extends UnicastRemoteObject implements IconexionServidor {

    protected ArrayList<IConexionCliente> clients = new ArrayList<IConexionCliente>();

    public ServidorLocal() throws RemoteException {
    }

    public void login(IConexionCliente cliente, String userName) throws RemoteException {
        enviarMensaje(">>> " + userName + " Está en el Grupo!!!", "");
        clients.add(cliente);
    }

    public void enviarMensaje(String mensaje, String userName) throws RemoteException {
        for (int i = 0; i < clients.size(); i++) {
            IConexionCliente c = clients.get(i);
            try {
                c.getMensaje(mensaje, userName);
            } catch (RemoteException e) {
                salir(c);
                i = i - 1;
            }
        }
    }
    public void salir(IConexionCliente cliente) {
        clients.remove(cliente);
    }

    public static void main(String[] args) {
        try {
            Naming.rebind("Server", new ServidorLocal());
            System.out.println("Servidor listo --> OK");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

    
    
    
    

