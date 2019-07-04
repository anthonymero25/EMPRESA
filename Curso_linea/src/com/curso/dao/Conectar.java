/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curso.dao;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis Alberto Mero
 */
public class Conectar {
    
    Connection Conect = null;
    
    public Connection Conexion(String base) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String str = "jdbc:mysql://localhost:3306/" + base + "?zeroDateTimeBehavior=convertToNull";
            Conect = (Connection) DriverManager.getConnection(str, "root", "");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "No hay Conexion!!");
        }
        return Conect;
    }
    
}
