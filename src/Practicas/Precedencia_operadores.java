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
public class Precedencia_operadores {
    public static void main (String [] args){
        System.out.println("Primer ejemplo de procedencia de operadores");
        int x = 5;
        int y = 10;
        int z = ++x * y--;
        System.out.println("x = "+x);
        System.out.println("y = "+y);
        System.out.println("z = "+z);
        System.out.println("Ejemplo evaluacion");
        System.out.println(4 + 5 * 6 / 3);
        System.out.println((4 + 5) * (6 / 3));
        System.out.println(1 + 2 - 3 * 4 / 5);
        System.out.println(1 + 2 - (3 * (4 / 5)));
        //si detecta una cadena, lo demas lo convierte en cadena
        System.out.println("1 + 2 =" + 1 + 2);
        //los parentesis rompen esta regla, ya que tiene la mayor prioridad 
        System.out.println("(1 + 2) = "+ (1 + 2));
        //el operado + es asociativo a la izquierda
        System.out.println(1 + 2 + "abc");//detecta una operacion primero
        System.out.println("abc"+ 1 + 2);//detecta una cadena primero
    }
}
