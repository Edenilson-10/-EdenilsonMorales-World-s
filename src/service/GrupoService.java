/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entity.ObjectFactory;
import entity.Grupo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Victor.Morales
 */
public class GrupoService extends AbstractService implements ServicioFactory  {

    private static List lstG = new ArrayList<Grupo>();
    
    @Override
    public Grupo crearServicio(String nombre) {
        
        Grupo g = ObjectFactory.crearGrupo();
        g.setNombre(nombre);
        getLstG().add(g);
        System.err.println("Tamaño de lista de grupo: "+getLstG().size());
        return g;
//        return ObjectFactory.CrearGrupo();
    }
    
    /**
     * @return the g
//     */
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
        for(Grupo g : (List<Grupo>) lstG){
            System.err.println(g.getNombre());
        }
        return lstG;
    }
    
 
    
}
