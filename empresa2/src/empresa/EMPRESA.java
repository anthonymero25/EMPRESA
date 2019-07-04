/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

/**
 *
 * @author Luis Alberto Mero
 */
import javax.swing.JOptionPane;
public class EMPRESA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String sv,si,sp;
          sv=JOptionPane.showInputDialog("INGRESE LOS DATOS");
          si=JOptionPane.showInputDialog("INGRESE LOS VALORES");
          sp=JOptionPane.showInputDialog("INGRESE LOS PRECIO");
          JOptionPane.showMessageDialog(null," SISTEMA DE VENTAS ES:"+sv+"\n SISTEMA INFORMATICO ES:"+si+"\n SISTEMAS DE PRECIO ES:"+sp);
        // TODO code application logic here
    }
    
}
