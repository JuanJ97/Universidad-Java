/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practicas;

import java.util.Date;

/**
 *
 * @author DESTROYER
 */
public class Manejo_de_herencia_Cliente extends Manejo_de_herencia_Persona {
    private int idCliente;
    private java.util.Date fechaRegistro;
    private boolean vip;
    private static int contadorCliente;

    public Manejo_de_herencia_Cliente(Date fechaRegistro, boolean vip) {
        this.idCliente = ++contadorCliente;
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }
    
    public boolean isVip(){
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        return super.toString()+"Manejo_de_herencia_Cliente{" + "idCliente=" + idCliente + ", fechaRegistro=" + fechaRegistro + ", vip=" + vip + '}';
    }
    
    
    
}
