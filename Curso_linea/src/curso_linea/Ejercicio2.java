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
//import static curso_linea.Operaciones.getpromedio;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio2 {
    
     public static void main(String[] args) {

        promedio();

    }
     
     private static void promedio(){
         
         String nombre,apellido,curso,asignatura;
         double num1,num2,num3,promedio;
         
         Scanner n = new Scanner(System.in);
         
         System.out.print("Nombre: ");
         nombre = n.next();
         
         System.out.print("Apellido: ");
         apellido = n.next();
         
         System.out.print("Curso: ");
         curso = n.next();
         
         System.out.print("Asignatura: ");
         asignatura = n.next();
         
         System.out.print("Ingrese la primera nota: ");
         num1 = n.nextDouble();
         
         System.out.print("Ingrese la segunda nota: ");
         num2 = n.nextDouble();
         
         System.out.print("Ingrese la tercera nota: ");
         num3 = n.nextDouble();
         
//         promedio= getpromedio(num1, num2, num3);
//         System.out.println("El promedio es:"+promedio);
     }
    
     
}
