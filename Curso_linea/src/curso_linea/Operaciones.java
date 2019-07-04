/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso_linea;

/**
 *
 * @author Luis Alberto Mero
 */
public class Operaciones {

    public static double getIva(double subtotal) {
        double iva=0.12;
        double civa = (subtotal * iva);
        return civa;
    }

    public static double getsubtotal(int cantidad, double valor_articulo) {
        double sub = cantidad * valor_articulo;
        return sub;
    }
    
    public static double edad(int edad, double subtotal, double iva){
        double des,to;
        if (edad < 65) {

            if (subtotal >= 100) {
                des = subtotal * 0.08;
                to = (subtotal + iva) - des;///chao

            } else {
                to = subtotal + iva;//chaos
                des = 0;
            }
        } else {
            
            to = subtotal;//chao//des = 0;
            
        }
        
        return to;
    }

    
    
    
    public static double getpromedio(double num1, double num2, double num3) {

        double pro;

        pro = (num1 + num2 + num3) / 3;

        return pro;
    }

    
    
    
    
    
    public static double suma(double num1, double num2) {
        double cal;

        cal = num1 + num2;

        return cal;
    }

    public static double resta(double num1, double num2) {
        double cal;

        cal = num1 - num2;

        return cal;
    }

    public static double multiplicacion(double num1, double num2) {
        double cal;

        cal = num1 * num2;

        return cal;
    }

    public static double division(double num1, double num2) {
        double cal;

        cal = num1 / num2;

        return cal;
    }
    
    
    
    public static String edad(int edad){
        String ed = null;
        
        if (edad > 17) {
            if (edad < 65) {
                ed = "Mayor de edad";
            } else {
                ed = "Adulto mayor";
            }
        }else {
            ed = "Menor de edad";
        } 
        return ed;
        
    }
}
