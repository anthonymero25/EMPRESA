/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curso.pruebas;

import com.curso.dao.CRUD;
import com.curso.dao.Conectar;
import com.curso.dao.Consultas;
import com.curso.dominio.Ciudad;
import com.curso.dominio.JoinCiudades;
import com.curso.dominio.Pais;
import java.util.ArrayList;

/**
 *
 * @author Luis Alberto Mero
 */
public class Pruebas {
    public static void main(String[] args) {
        Conectar con = new Conectar();
        System.out.println(con.Conexion("localizacion"));
        Consultas consu = new Consultas();
//        ArrayList<Pais> lista = consu.listarPaises("localizacion");
//        System.out.println("Tamaño "+lista.size());
//        for (int i = 0; i < lista.size(); i++) {
//            System.out.println(lista.get(i).getId_pais()+" "+lista.get(i).getNombre_pais());
//        }
        
//        ArrayList<Ciudad> lista2 = consu.listarCiudad("localizacion");
//        System.out.println("Tamaño "+lista2.size());
//        for (int i = 0; i < lista2.size(); i++) {
//            System.out.println(lista2.get(i).getId_cuidad()+" "+lista2.get(i).getId_provincia()+" "+lista2.get(i).getNombre_ciudad());
//        }
        
//        ArrayList<JoinCiudades> lista3 = consu.listarJoinCiudades("localizacion");
//        System.out.println("Tamaño "+lista3.size());
//        for (int i = 0; i < lista3.size(); i++) {
//            System.out.println(lista3.get(i).getNombre_pais()+" "+lista3.get(i).getNombre_provincia()+" "+lista3.get(i).getNombre_ciudad());
//        }

        CRUD obji = new CRUD();
        Pais p = new Pais("Argentina");
        String mensaje = obji.insertarPais("localizacion",p);
        System.out.println(mensaje);
        
        
        
    }

}
