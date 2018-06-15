/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entity.ObjectFactory;
import entity.Grupo;
import entity.RazaAbstract;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Victor.Morales
 */
public class RazaService   {

    private static List lstR = new ArrayList<RazaAbstract>();
    
    public RazaAbstract crearRazaAbstract(int i) throws NoSuchMethodException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        
        RazaAbstract g = ObjectFactory.crearRaza(i);
        
        getLstR().add(g);
        System.err.println("Tamaño de lista de raza: "+getLstR().size());
        return g;
//        return ObjectFactory.CrearGrupo();
    }

    /**
     * @return the g
     */
    public List getLstR() {
        return lstR;
    }

    /**
     * @param g the g to set
     */
    public void setLstG(List lstR) {
        this.lstR = lstR;
    }
    
 
    
}
