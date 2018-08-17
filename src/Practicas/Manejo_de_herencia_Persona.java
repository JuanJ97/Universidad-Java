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
public class Manejo_de_herencia_Persona {//clase padre
    private String nombre;
    private char genero;
    private int edad;
    private String direccion;
    //Constructor vacio
    public Manejo_de_herencia_Persona() {}
    //Constructor con 1 argumento
    public Manejo_de_herencia_Persona(String nombre) {
    this.nombre = nombre;
    }
    //Constrcutor completo
    public Manejo_de_herencia_Persona(String nombre, char genero, int edad, String direccion) {
    this.nombre = nombre;
    this.genero = genero;
    this.edad = edad;
    this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public char getGenero() {
        return genero;
    }

    public int getEdad() {
        return edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", genero=" + genero + ", edad=" + edad + ", direccion=" + direccion + '}';
    }
    
    
    
}
