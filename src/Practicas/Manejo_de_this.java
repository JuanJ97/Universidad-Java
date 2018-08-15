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
public class Manejo_de_this {
    public static void main(String [] args){
        Persona p = new Persona("Juan");
    }
}

class Persona{
    String nombre;//atributo de la clase
    Persona(String nombre){
        this.nombre = nombre; //this es el objeto Persona(actual)
        //Imprimimos el objeto persona
        Imprimir i = new Imprimir();
        i.imprimir(this);//this es el objeto Persona(actual)
    }
}
class Imprimir{
    public void imprimir(Object o){
        System.out.println("Imprimir parametro: "+o);//el parametro es el objeto persona
        System.out.println("Imprimir el objeto actual (this): "+this);//this es el objeto a imprimir;
    }
}
