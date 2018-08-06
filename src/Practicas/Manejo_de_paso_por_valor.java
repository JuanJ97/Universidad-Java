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
public class Manejo_de_paso_por_valor {
    public static void main(String [] args){
        int x= 10;
        imprimirValor(x);//imprime el valor de 10
        cambiarValor(x);
        imprimirValor(x);
    }
        public static void cambiarValor(int i){
            i=200;
        }
        public static void imprimirValor(int arg){
            System.out.println("Valor recibido"+ arg);
        }
    }

