/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import entity.Raza1;
import entity.Raza2;
import entity.Raza3;
import entity.RazaAbstract;
import java.util.Scanner;

/**
 *
 * @author juan
 */
public class Helper {
 private static final Scanner S = new Scanner(System.in);
    public static int PreguntarRaza() {
        System.out.print(
                 "-------------------\n"
                +"Tipo De Razas\n"
                +"-------------------\n"
                +"1. Raza Sayaijin. \n"
                +"2. Raza Nameikiana . \n"
                +"3. Raza Majin Bu. \n"
                +"4. Cerrar el programa \n"
                +"Seleccione una Raza: "
                
                
        );
        return Integer.parseInt(S.nextLine ());
    }
    
    public static int PreguntarServicio() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.print(
                 "-------------------\n"
                +"Menu de opciones\n"
                +"-------------------\n"
                + "1. Solicitar Creacion de Grupo. \n"
                +"2. Solicitar Creacion de Vehiculos. \n"
                +"3. Solicitar Creacion de Edificaciones. \n"
                +"4. Fin de turno \n"

                +"5. Cerrar el programa \n"
                +"Seleccione una Opcion: "
        );
        return Integer.parseInt(S.nextLine ());
    }
    
    public static String PreguntarNombre() {
        System.out.print(
                "Menu de opciones\n"
                +"Coloque el nombre: "
        );
        return S.nextLine ();
    }
    
    
    public static RazaAbstract setRaza(int razaop){
        RazaAbstract raza = null;
     switch (razaop){
             case 1:
                    raza = new Raza1();
                    break;
                case 2:
                    raza =  new Raza2();
                    break;
                case 3:
                    raza =  new Raza3();
               break;
                default:
                    System.out.println("Se ha ingresado una Opcion Invalida");
             
         }
     return raza;
     
    }
}

