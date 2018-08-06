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
public class Laboratio_proyecto_caja {
    int ancho, alto, profundo;
    
    Laboratio_proyecto_caja (){
        
    }
    Laboratio_proyecto_caja (int arg1, int arg2, int arg3){
        this.ancho = arg1;
        this.alto = arg2;
        this.profundo = arg3;
    }
    int calcularVolumen(){
        return ancho * alto * profundo;
    }
}
