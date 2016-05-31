/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clientermi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author IPET
 */
public interface MensajeRemoto extends Remote{
    String RecibirMensaje (String s) throws RemoteException;
    String EnviarMensaje (String s) throws RemoteException;
        
}
