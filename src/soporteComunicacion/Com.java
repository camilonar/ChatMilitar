/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soporteComunicacion;

/**
 *
 * @author IPET
 */
public interface Com {
    void enviarMensaje(String  m);
    String recibirMensaje();
}
