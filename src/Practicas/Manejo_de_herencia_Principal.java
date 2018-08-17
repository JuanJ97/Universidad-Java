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
public class Manejo_de_herencia_Principal {
    public static void main(String [] args){
        Manejo_de_herencia_Empleado e1 = new Manejo_de_herencia_Empleado("Juan", 2500);
        System.out.println("Imprimimos el objeto Empleados1");
        System.out.println(e1);
        Manejo_de_herencia_Empleado e2 = new Manejo_de_herencia_Empleado("Pedro", 15000);
        e2.setEdad(28);
        e2.setGenero('H');
        e2.setDireccion("Mexico, Estado de Mexico");
        System.out.println("Imprimimos el objeto Empleados2");
        System.out.println(e2);
        //al crear un nuevo objeto de java.util.Date nos regresara la fecha actual
        Manejo_de_herencia_Cliente c1 = new Manejo_de_herencia_Cliente(new java.util.Date(), false);
        System.out.println("Imprimimos el objeto Cliente1");
        System.out.println(c1);
        //Completamos el objeto persona asociado a este objeto cliente
        c1.setNombre("Adriana");
        c1.setEdad(22);
        c1.setGenero('M');
        c1.setDireccion("Mexico, Ciudad de Mexico");
        System.out.println("Imprimimos nuevamente el objeto Cliente1");
        System.out.println(c1);
    }
}
