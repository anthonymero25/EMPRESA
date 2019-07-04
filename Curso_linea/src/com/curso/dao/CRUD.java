/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curso.dao;

import com.curso.dominio.Pais;
import com.mysql.jdbc.Connection;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Luis Alberto Mero
 */
public class CRUD {
    
    Conectar con = new Conectar();
    Connection conecta = null;
    java.sql.Statement st = null;
    
    Connection connMY = null;
    Connection connMA = null;
    
    public String insertarPais(String base, Pais pais) {
        String bandera = null;
        
        try {
            connMY = con.Conexion(base);
            connMY.setAutoCommit(false);
            CallableStatement prc = connMY.prepareCall(
                    "{ call insertarPais(?,?) }");
            prc.setString(1, pais.getNombre_pais());
            prc.setString(2,"");
            prc.registerOutParameter("msg", Types.VARCHAR);
            prc.execute();
            bandera = prc.getString("msg");
            connMY.commit();
        } catch (Exception e) {
            try {
                connMY.rollback();
                e.printStackTrace();
            } catch (SQLException ex) {
                Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
            }
        } finally {
            try {
                connMY.close();
            } catch (SQLException ex) {
                Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return bandera;
    }
    
    
     public String actualizarPais(String base, Pais obj) {
        String bandera = null;
        
        try {
            connMA = con.Conexion(base);
            connMA.setAutoCommit(false);
            CallableStatement prcProcedimientoAlmacenado = connMA.prepareCall(
                    "{ call insertarPais(?,?,?) }");
            prcProcedimientoAlmacenado.setInt(1, obj.getId_pais());
            prcProcedimientoAlmacenado.setString(2, obj.getNombre_pais());
            prcProcedimientoAlmacenado.setString(3, "");
            prcProcedimientoAlmacenado.registerOutParameter("msg", Types.VARCHAR);
            prcProcedimientoAlmacenado.execute();
            bandera = prcProcedimientoAlmacenado.getString("msg");
            connMA.commit(); 
        } catch (Exception e) {
            try {
                connMA.rollback();
                e.printStackTrace();
            } catch (SQLException ex) {
                Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
            }
        } finally {
            try {
                connMA.close();
            } catch (SQLException ex) {
                Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return bandera;
    }
    
    
}
