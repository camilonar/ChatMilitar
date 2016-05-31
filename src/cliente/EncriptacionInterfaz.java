/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

import cliente.Mensaje;

/**
 *
 * @author IPET
 */
public abstract class EncriptacionInterfaz {
    public abstract Mensaje ecriptar(Mensaje m);
    public abstract Mensaje desencriptar(Mensaje m);
}
