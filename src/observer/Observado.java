/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.ArrayList;

/**
 *
 * @author SINFO
 */
public interface Observado {
    
  
    ArrayList<Observador> misObservadores = new ArrayList<>();
    
    public void asociarObservador(Observador o);
    
    public void retirarObservador(Observador o);
    
    public void notificar();
    
}
