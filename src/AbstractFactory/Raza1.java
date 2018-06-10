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
public class Raza1 implements ServicioEdif {

    Raza1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void CrearGrupo() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Usted a creado grupo militares");
        System.out.println("Usted a creado Mercenarios");
    }

    @Override
    public void CrearVehiculos() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    System.out.println("Usted a creado carro de asalato");
    System.out.println("Usted a creado un tanque");
    }

    @Override
    public void CrearEdificacion() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    System.out.println("Usted a creado edificacion nivel 1");
    System.out.println("Usted a creado edificacion nivel 2");
    }
    
}
