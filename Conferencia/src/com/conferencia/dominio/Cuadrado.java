/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in 


the editor.
 */
package com.conferencia.dominio;

/**
 *
 * @author Luis Alberto Mero
 */
public class Cuadrado extends Figuras{

    public Cuadrado() {
    }

    public Cuadrado(double base, double altura) {
        super(base, altura);
    }

    @Override
    public double calcularArea() {
        return (getBase()*getAltura()); 
    }
    
    
    
}
