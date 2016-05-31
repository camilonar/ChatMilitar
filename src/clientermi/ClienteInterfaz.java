/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clientermi;

/**
 *
 * @author IPET
 */
public interface ClienteInterfaz  {
    public boolean ConectarseAlServer();
    public boolean RecibirMensaje(String s );
    public boolean EnviarMensaje(Mensaje mensaje);
    public void DesconectarServer();
}
