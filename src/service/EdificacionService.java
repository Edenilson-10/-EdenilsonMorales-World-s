/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entity.ObjectFactory;
import entity.Edificacion;
import entity.Grupo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Victor.Morales
 */
public class EdificacionService extends AbstractService implements ServicioFactory {
    private static List lstG = new ArrayList<Edificacion>();

    @Override
    public Edificacion crearServicio(String nombre) {
        Edificacion g = ObjectFactory.crearEdificacion();
        g.setNombre(nombre);
        getLstG().add(g);
        System.err.println("Tamaño de lista de Edificacion: "+getLstG().size());
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
        for(Edificacion g : (List<Edificacion>) lstG){
            System.err.println(g.getNombre());
        }
        return lstG; //To change body of generated methods, choose Tools | Templates.
    }
}
