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
public class Manejo_de_sobrecarga_de_constructores_Personas {
    private int idPersona;
    private String nombre;
    private int edad;
    private static int contadorPersonas;
    //Constructor sin argumentos y privado
    //Asignando el idPersona

    private Manejo_de_sobrecarga_de_constructores_Personas() {
        this.idPersona = ++contadorPersonas;
    }
    //Constructor completo sobrecargado

    public Manejo_de_sobrecarga_de_constructores_Personas(String nombre, int edad) {
        //Se manda a llamar el constructor vacio para que se asigne el idPersona
        this();
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Manejo_de_sobrecarga_de_constructores{" + "idPersona=" + idPersona + ", nombre=" + nombre + ", edad=" + edad + '}';
    }
    
    
}
