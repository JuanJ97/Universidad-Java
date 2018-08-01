/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practicas;

/**
 *
 * @author DESTROYER
 */
public class Manejo_clases_y_objetos_principal {
    public static void main (String [] args){
        //creacion de objeto
        Manejo_clases_y_objetos C1 = new Manejo_clases_y_objetos();
        //llamado a un metodo del objeto creado
        System.out.println("Valores por default del objeto Persona");
        C1.despplegarNombre();
        //modificar valores
        C1.nombre = "Jesus";
        C1.apellidoPaterno = "Morales";
        C1.apellidoMaterno = "Ortiz";
        
        //volvemos a llamar al metodo
        System.out.println("Nuevos valores del objeto: ");
        C1.despplegarNombre();
        
        //creacion de objeto
        Manejo_clases_y_objetos C2 = new Manejo_clases_y_objetos();
        //llamado a un metodo del objeto creado
        System.out.println("Valores por default del objeto Persona");
        C2.despplegarNombre();
        //modificar valores
        C2.nombre = "Adriana";
        C2.apellidoPaterno = "Morales";
        C2.apellidoMaterno = "Colin";
        
        //volvemos a llamar al metodo
        System.out.println("Nuevos valores del objeto: ");
        C2.despplegarNombre();
    }
}
