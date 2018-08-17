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
public class Manejo_de_palabra_static_principal {
    public static void main (String [] args){
        Manejo_de_palabra_static p1 = new Manejo_de_palabra_static("Juan");
        System.out.println("Persona1: "+p1);
        Manejo_de_palabra_static p2 = new Manejo_de_palabra_static("Adriana");
        System.out.println("Persona2: "+p2);
        //imprimimos el contadorPersonas
        System.out.println("No.Personas: "+Manejo_de_palabra_static.getContadorPersonas());
    }
}
