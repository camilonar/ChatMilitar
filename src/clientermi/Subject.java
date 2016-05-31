/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientermi;

import java.util.ArrayList;

/**
 *
 * @author IPET
 */
public class Subject {
    ArrayList <Observer> obeservadores;

    public Subject() {
        obeservadores=  new ArrayList();
    }
    public void addOserver(Observer o){
    obeservadores.add(o);
    }
    
    public void notificaraTodos(){
        for (Observer obeservadore : obeservadores) {
           obeservadore.notificar();
        }
    }
}
