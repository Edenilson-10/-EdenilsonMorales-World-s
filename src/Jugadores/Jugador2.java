/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jugadores;

import entity.RazaAbstract;

/**
 *
 * @author Victor.Morales
 */
public class Jugador2  extends Jugadores{
   
     public Jugador2(String nombre , RazaAbstract raza) {
        super(nombre, raza);
    }

    @Override
    public String getNombre() {
        return super.getNombre(); //To change body of generated methods, choose Tools | Templates.
    }

     
    @Override
    public RazaAbstract getRaza() {
        return super.getRaza(); //To change body of generated methods, choose Tools | Templates.
    }
    
     
}
