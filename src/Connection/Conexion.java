/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;

import cliente.ClienteLocal;
import Servidor.IconexionServidor;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 *
 * @author F1
 */
public class Conexion {
 ClienteLocal l ;
    private ClienteLocal client;
    private IconexionServidor server;

    public void conectar(String host, String userName) throws NotBoundException, MalformedURLException, RemoteException {

        server = (IconexionServidor) Naming.lookup("//" + host + "/Server");
        client = new ClienteLocal();
        server.login(client, userName);

    }
    public void enviarMensaje(String mensaje, String userName) {
        try {
            server.enviarMensaje(mensaje, userName);
        } catch (RemoteException ex) {
            
        }
    }
}
