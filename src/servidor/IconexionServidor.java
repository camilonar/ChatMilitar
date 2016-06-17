package servidor;

import cliente.IConexionCliente;

/**
 * Interfaz que permite la conexión con la clase servidor
 * @author SINFO
 */
public interface IconexionServidor {
    
    public void recibirMensaje(String msj);
    public void addCliente(IConexionCliente c);
    public void removerCliente(IConexionCliente c);
    public void enviarMensajeAll(String msj);
    public void recibirConexiones();
    
}
