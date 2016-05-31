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
public interface IconexionServidor {
    
    public void recibirMensaje(String mensaje);
    public void addCliente(IConexionCliente c);
    public void removerCliente(IConexionCliente c);
    public void enviarMensajeAll(String mensaje);
    public void recibirConexiones();
    
}
