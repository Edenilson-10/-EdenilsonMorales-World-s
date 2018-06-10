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
public class Raza3 implements ServicioEdif {

    @Override
    public void CrearGrupo() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Usted a creado grupo militares 0.01");
        System.out.println("Usted a creado mercenarios tipo 007");
    }

    @Override
    public void CrearVehiculos() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Usted a creado un carro de asalto tipo 007");
        System.out.println("Usted a creado un tanque de 007");
    }

    @Override
    public void CrearEdificacion() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Usted a creado edificacion num 1");
        System.out.println("Usted a creado edificacion estilo 007");
    }
    
}
