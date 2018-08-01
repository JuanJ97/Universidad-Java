/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practicas;

import java.util.Scanner;

/**
 *
 * @author DESTROYER
 */
public class Manejo_de_while {
    public static void main (String [] args){
        System.out.println("Por favor introduce un numero de elementos");
        int max_elementos, contador=0;
        Scanner entrada = new Scanner(System.in);//objeto para leer datos de teclado
        max_elementos = entrada.nextInt();
        while (contador < max_elementos){
            System.out.println("contador = "+contador);
            contador++;
        }
    }
    
}
