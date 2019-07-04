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
public class Empleado extends Persona{
    private String codigo_Empleado;
    private String area_Trabajo;
    
    public Empleado(String cedula,String nombre,String apellido,String telefono,String codigo_Empleado,String area_Trabajo){
        super(cedula, nombre, apellido, telefono);
        this.codigo_Empleado = codigo_Empleado;
        this.area_Trabajo = area_Trabajo;
    }

    public Empleado() {
        
    }

    public Empleado(String string, String an, String mero, String string0, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

//    public void mostrar(){
////        System.out.println("Cedula: "+getCedula()
////                        +"\nNombre: "+getNombre()
////                        +"\nApellido: "+getApellido()
////                        +"\nTelefono: "+getTelefono()
////                        +"\nCodigo Empleado: "+codigo_Empleado
////                        +"\nArea Trabajo: "+area_Trabajo);
//        return mostrar;
//    }

    public String getCodigo_Empleado() {
        return codigo_Empleado;
    }

    public void setCodigo_Empleado(String codigo_Empleado) {
        this.codigo_Empleado = codigo_Empleado;
    }

    public String getArea_Trabajo() {
        return area_Trabajo;
    }

    public void setArea_Trabajo(String area_Trabajo) {
        this.area_Trabajo = area_Trabajo;
    }
//    @Override
    public String mostrar(){
        return "0987532"+cedula
                +"\nIsan"+nombre
                +"\nMero"+apellido
                +"\nTelefono"+telefono
                +"\nCodigo empledo"+codigo_Empleado
                +"\nArea de trabajo"+area_Trabajo;
    }
    
}
