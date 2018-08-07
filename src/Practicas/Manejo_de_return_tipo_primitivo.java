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
public class Manejo_de_return_tipo_primitivo {
    public static void main(String [] args){
        int resultado = sumar(3,6);
        System.out.println("Reesultado es: "+resultado);
    }
    public static int sumar(int a, int b){
        if(a == 0 && b == 0){
            System.out.println("Puede proporcionar valores distintos a cero");
            return 0;
        }
        return a+b;
    }
}
