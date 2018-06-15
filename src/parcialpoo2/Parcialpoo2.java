/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialpoo2;

import Jugadores.Jugador1;
import Jugadores.Jugador2;
import Jugadores.Jugadores;
import entity.AbstractOp;
import entity.ObjectFactory;
import entity.Raza1;
import entity.Raza2;
import entity.Raza3;
import entity.RazaAbstract;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import service.EdificacionService;
import service.GrupoService;
import service.ServicioFactory;
import service.VehiculoService;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import service.AbstractService;
import util.Helper;

/**
 *
 * @author Victor.Morales
 */
public class Parcialpoo2 {

     private static Scanner S = new Scanner(System.in);
    
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre1 = null;
        RazaAbstract raza = null;
        RazaAbstract raza2 = null;
        System.out.println("-----Registro de Jugadores-----");
        System.out.println("Ingrese Nombre Del Jugador 1. ");
         nombre1 = S.nextLine();
         
        int razaop = Helper.PreguntarRaza();
        
        raza = Helper.setRaza(razaop);
         
        Jugadores j1 = new Jugador1 (nombre1, raza  );
        System.out.println(j1.getRaza());
        System.out.println("-----Registro de Jugadores-----");
        System.out.println("Ingrese Nombre Del Jugador 2. ");
         nombre1 = S.nextLine();
         
       
           int razaop2 = Helper.PreguntarRaza();
        
            raza2 = Helper.setRaza(razaop2);
             Jugadores j2 = new Jugador2 (nombre1, raza2  );
             
             System.out.println(j2.getRaza());
       
       
        int o;
        
        
        
        do{
            o = Helper.PreguntarServicio();
            switch (o){
                case 1:
                    usarServicio (new GrupoService(), Helper.PreguntarNombre());
                    break;
                case 2:
                    usarServicio (new VehiculoService (), Helper.PreguntarNombre());
                    break;
                case 3:
                    usarServicio (new EdificacionService (), Helper.PreguntarNombre());
                    break;
                    
                case 4:
                    
                    break;
    
                case 5:
                    System.out.println("Cerrando Programa");
//                    
//                        for(AbstractOp g : (List<AbstractOp>) AbstractService.getlistServicio()){
//                            System.err.println(g.getNombre());
//                        }
//                    
                    
                    GrupoService.getlistServicio();
                    EdificacionService.getlistServicio();
                    VehiculoService.getlistServicio();
                    
                    
                    System.exit(0);
                    break;
                default:
                    System.out.println("Se ha ingresado una Opcion Invalida");
            }
            System.out.println("\n");
        } while (0 != 4);
        
        
        
    
    }
//    private static void usarServicio (ServicioFactory factory){
//        factory.crearServicio();
//    }
    private static void usarServicio (ServicioFactory factory, String nombre){
        factory.crearServicio(nombre);
    }

    
    
}
