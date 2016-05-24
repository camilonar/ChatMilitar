/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;

/**
 *
 * @author SINFO
 */
public abstract class Servidor {
    
    
    public void enviarMensaje(String destinatario, String mensaje){
        encriptar(mensaje);
    }
    
    private String encriptar(String mensaje){
        return mensaje;
    }
    
}
