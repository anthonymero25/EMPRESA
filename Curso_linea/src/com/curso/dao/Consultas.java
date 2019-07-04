/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curso.dao;

import com.curso.dominio.Ciudad;
import com.curso.dominio.JoinCiudades;
import com.curso.dominio.Pais;
import com.mysql.jdbc.Connection;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Luis Alberto Mero
 */
public class Consultas {
    
    Conectar con = new Conectar();
//    Connection conect = null;
    ResultSet rs;
    java.sql.Statement st = null;
    Connection connMy = null;
    
    public ArrayList<Pais> listarPaises(String base) {
        ArrayList<Pais> lista = new ArrayList<Pais>();
        try {
           connMy= con.Conexion(base);
            connMy.setAutoCommit(false);
            CallableStatement prcProcedimientoalmacenado = connMy.prepareCall("{ call listarPaises()}");
            prcProcedimientoalmacenado.execute();
            rs = prcProcedimientoalmacenado.getResultSet();
            while (rs.next()) {
                Pais objeto = new Pais(
                        rs.getInt("id_pais"),
                        rs.getString("nombre_pais"));
                lista.add(objeto);
            }
            connMy.commit();
        } catch (Exception ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
    
    public ArrayList<Ciudad> listarCiudad(String base) {
        ArrayList<Ciudad> lista2 = new ArrayList<Ciudad>();
        try {
           connMy= con.Conexion(base);
            connMy.setAutoCommit(false);
            CallableStatement prcProcedimientoalmacenado = connMy.prepareCall("{ call listarCiudad()}");
            prcProcedimientoalmacenado.execute();
            rs = prcProcedimientoalmacenado.getResultSet();
            while (rs.next()) {
                Ciudad objeto = new Ciudad(
                        rs.getInt("id_ciudad"),
                        rs.getInt("id_provincia"),
                        rs.getString("nombre_ciudad"));
                lista2.add(objeto);
            }
            connMy.commit();
        } catch (Exception ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista2;
    }
    
    public ArrayList<JoinCiudades> listarJoinCiudades(String base) {
        ArrayList<JoinCiudades> lista3 = new ArrayList<JoinCiudades>();
        try {
           connMy= con.Conexion(base);
            connMy.setAutoCommit(false);
            CallableStatement prcProcedimientoalmacenado = connMy.prepareCall("{ call listarJoinCiudades()}");
            prcProcedimientoalmacenado.execute();
            rs = prcProcedimientoalmacenado.getResultSet();
            while (rs.next()) {
                JoinCiudades objeto = new JoinCiudades(
                        rs.getString("nombre_pais"),
                        rs.getString("nombre_provincia"),
                        rs.getString("nombre_ciudad"));
                lista3.add(objeto);
            }
            connMy.commit();
        } catch (Exception ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista3;
    }
}
