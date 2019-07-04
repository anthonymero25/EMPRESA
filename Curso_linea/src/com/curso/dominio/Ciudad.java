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
public class Ciudad {
    
    private Integer id_cuidad;
    private Integer id_provincia;
    private String nombre_ciudad;

    public Ciudad(Integer id_cuidad, Integer id_provincia, String nombre_ciudad) {
        this.id_cuidad = id_cuidad;
        this.id_provincia = id_provincia;
        this.nombre_ciudad = nombre_ciudad;
    }

    public Integer getId_cuidad() {
        return id_cuidad;
    }

    public void setId_cuidad(Integer id_cuidad) {
        this.id_cuidad = id_cuidad;
    }

    public Integer getId_provincia() {
        return id_provincia;
    }

    public void setId_provincia(Integer id_provincia) {
        this.id_provincia = id_provincia;
    }

    public String getNombre_ciudad() {
        return nombre_ciudad;
    }

    public void setNombre_ciudad(String nombre_ciudad) {
        this.nombre_ciudad = nombre_ciudad;
    }
    
    
    
}
