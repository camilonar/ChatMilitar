/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatmilitar;

import cliente.ClienteLocal;
import cliente.MensajeLocal;
import servidor.ServidorLocal;

/**
 *
 * @author IPET
 */
public class ChatMilitar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServidorLocal server = new ServidorLocal();
        ClienteLocal  cliente1 = new ClienteLocal("Pedro");
        ClienteLocal  cliente2 = new ClienteLocal("Juan");
      
        cliente1.setServidor(server);
        cliente2.setServidor(server);
        server.addCliente(cliente1);
        server.addCliente(cliente2); 
        //cliente1.enviarMsj(new MensajeLocal("Hola servidor :v"));
    }
    
}
