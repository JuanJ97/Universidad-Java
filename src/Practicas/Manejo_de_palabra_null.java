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
public class Manejo_de_palabra_null {
    public static void main (String [] args){
        Personanull p1 = new Personanull ("Juan");
        System.out.println("Nombre p1: "+p1.obtenerNombre());
        Personanull p2 = p1;//p2 apunta al mismo objeto que p1
        System.out.println("Nombre p2: "+p2.obtenerNombre());
        //hacemos que p1 ya no apunte al objeto persona
        p1 = null;
        //comporbamos que p2 sigue accediendo al objeto
        System.out.println("Nombre p2: "+p2.obtenerNombre());
        //la siguiente linea marca error de tipo NullPointerExceptiion
        //System.out.println("Nombre p1: "+p1.obtenerNombre());
        //solo en caso de que o sea nulo podemos utilizar este metodo en esta variable
        if(p1 !=null){
            System.out.println("Nombre p1: "+p1.obtenerNombre());
        }
        
    }
}
class Personanull{
    String nombre; //valor por default es null
    public Personanull(String nombre){
        this.nombre= nombre;
    }
    public String obtenerNombre(){
        return this.nombre;
    }
}