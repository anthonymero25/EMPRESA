/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curso.componentes.gui;

import com.curso.dominio.Empleado;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Luis Alberto Mero
 */
public class Tablas {
    
     static DefaultTableModel model;

    public static DefaultTableModel VaciarTabla(JTable tabla) {
        DefaultTableModel modelo
                = (DefaultTableModel) tabla.getModel();
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        return modelo;
    }

    public static void listarEmpleados(ArrayList<Empleado> lista, JTable Tabla) {
        int[] a = {10, 30, 32};
        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        DefaultTableCellRenderer tcr1 = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        tcr1.setHorizontalAlignment(SwingConstants.RIGHT);
        model = VaciarTabla(Tabla);
        String[] Co = {"Cedula", "Nombre", "Apellido"};
        String[] Filas = new String[3];
        model = new DefaultTableModel(null, Co);
        Tabla.setShowGrid(true);
        for (int i = 0; i < lista.size(); i++) {
            Filas[0] = lista.get(i).getCedula();
            Filas[1] = lista.get(i).getNombre();
            Filas[2] = lista.get(i).getApellido();
          
            model.addRow(Filas);
            Tabla.setModel(model);
            Tabla.getColumnModel().getColumn(0).setPreferredWidth(a[0]);
            Tabla.getColumnModel().getColumn(0).setCellRenderer(tcr);
            Tabla.getColumnModel().getColumn(1).setPreferredWidth(a[1]);
            Tabla.getColumnModel().getColumn(1).setCellRenderer(tcr);
            Tabla.getColumnModel().getColumn(2).setPreferredWidth(a[2]);
            Tabla.getColumnModel().getColumn(2).setCellRenderer(tcr);
        }

    }

    public static void filtro(String valor, JTable Tabla) {
        TableRowSorter<DefaultTableModel> tr =
           new TableRowSorter<DefaultTableModel>(model);
        Tabla.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter("(?i)" + valor));
    }
    
}
