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
public class Manejo_de_sobrecarga_de_constructores_empleado extends Manejo_de_sobrecarga_de_constructores_Personas {
    private double sueldo;

    public Manejo_de_sobrecarga_de_constructores_empleado(String nombre, int edad, double sueldo) {
        super(nombre, edad);//sueldo debe de ser la primera linea
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        //primero mandamos a llamar el metodo toString de la clase Persona
        //para que podamos observar los valores de la clase padre
        //y despues imprimimos los valores de la clase hija
        return super.toString() + "Manejo_de_sobrecarga_de_constructores_empleado{" + "sueldo=" + sueldo + '}';
    }
    
    
}
