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
public class Manejo_de_herencia_Empleado extends Manejo_de_herencia_Persona {
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleados;
    
    public Manejo_de_herencia_Empleado(String nombre, double sueldo){
        super(nombre);//super debe ser la primera linea
        this.idEmpleado = ++contadorEmpleados;
        this.sueldo = sueldo;
    }

    public int getIdEmpleado() {
        return idEmpleado;
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
        //para que podamos observar los valores de la clase Padre
        //y despues imprimimos los valores de la clase hija
        return super.toString() + "Manejo_de_herencia_Empleado{" + "idEmpleado=" + idEmpleado + ", sueldo=" + sueldo + '}';
    }
    
    
}
