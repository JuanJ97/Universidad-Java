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
public class Manejo_de_sobrecarga_de_constructores_principal {
    public static void main (String [] args){
        //el construcor vacio es privado, por lo tanto nos obliga a
        //utilizar el unico constructor publico y por lo tanto
        //proporcionar valores en los campos de nombre y edad
        Manejo_de_sobrecarga_de_constructores_Personas p1 = new Manejo_de_sobrecarga_de_constructores_Personas("Adriana", 21);
        System.out.println("Imprimimos el objeto p1: "+ p1);
        Manejo_de_sobrecarga_de_constructores_Personas p2 = new Manejo_de_sobrecarga_de_constructores_Personas("Juan", 21);
        System.out.println("Imprimimos el objeto p1: "+ p2);
        //objeto empleado
        Manejo_de_sobrecarga_de_constructores_empleado e1 = new Manejo_de_sobrecarga_de_constructores_empleado("Jesus", 21, 5000);
        System.out.println("Imprimimos el objeto p1: "+ e1);
    }
}
