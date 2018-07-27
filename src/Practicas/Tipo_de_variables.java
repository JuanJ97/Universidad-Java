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
public class Tipo_de_variables {
    public static void main (String[] args){
        //variables boolean, declaracion
        boolean bool1;
        //inicializacion de la variable bool1
        bool1 = true;
        //declaracion e inicializacion
        boolean bool2 = false;
        System.out.println("Valor bool1: "+bool1);
        System.out.println("Valor bool2: "+bool2);
        //variable byte
        byte b1 = 10;
        //literal en hexadecimal
        byte b2 = 0xa;
        System.out.println("Valor byte1: "+b1);
        System.out.println("Valor byte2: "+b2);
        //variable en short
        short s1 = 2;
        System.out.println("Valor short: "+s1);
        //variable en chart
        char ch1=65, ch2 ='A';
        System.out.println("Valor char1: "+ch1);
        System.out.println("Valor char2: "+ch2);
        //variables enteros
        int decimal = 100;
        int octal = 0144; //valores octal inician con 0
        int hexa = 0x64; //valores hexadecimales inican con 0x
        System.out.println("Valor decimal: "+decimal);
        System.out.println("Valor octal: "+octal);
        System.out.println("Valor hexa: "+hexa);
        //variables float
        float f1=15, f2=22.3F;
        System.out.println("Valor float1: "+f1);
        System.out.println("Valor float2: "+f2);
        //variables double
        double d1=11.0, d2=30.150D;
        System.out.println("Valor double1: "+d1);
        System.out.println("Valor double2: "+d2);
    }
}
