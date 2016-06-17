/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;

import cliente.*;
import cliente.ClienteLocal;
import cliente.IConexionCliente;
import cliente.Mensaje;
import cliente.MensajeLocal;
import java.util.ArrayList;
import observer.ClienteChat;
import observer.ServidorChat;

/**
 *
 * @author IPET
 */

////ESTE ES UN SERVIDOR DE PRUEBA PARA PODER PROBAR SI EL CLIENTE FUNCIONA CORRECTAMENTE ATT:GRUPOCLIENTE
public class ServidorLocal extends ServidorChat{
    @Override
    public void recibirMensaje(String mensaje) {
        System.out.println(mensaje.toString());
      this.notificar(new MensajeLocal(mensaje));
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
    public void enviarMensajeAll(String mensaje) {
       this.notificar(new MensajeLocal(mensaje));
    }

    @Override
    public void recibirConexiones() {
     
    }
     
    
}
