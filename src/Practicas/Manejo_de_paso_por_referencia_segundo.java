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
public class Manejo_de_paso_por_referencia_segundo {
    String nombre;
    public void cambiarNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }
    public String obtenerNombre(){
      return nombre;  
    }
    
}