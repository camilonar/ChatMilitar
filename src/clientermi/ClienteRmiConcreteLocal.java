/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clientermi;

/**
 *
 * @author IPET
 */
public class ClienteRmiConcreteLocal extends Subject implements ClienteInterfaz  {
    ServidorLocal miservidor;
    
    
    @Override
    public boolean ConectarseAlServer() {
        return true;
    }

    @Override
    public boolean RecibirMensaje(String mensaje) {
        System.out.println(mensaje);
        return true;
    }

  
    @Override
    public void DesconectarServer() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean EnviarMensaje(Mensaje mensaje) {
        miservidor.RecibirMensaje("Cliente recibio : " +mensaje.toString());
        return true;
    }

   
}
