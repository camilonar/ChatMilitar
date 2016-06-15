/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import cliente.IConexionCliente;
import cliente.Mensaje;

/**
 *
 * @author SINFO
 */
public abstract class  ClienteChat extends Thread implements IConexionCliente{
    
    public abstract void actualizar(Mensaje m);
    
    
}
