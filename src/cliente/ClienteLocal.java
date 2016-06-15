/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

import GUICliente.GUICliente;
import cliente.Mensaje;
import cliente.IConexionCliente;
import observer.ClienteChat;
import observer.ServidorChat;

/**
 *
 * @author IPET
 */
public class ClienteLocal extends ClienteChat  {
    private ServidorLocal servidor;
    GUICliente guic ;
    String nickname;
    public ClienteLocal(String nickname) {
        guic = new GUICliente();
        guic.setVisible(true);
        guic.setC(this);
        this.nickname = nickname;
        guic.setnicknamelabel(nickname);
    }
 
    
    public ServidorLocal getServidor() {
        return servidor;
    }

    public void setServidor(ServidorLocal miservidor) {
        this.servidor = miservidor;
    }
    
    
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
        servidor.recibirMensaje(nickname+": " +mensaje.toString());
        return true;
    }


    @Override
    public void actualizar(Mensaje m) {
        guic.addMensaje(m.toString());
    }

   
}
