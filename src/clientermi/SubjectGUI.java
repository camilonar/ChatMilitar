/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientermi;

import cliente.IConexionCliente;
import java.util.ArrayList;
import observer.ClienteChat;

/**
 *
 * @author IPET
 */
public class SubjectGUI {
     
    private ArrayList<ObserverGUI> misObservadores = new ArrayList<>();
    
    public void asociarObservador(ObserverGUI o){
        misObservadores.add(o);
    }
    
    public void retirarObservador(ObserverGUI o){
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
