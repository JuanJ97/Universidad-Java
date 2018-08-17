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
public class Manejo_de_palabra_static {
    private String nombre;
    private int idPersona;
    private static int contadorPersonas;
    
    public Manejo_de_palabra_static(String nombre){
        //cada que creamos un objeto persona incrementamos el contador
        //para obtener un nuevo idpersona
        contadorPersonas++;
        //asignamos el nuevo valor al idPersona
        idPersona = contadorPersonas;
        //asignamos el nombre recibido 
        this.nombre = nombre;
    }
    @Override
    public String toString(){
        return "Persona [idPersona: " + idPersona + ", nombre: " + nombre + "]";
    }
    public static int getContadorPersonas(){
        return contadorPersonas;
    }
}
