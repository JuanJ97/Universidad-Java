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
public class Manejo_de_encapsulamiento {
    public Manejo_de_encapsulamiento() {//constructor vacio
}
        public Manejo_de_encapsulamiento(String nombre, String apellido, boolean borrador) {//constructor con 3 argumentos
            this.nombre = nombre;
            this.apellido = apellido;
            this.borrado = borrado;
        }
        //atributos privados
        private String nombre;
        private String apellido;
        private boolean borrado;
        
        //metodo publico para acceder y/o modificar los atributos
        public String getNombre(){
            return nombre;//recuperamos nombre
        }
        public void setNombre(String nombre){//obtenemos el nombre para modificar
            this.nombre = nombre;//como solo va a modificar no debemos regresar nada por eso es void
        }
        public String getApellido(){
            return apellido;
        }
        public void setApellido(String apellido){
            this.apellido = apellido;
        }
        public boolean isBorrado(){
            return borrado;
        }
        public void setBorrado(boolean borrado){
            this.borrado = borrado;
        }
        //Metodo que imprime el estado del objeto
        @Override
        public String toString(){
            return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", borrado=" + borrado +  '}';
        }
}
