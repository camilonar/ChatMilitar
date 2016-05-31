/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import clientermi.IConexionCliente;

/**
 *
 * @author SINFO
 */
public abstract class  ClienteChat implements IConexionCliente{
    
    public abstract void actualizar();
    
    
}
