/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clientermi;

/**
 *
 * @author IPET
 */
public interface IConexioncliente  {
    public boolean conectar();
    public boolean recibirMsj(String s );
    public boolean enviarMsj(Mensaje mensaje);
    public void desconectar();
}
