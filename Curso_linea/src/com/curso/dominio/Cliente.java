/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curso.dominio;

/**
 *
 * @author Luis Alberto Mero
 */
public class Cliente extends Persona{
    
    private String codigoCliente;
    private String direccion;

    public Cliente(String codigoCliente, String direccion, String cedula, String nombre, String apellido, String telefono) {
        super(cedula, nombre, apellido, telefono);
        this.codigoCliente = codigoCliente;
        this.direccion = direccion;
    }


    public Cliente() {
    }

    public String getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
        
//    @Override
    public String mostrar(){
        return "0987532"+cedula
                +"\nIsan"+nombre
                +"\nMero"+apellido
                +"\nTelefono"+telefono
                +"\nCodigo de cliente"+codigoCliente
                +"\nDireccion"+direccion;
    }
}
