/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

/**
 *
 * @author IPET
 */
public interface IConexionCliente  {
    public boolean conectar(String ip,int puerto);
    public boolean recibirMsj(Mensaje msj );
    public boolean enviarMsj(Mensaje msj);
    public void desconectar();
}
