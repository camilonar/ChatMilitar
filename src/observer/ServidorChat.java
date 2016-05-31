/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.ArrayList;
import servidor.IconexionServidor;

/**
 *
 * @author SINFO
 */
public abstract class ServidorChat implements IconexionServidor{
    
  
    private ArrayList<Observador> misObservadores = new ArrayList<>();
    
    public void asociarObservador(Observador o){
        misObservadores.add(o);
    }
    
    public void retirarObservador(Observador o){
        for (int i = 0; i < misObservadores.size(); i++) {
            misObservadores.remove(o);
        }
    }
    
    public void notificar(){
        for (int i = 0; i < misObservadores.size(); i++) {
            misObservadores.get(i).actualizar();
        }
    }
    
}
