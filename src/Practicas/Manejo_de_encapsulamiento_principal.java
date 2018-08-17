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
public class Manejo_de_encapsulamiento_principal {
    public static void main(String [] args){
        //creamos el objeto 
        Manejo_de_encapsulamiento p1 = new Manejo_de_encapsulamiento("Juan", "Oriz",false);
        //Accedemos al atributo nombre
        System.out.println("Nombre de p1: " +p1.getNombre());
        //Accedemos al atributo apellido
        System.out.println("Apellido de p2: " +p1.getApellido());
        //Creamos el objeto p2
        Manejo_de_encapsulamiento p2 = new Manejo_de_encapsulamiento("Adriana", "Colin",false);
        //Accedemos al atributo nombre
        System.out.println("Nombre de p2: " +p2.getNombre());
        //Accedemos al atributo apellido
        System.out.println("Estado de objeto de p2: " +p2);
        //marcamos como eliminada a la persona
        p2.setBorrado(true);
        //Imprimimos el estado completo del objeto
        System.out.println("Estado objeto p2: " +p2);
        //creamos el tercer objeto vacio
        Manejo_de_encapsulamiento p3 = new Manejo_de_encapsulamiento();
        //Imprimimos el estado completo del objeto
        System.out.println("Estado objeto p3: " +p3);
    }
}
