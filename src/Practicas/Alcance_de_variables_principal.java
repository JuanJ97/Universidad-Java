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
public class Alcance_de_variables_principal {
    public static void main (String [] args){
        //variables locales
        int operadorA = 6;
        int operadorB = 2; 
        //cremaos un objeto de la clase Alcance_de_variables enviando argumentos
        Alcance_de_variables obj1 = new Alcance_de_variables(operadorA, operadorB);
        //imprimir operadores
        System.out.println("Operador A: "+operadorA+" y operador B: "+operadorB);
        //resultado de la suma
        System.out.println("El resultado de la suma es: "+obj1.sumar());
        //resultado de la resta
        System.out.println("El resultado de la resta es: "+obj1.restar());
        //resultado de la multiplicacion
        System.out.println("El resultado de la multiplicacion es: "+obj1.multiplica());
        //resultado de la division
        System.out.println("El resultado de la division es: "+obj1.dividir());
    }
}
