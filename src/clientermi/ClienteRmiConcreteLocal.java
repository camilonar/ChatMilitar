/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clientermi;

/**
 *
 * @author IPET
 */
public class ClienteRmiConcreteLocal extends Subject implements IConexioncliente  {
    ServidorLocal miservidor;
    
    
    @Override
    public boolean conectar() {
        return true;
    }

    @Override
    public boolean recibirMsj(String mensaje) {
        System.out.println(mensaje);
        this.notificaraTodos();
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
