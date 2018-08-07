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
public class Manejo_de_paso_por_referencia {
 public static void main(String [] args){
     Manejo_de_paso_por_referencia_segundo s = new Manejo_de_paso_por_referencia_segundo();
     s.cambiarNombre("Juan");
     imprimirNombre(s);//imprimir Juan
     modificarPersona(s);
     imprimirNombre(s);//imprimir carlos     
 } 
 public static void modificarPersona(Manejo_de_paso_por_referencia_segundo arg){
     arg.cambiarNombre("Carlos");
 }
 public static void imprimirNombre(Manejo_de_paso_por_referencia_segundo s){
     System.out.println("Valor recibido:" + s.obtenerNombre());
 }
}
