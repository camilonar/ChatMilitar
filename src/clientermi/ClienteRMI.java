/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clientermi;

/**
 *
 * @author IPET
 */
public class ClienteRMI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        ClienteRmiConcreteLocal  cliente1 = new ClienteRmiConcreteLocal();
        ServidorLocal server = new ServidorLocal();
        
        cliente1.miservidor= server;
        
        
        server.addCliente(cliente1);
        
        server.enviarMensaje("holi", cliente1);
        server.enviarMensaje("holi1", cliente1);
        server.enviarMensaje("holi2", cliente1);
        server.enviarMensaje("holi3", cliente1);
        server.enviarMensaje("holi4", cliente1);
        server.enviarMensaje("holi5", cliente1);
        
        cliente1.enviarMsj(new MensajeLocal("Hola servidor :v"));
        
        
        
    }
}
