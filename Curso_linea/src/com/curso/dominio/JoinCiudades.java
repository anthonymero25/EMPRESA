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
public class JoinCiudades {
    
    private String nombre_pais;
    private String nombre_provincia;
    private String nombre_ciudad;

    public JoinCiudades(String nombre_pais, String nombre_provincia, String nombre_ciudad) {
        this.nombre_pais = nombre_pais;
        this.nombre_provincia = nombre_provincia;
        this.nombre_ciudad = nombre_ciudad;
    }

    public String getNombre_pais() {
        return nombre_pais;
    }

    public void setNombre_pais(String nombre_pais) {
        this.nombre_pais = nombre_pais;
    }

    public String getNombre_provincia() {
        return nombre_provincia;
    }

    public void setNombre_provincia(String nombre_provincia) {
        this.nombre_provincia = nombre_provincia;
    }

    public String getNombre_ciudad() {
        return nombre_ciudad;
    }

    public void setNombre_ciudad(String nombre_ciudad) {
        this.nombre_ciudad = nombre_ciudad;
    }
    
    
}
