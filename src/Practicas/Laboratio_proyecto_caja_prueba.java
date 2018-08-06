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
public class Laboratio_proyecto_caja_prueba {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        int ancho,alto,profundidad;
        System.out.println("Ingrese el ancho de la caja");
        ancho = entrada.nextInt();
        System.out.println("Ingrese el alto de la caja");
        alto = entrada.nextInt();
        System.out.println("Ingrese la profundidad de la caja");
        profundidad = entrada.nextInt();
        Laboratio_proyecto_caja caja = new Laboratio_proyecto_caja(ancho, alto, profundidad);
        int resultado = caja.calcularVolumen();
        System.out.println("El volumen de la caja es:" +resultado);
    }
}
