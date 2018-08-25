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
public class Manejo_de_sobrecarga_de_metodos {
    //Metodo sumar
    public static int sumar(int a, int b){
        System.out.println("Metodo sumar (int, int)");
        return a+b;
    }
    //Sobrecarga de metodo sumar
    public static double sumar(double a, double b){
        System.out.println("Metodo sumar (double, double)");
        return a+b;
    }
    public static double sumar(int a, double b){
        System.out.println("Metodo sumar (int, double)");
        return a+b;
    }
    public static double sumar(double a, int b){
        System.out.println("Metodo sumar (double, int)");
        return a+b;
    }
}
