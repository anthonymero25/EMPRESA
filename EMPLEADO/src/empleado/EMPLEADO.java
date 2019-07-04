/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleado;

/**
 *
 * @author Luis Alberto Mero
 */
import javax.swing.JOptionPane;
public class EMPLEADO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nom_ap, añ_lab;
        nom_ap=JOptionPane.showInputDialog("INGRESE NOMBRE Y APELLIDO");
        añ_lab=JOptionPane.showInputDialog("INGRESE LOS AÑOS LABORADOS");
        JOptionPane.showMessageDialog(null,"TU NOMBRE  "+nom_ap+"Y TIENE AÑOS LABORADOS  "+añ_lab+"AÑOS");

        // TODO code application logic here
    }
    
}
