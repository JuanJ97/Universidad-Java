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
public class Manejor_de_do_while {
    public static void main (String [] args){
        System.out.println("Por favor introduce un numero de elementos");
        int max_elementos, contador=0;
        Scanner entrada = new Scanner(System.in);//objeto para leer datos de teclado
        max_elementos = entrada.nextInt();
        do{
            System.out.println("contador = "+contador);
            contador++;
        
        }while(contador < max_elementos);
    }
}
