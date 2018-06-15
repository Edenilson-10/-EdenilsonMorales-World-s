/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.AbstractList;
import java.util.List;

/**
 *
 * @author Victor.Morales
 */
public interface ServicioFactory {
    
    public Object crearServicio(String nombre);

    /**
     *
     * @return
     */
//    public List getlistServicio();
    
    
}
