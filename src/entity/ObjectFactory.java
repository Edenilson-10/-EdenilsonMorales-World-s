/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.lang.reflect.InvocationTargetException;
import service.RazaService;

public abstract class ObjectFactory {

    public ObjectFactory() {
    }

    public static Grupo crearGrupo() {
        
        System.out.println("Usted a creado grupo militares");
        System.out.println("Usted a creado Mercenarios");
        return new Grupo();
    }

    public static Vehiculo crearVehiculo() {
        System.out.println("Usted a creado carro de asalato");
        System.out.println("Usted a creado un tanque");
        return new Vehiculo();
    }

    public static Edificacion crearEdificacion() {
        System.out.println("Usted a creado edificacion nivel 1");
        System.out.println("Usted a creado edificacion nivel 2");
        return new Edificacion();
    }
    
    public static RazaService crearRazaService() {
        System.out.println("Usted a creado edificacion nivel 1");
        System.out.println("Usted a creado edificacion nivel 2");
        return new RazaService();
    }
    
    
    
    public static RazaAbstract crearRaza(int i) throws NoSuchMethodException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        return (RazaAbstract) ObjectFactory.class.getDeclaredMethod("crearRaza"+i).invoke(new ObjectFactory() {});
    }
    
    public static Raza1 crearRaza1() {
        System.out.println("Raza Saiyajin");
        return new Raza1();
    }
    public static Raza2 crearRaza2() {
        System.out.println("Raza Nameikiana");
        return new Raza2();
    }
    public static Raza3 crearRaza3() {
        System.out.println("Raza Majin Bu");
        return new Raza3();
    }
    
    

}
