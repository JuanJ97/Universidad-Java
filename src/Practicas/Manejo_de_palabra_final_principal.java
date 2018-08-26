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
public class Manejo_de_palabra_final_principal {
    public static void main(String [] args){
        //marca error, no se puede modificar el valor de una variable final
        //Manejo_de_palabra_final_clase_final.varPrimitivo = 15;
        //No es posible cambiar la referencia de la variable persona
        //Manejo_de_palabra_final_clase_final.persona = new /Manejo_de_palabra_final_Persona();
        System.out.println("Nombre de la persona: "+Manejo_de_palabra_final_clase_final.persona.getNombre());
        //Pero si es posible cambiar el estado del objeto
        //Referencido por la variable persona
        Manejo_de_palabra_final_clase_final.persona.setNombre("Jesus");
        System.out.println("Nombre de la persona: "+Manejo_de_palabra_final_clase_final.persona.getNombre());

    }
}
