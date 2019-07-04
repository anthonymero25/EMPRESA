/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curso.vista;

import com.curso.entradas.Inputs;

/**
 *
 * @author Luis Alberto Mero
 */
public class Menu {

    public static int Menu(String[] opciones) {
        int op;
        for (int i = 0; i < opciones.length; i++) {
            System.out.println((i + 1) + ".-" + opciones[i]);
        }
        op = Inputs.leerEnteros("Ingrese una opcion[1-"
                + opciones.length+"]:");

        return op;

    }
}
