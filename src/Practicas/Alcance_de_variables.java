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
public class Alcance_de_variables {
    //Atributos de la clase
    int a;
    int b;
    
    //COnstructor vacio
    //Recordar que si agregamos un contructor distinto al vacio
    //ya no se crea este constructor y nosotros debemos crearlo
    //si lo necesitamos
    Alcance_de_variables(){}
    //Constructor con 2 argumentos 
    Alcance_de_variables(int a, int b){
        //uso del operador yhis
        this.a = a;
        this.b = b;
    }
    //ESte metodo toma los atributos de la clase para hacer la suma
    int sumar(){
        return a+b;
    }
    //metodo restar
    int restar(){
        return a-b;
    }
    //metodo multiplicar
    int multiplica(){
        return a*b;
    }
    //metodo dividir
    int dividir(){
        return a/b;
    }
}
