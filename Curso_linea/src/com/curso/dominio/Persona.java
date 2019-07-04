/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curso.dominio;

import com.curso.interfaces.Metodos;

/**
 *
 * @author Luis Alberto Mero
 */
public class Persona implements Metodos{
    
    String cedula;
    String nombre;
    String apellido;
    String telefono;
    String edad;
    String sueldo;

    public Persona() {
    }

    public Persona(String cedula, String nombre, String apellido, String telefono) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }
///get es obtener 
    public String getCedula() {
        return cedula;
    }
/////set para validar los atributos///es un parametro local es utilizado en cualquier parte 
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
//    public void registar(){
//        System.out.println("registrar datos");
//    }
//    public int vaidar(){
//        return 10;
//    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getSueldo() {
        return sueldo;
    }

    public void setSueldo(String sueldo) {
        this.sueldo = sueldo;
    }
    
    
    
    public String mostrar(){
        return "0987532"+cedula+"\nIsan"+nombre+"\nMero"+apellido+"\nTelefono"+telefono;
    }
    
    

    @Override
    public String datosMostar() {
        return null;
    }
    
    public void saludar(){
        System.out.println("Hola");
    }
  
}
