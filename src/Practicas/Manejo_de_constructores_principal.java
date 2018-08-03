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
public class Manejo_de_constructores_principal {
    public static void main (String [] args){
        //creamos un objeto de la calse Manejo_de_constructores con el constructor vacio
        Manejo_de_constructores obj1 = new Manejo_de_constructores();
        
        //llamamos el metodo sumar y recibimos el valor devuelto}
        int resultado = obj1.sumar(5, 4);
        
        System.out.println("Resultado suma directa obj1: "+resultado);
        
        //Si llamamos directamente el metodo sumar sin argumentos 
        //el valor es cero, ya que lo atributos del objeto nunca se inicializaron
        //ya que no se uso el contructorcon argumentosm sino el contructor vacio
        System.out.println("Resultado suma directa obj1: "+obj1.sumar());
        //Creamos un objeto con el contructo con dos argumentos
        Manejo_de_constructores obj2 = new Manejo_de_constructores(2,1);
        //Imprimimos directamente el resultado
        //al llamar directmente el metodo suma,nos regresa el valor de la suma
        System.out.println("Resultado suma directa obj1: "+obj2.sumar());
    }
}
