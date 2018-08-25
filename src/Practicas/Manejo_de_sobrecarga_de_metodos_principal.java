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
public class Manejo_de_sobrecarga_de_metodos_principal {
    public static void main(String [] args){
        System.out.println("Resultado 1: "+ Manejo_de_sobrecarga_de_metodos.sumar(3, 4));
        System.out.println("Resultado 2: "+ Manejo_de_sobrecarga_de_metodos.sumar(5, 4.1));
        System.out.println("Resultado 3: "+ Manejo_de_sobrecarga_de_metodos.sumar(7.1, 3));
        System.out.println("Resultado 4: "+ Manejo_de_sobrecarga_de_metodos.sumar(2.2, 6.8));
        System.out.println("Resultado 5: "+ Manejo_de_sobrecarga_de_metodos.sumar(3, 1L));//la L o l es de long
        System.out.println("Resultado 1: "+ Manejo_de_sobrecarga_de_metodos.sumar(3F, 'A'));//la F es de Float
    }
}
