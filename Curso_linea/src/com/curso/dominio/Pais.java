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
public class Pais {
    
    private Integer id_pais;
    private String nombre_pais;

    public Pais(String nombre_pais) {
        this.nombre_pais = nombre_pais;
    }
    

    public Pais(Integer id_pais, String nombre_pais) {
        this.id_pais = id_pais;
        this.nombre_pais = nombre_pais;
    }

    public Integer getId_pais() {
        return id_pais;
    }

    public void setId_pais(Integer id_pais) {
        this.id_pais = id_pais;
    }

    public String getNombre_pais() {
        return nombre_pais;
    }

    public void setNombre_pais(String nombre_pais) {
        this.nombre_pais = nombre_pais;
    }
    
}
