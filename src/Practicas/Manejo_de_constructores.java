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
public class Manejo_de_constructores {
    //Atributos de la clase
    int a;
    int b;
    
    //Constructor vacio
    Manejo_de_constructores(){}
    
    //Constructor con 2 agumentos
    Manejo_de_constructores(int arg1, int arg2){
    a=arg1;
    b=arg2;
    }
    
    //Este metodo toma nuevos valores
    int sumar(int a, int b){
        return a + b;
    }
    
    //Este metodo toma los atributos de la clase
    int sumar (){
        return a+b;
    }
}
