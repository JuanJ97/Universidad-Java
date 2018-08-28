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
public class Manejo_de_matrices {
    public static void main(String [] args){
        //Declaramos una matriz de enteros
        int edades [][];
        //Instanciamos la matriz de enteros
        edades = new int [3][2];
        //inicializamos los valores de la matriz de enteros
        edades[0][0] = 30;
        edades[0][1] = 15;
        edades[1][0] = 20;
        edades[1][1] = 45;
        edades[2][0] = 5;
        edades[2][1] = 25;
        //Imprimimos los valores a la salida estandar
        //Leemos los valores de cada elemento de la matriz
        System.out.println("Matriz enteros indice 0-0: " + edades[0][0]);
        System.out.println("Matriz enteros indice 0-1: " + edades[0][1]);
        System.out.println("Matriz enteros indice 1-0: " + edades[1][0]);
        System.out.println("Matriz enteros indice 1-1: " + edades[1][1]);
        System.out.println("Matriz enteros indice 2-0: " + edades[2][0]);
        System.out.println("Matriz enteros indice 2-1: " + edades[2][1]);
        //Declaramos e instanciamos una matriz de Manejo_de_matrices_persona
        Manejo_de_matrices_persona personas[][] = new Manejo_de_matrices_persona[3][2];
        //Inicializamos los valores de la matriz de personas
        personas[0][0] = new Manejo_de_matrices_persona("Juan");
        personas[0][1] = new Manejo_de_matrices_persona("Jesus");
        personas[1][0] = new Manejo_de_matrices_persona("Adriana");
        personas[1][1] = new Manejo_de_matrices_persona("Miranda");
        personas[2][0] = new Manejo_de_matrices_persona("David");
        personas[2][1] = new Manejo_de_matrices_persona("Daniel");
        //Leemos los valores de cada elelemento de la matriz con un ciclo for anidado
        System.out.println("");
        for(int i=0; i<personas.length; i++){
            for(int j=0; j<personas[i].length; j++){
                System.out.println("Matriz persona indice: " + i + "-" + j + ": "+ personas[i][j]);
            }
        }
        //Matriz de tipo string,notacion simplificada
        String nombres[][] = {{"Adriana","Miranda","Jesus"}, {"Juan", "David", "Daniel"}};
        System.out.println("");
        System.out.println("Largo de la matriz en renglones: "+ nombres.length);
        System.out.println("Largo de la matriz en columnas: "+ nombres[0].length);
        System.out.println("");
        for(int i=0; i<nombres.length; i++){
            for(int j=0; j<nombres[i].length; j++){
                System.out.println("Matriz String indice: " + i + "-" + j + ": "+ nombres[i][j]);
            }
        }
    }
}
