/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clientermi;

import cliente.Mensaje;
import cliente.IConexionCliente;

/**
 *
 * @author IPET
 */
public class ClienteRmiConcreteLocal  implements IConexionCliente  {
    ServidorLocal miservidor;
    
    
    @Override
    public boolean conectar(String ip , int puerto) {
        return true;
    }

    @Override
    public boolean recibirMsj(Mensaje msj) {
        System.out.println(msj);
        
        return true;
    }

  
    @Override
    public void desconectar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean enviarMsj(Mensaje mensaje) {
        miservidor.RecibirMensaje("Cliente recibio : " +mensaje.toString());
        return true;
    }

   
}
