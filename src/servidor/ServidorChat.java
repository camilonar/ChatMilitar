package servidor;

import observer.*;
import cliente.Mensaje;
import java.util.ArrayList;

/**
 * Clase ServidorChat que adapta la interfaz IconexionServidor y
 * de la cual hereda la clase ServidorLocal.
 * @author SINFO
 */
public abstract class ServidorChat extends Thread implements IconexionServidor{
    
    private final ArrayList<ClienteChat> misObservadores = new ArrayList<>();
    
    /* Métodos */
    
    public void asociarObservador(ClienteChat o){
        misObservadores.add(o);
    }
    
    public void retirarObservador(ClienteChat o){
        for (ClienteChat miObservador : misObservadores) {
            if(miObservador.equals(o)){
                misObservadores.remove(o);
            }
        }
    }
    
    public void notificar(Mensaje msj){
        for (int i = 0; i < misObservadores.size(); i++) {
            misObservadores.get(i).actualizar(msj);
        }
    }
    
}
