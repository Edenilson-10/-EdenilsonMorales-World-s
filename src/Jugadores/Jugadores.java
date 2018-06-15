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
public class Jugadores {
    
    private String nombre;
    private RazaAbstract raza;

    public Jugadores(String nombre, RazaAbstract raza ){
        this.setNombre(nombre);
        this.setRaza(raza);
        
    }
            

    
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the raza
     */
    public RazaAbstract getRaza() {
        return raza;
    }

    /**
     * @param raza the raza to set
     */
    private void setRaza(RazaAbstract raza) {
        this.raza = raza;
    }
    
    
   
        
         
        
       
    
}
