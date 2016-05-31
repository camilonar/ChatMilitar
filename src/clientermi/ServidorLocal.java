/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientermi;

import java.util.ArrayList;

/**
 *
 * @author IPET
 */
public class ServidorLocal{
    ArrayList <ClienteRmiConcreteLocal> misClientes ;
    
    public ServidorLocal() {
    misClientes = new ArrayList<ClienteRmiConcreteLocal>();
    }
    
    public boolean addCliente(ClienteRmiConcreteLocal c){
    misClientes.add(c);
    return true;
    }
    public String enviarMensaje(String mensaje , ClienteRmiConcreteLocal c ){
        c.RecibirMensaje("Servidor recibio: "+mensaje);  
        return mensaje;
    }
    
     public boolean RecibirMensaje(String mensaje) {
        System.out.println(mensaje.toString());
        return true;
    }
     
    
}
