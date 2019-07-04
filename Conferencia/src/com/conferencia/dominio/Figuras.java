/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.conferencia.dominio;

import com.conferencia.interfaces.Metodos;

/**
 *
 * @author Luis Alberto Mero
 */
public class Figuras implements Metodos {
    
    private double base;
    private double altura;

    public Figuras() {
    }

    public Figuras(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) { 
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return 0;
    }
    
    
    
}
