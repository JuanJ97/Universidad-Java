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
public class Manejo_de_objetos_principal {
    public static void main (String [] args){
        Manejo_de_objetos Ob1 = new Manejo_de_objetos();
        int a = 10;
        int b = 20;
        int resultado = Ob1.sumar(a, b);
        System.out.println("La suma es: "+resultado);
    }
}
