/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clientermi;

import java.rmi.*;
import java.rmi.server.*;

/**
 *
 * @author IPET
 */
public class MensajeRemotoImpl extends UnicastRemoteObject implements MensajeRemoto{

    @Override
    public String RecibirMensaje(String s) throws RemoteException {
        return "";
    }
    
     MensajeRemotoImpl() throws RemoteException {
     }
     
     
    public String eco(String s) throws RemoteException {
        return s.toUpperCase();
    }

    @Override
    public String EnviarMensaje(String s) throws RemoteException {
        return "";
    }
    
}
