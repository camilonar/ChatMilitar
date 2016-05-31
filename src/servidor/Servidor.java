/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;

import observer.Observado;
import observer.Observador;

/**
 *
 * @author SINFO
 */
public abstract class Servidor implements Observado{
            
    
    @Override
    public void asociarObservador(Observador o){
        misObservadores.add(o);
    }
    
    @Override
    public void retirarObservador(Observador o){
        for (int i = 0; i < misObservadores.size(); i++) {
            misObservadores.remove(o);
        }
    }
    
    @Override
    public void notificar(){
        for (int i = 0; i < misObservadores.size(); i++) {
            misObservadores.get(i).actualizar();
        }
    }
    
    public void enviarMensaje(String destinatario, String mensaje){
        encriptar(mensaje);
    }
    
    private String encriptar(String mensaje){
        return mensaje;
    }
    
}
