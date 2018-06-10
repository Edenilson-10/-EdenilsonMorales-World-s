/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

/**
 *
 * @author Victor.Morales
 */
public class EdificacionesFactory implements ServicioFactory{

    @Override
    public ServicioEdif crearServicio() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return new Raza3 ();
    }
    
}
