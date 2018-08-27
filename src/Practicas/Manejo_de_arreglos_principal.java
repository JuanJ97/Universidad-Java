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
public class Manejo_de_arreglos_principal {
    public static void main(String [] args)
    {
        //Declaramos un arreglo de entero
        int edades[];
        //Iniciamos el arreglo de enteros
        edades = new int[3];
        //Iniciamos los valores del arreglo de enteros
        edades[0] = 30;
        edades[1] = 15;
        edades[2] = 20;
        //Imprimimos los valores a la salida estandar
        //Leemos los valorees de cada del elemento 
        System.out.println("Arreglo enteros indice 0: "+ edades[0]);
        System.out.println("Arreglo enteros indice 1: "+ edades[1]);
        System.out.println("Arreglo enteros indice 2: "+ edades[2]);
        
        //Declaramos un arreglo de enteros
        Manejo_de_arreglos_persona personas[];
        //Instanciamos el arreglo de enteros
        personas = new Manejo_de_arreglos_persona[4];
        //Inicializamos los valores del arreglo de enteros
        personas[0] = new Manejo_de_arreglos_persona("Juan");
        personas[1] = new Manejo_de_arreglos_persona("Jesus");
        personas[2] = new Manejo_de_arreglos_persona("Adriana");
        //Imprimos los valores a la salida estandar
        //LLemos los valores de cada elemento del arreglo
        System.out.println("");
        System.out.println("Arreglo personas indice 0: "+ personas[0]);
        System.out.println("Arreglo personas indice 1: "+ personas[1]);
        System.out.println("Arreglo personas indice 2: "+ personas[2]);
        //Arreglo de String, notacion simplificada
        String nombres[] = {"Sara", "Laura", "Carlos", "Carmen"};
        //Imprimimos los valores a la salida estandar
        //Interamos el arreglo de String con un for
        System.out.println("");
        for(int i=0; i<nombres.length ;i++){
            System.out.println("Arreglo String indice "+ i + ": " + nombres[i]);
        }
    }
}
