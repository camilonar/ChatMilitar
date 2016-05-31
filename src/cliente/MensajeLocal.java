/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

import cliente.Mensaje;

/**
 *
 * @author IPET
 */
public class MensajeLocal extends Mensaje {
    String Mensaje ;
    
    public MensajeLocal(String Mensaje){
        this.Mensaje = Mensaje;    
    }

    @Override
    public String toString() {
        return Mensaje; //To change body of generated methods, choose Tools | Templates.
    }
    
}
