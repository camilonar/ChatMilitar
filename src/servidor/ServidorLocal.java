package servidor;

import cliente.IConexionCliente;
import cliente.MensajeLocal;
import observer.ClienteChat;

/**
 * Clase ServidorLocal que hereda sus características de la clase ServidorChat
 * @author SINFO
 */

public class ServidorLocal extends ServidorChat{
    
    @Override
    public void recibirMensaje(String msj) {
        System.out.println(msj);
      this.notificar(new MensajeLocal(msj));
    }

    @Override
    public void addCliente(IConexionCliente c) {
      this.asociarObservador((ClienteChat) c);
    }

    @Override
    public void removerCliente(IConexionCliente c) {
     this.retirarObservador((ClienteChat) c);
    }

    @Override
    public void enviarMensajeAll(String msj) {
       this.notificar(new MensajeLocal(msj));
    }

    @Override
    public void recibirConexiones() {
     
    }
     
    
}
