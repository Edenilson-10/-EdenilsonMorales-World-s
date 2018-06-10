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
public class Raza2 implements ServicioEdif{

    @Override
    public void CrearGrupo() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       System.out.println("Usted a creado grupo militares M");
       System.out.println("Usted a creado Mercenarios M");
    }

    @Override
    public void CrearVehiculos() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Usted a creado un carro de asalto 10");
        System.out.println("Usted a creado un Tanque 01");
    }

    @Override
    public void CrearEdificacion() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Usted a creado edificacio Nivel 01");
        System.out.println("Usted a creado edificacion Nivel 02");
    }
    
}
