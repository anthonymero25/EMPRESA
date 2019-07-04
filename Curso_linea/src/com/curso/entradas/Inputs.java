/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curso.entradas;

import java.util.Scanner;

/**
 *
 * @author Luis Alberto Mero
 */
public class Inputs {

    static Scanner l = new Scanner(System.in);

    public static int leerEnteros(String msg) {
        int n;
        do {
            try {
                System.out.print(msg);
                n = Integer.parseInt(l.nextLine());
            } catch (Exception e) {
                n = 0;
            }
        } while (n == 0);
        return n;
    }

    public static String leerCadenas(String msg) {
        String n;
        System.out.print(msg);
        n = l.nextLine();
        return n;
    }

    public static double leerReales(String msg) {
        double n;
        do {
            try {
                System.out.print(msg);
                n = Double.parseDouble(l.nextLine());
            } catch (Exception e) {
                n = 0;
            }
        } while (n == 0);
        return n;
    }
}
