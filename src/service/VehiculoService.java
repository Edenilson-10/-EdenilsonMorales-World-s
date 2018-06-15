/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entity.Edificacion;
import entity.Grupo;
import entity.ObjectFactory;
import entity.Vehiculo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Victor.Morales
 */
public class VehiculoService extends AbstractService implements ServicioFactory{
    private static List lstG = new ArrayList<Vehiculo>();
//    @Override
//    public ServicioEdif crearServicio() {
//        
//        Raza r = new Raza1
//                
//        return new Raza2 ();
//    }
    @Override
    public Vehiculo crearServicio(String nombre) {
        Vehiculo g = ObjectFactory.crearVehiculo();
        g.setNombre(nombre);
        getLstG().add(g);
        System.err.println("Tamaño de lista de Vehiculo: "+getLstG().size());
        return g;
    } 
     public List getLstG() {
        return lstG;
    }

    /**
     * @param g the g to set
     */
    public void setLstG(List lstG) {
        this.lstG = lstG;
    }
    public static List getlistServicio() {
        for(Vehiculo g : (List<Vehiculo>) lstG){
            System.err.println(g.getNombre());
        }
        return lstG; //To change body of generated methods, choose Tools | Templates.
    }
}
