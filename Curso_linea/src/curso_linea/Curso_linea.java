/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso_linea;

import com.curso.archivo.Archivo;
import com.curso.dominio.Cliente;
import com.curso.dominio.Empleado;
import com.curso.dominio.Persona;
import com.curso.entradas.Inputs;
import com.curso.vista.Menu;
import static curso_linea.Operaciones.getIva;
import static curso_linea.Operaciones.getsubtotal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;


/**
 *
 * @author Luis Alberto Mero
 */
public class Curso_linea {

    static ArrayList<Empleado> lista = new ArrayList<Empleado>();

    public static void main(String[] args) {
       

////        Scanner obj = new Scanner(System.in);
//        String nombre[] = new String[5];
////////        nombre[0] = "Anthony";
////////        nombre[1] = "Isabel";
////////        nombre[2] = "Isan";
////////        nombre[4] = "Nallely";
////////        nombre[3] = "Amalia";
////////        System.out.println("Tamaño " + nombre.length);
//
//        //length para desmostrar el tamaño maximo
//        for (int i = 0; i < nombre.length; i++) {
//            
//            nombre[i] = Inputs.leerCadenas((i + 1)+" Ingrese nombre: ").toUpperCase();
////////            System.out.println(nombre[i]);
//        }
////////        nombre[2] = "Candy"; ///agregar un nuevo arreglo y lo reemplaza
//        Arrays.sort(nombre);
//        for (int i = 0; i < nombre.length; i++) {
//            System.out.println(nombre[i]);
//        }
////        saludo();
////        nombre();
////        formulario();
////        venta();
////        operacion();
////        usoCaso();
////        menu();
////        datos();
////        ordenarNumeros();
////        dinamico();
        Menuop();


        /////interfaces hay que llamarlo aqui en el main 
        /////POLIMORFISMO
//          Persona per[] = new Persona[3];
//          per[0] = new Persona("09876","Isan" , "Mero", "456654");
//          per[1] = new Empleado("0976543", "Juan", "Perez", "65433", "344", "Sistemas");
//          per[2] = new Cliente("234", "Guasmo", "097652", "Carlos", "Franco", "76434");
//          for(Persona personas: per){
//              System.out.println(personas.mostrar());
//              System.out.println("");
//          }
//           Empleado empleado = new Empleado("09766", "Isan", "Mero", "345678", "46", "Administrativa");
//            empleado.mostrar();
/////HEREDAR ATRIBUTOS DE LA CLASE PRINCIPAL 
//        System.out.println("DATOS DEL EMPLEADO");
//        Empleado em = new Empleado();
//        System.out.print("Codigo empleado: ");
//        em.setCodigo_Empleado(obj.next());
//        System.out.print("Area trabajo: ");
//        em.setArea_Trabajo(obj.next());
//        System.out.print("Cedula: ");
//        em.setCedula(obj.next());
//        System.out.print("Nombre: ");
//        em.setNombre(obj.next());
//        System.out.print("Apellido: ");
//        em.setApellido(obj.next());
//        System.out.print("Telefono: ");
//        em.setTelefono(obj.next());
//
//        
//        System.out.println("DATOS DEL CLIENTE");
//        Cliente cl = new Cliente();
//        System.out.print("Codigo cliente: ");
//        cl.setCodigoCliente(obj.next());
//        System.out.print("Direccion: ");
//        cl.setDireccion(obj.next());
//        System.out.print("Cedula: ");
//        cl.setCedula(obj.next());
//        System.out.print("Nombre: ");
//        cl.setNombre(obj.next());
//        System.out.print("Apellido: ");
//        cl.setApellido(obj.next());
//        System.out.print("Telefono: ");
//        cl.setTelefono(obj.next());
        ////una manera detallada 
//        Persona objp = new Persona();
//        System.out.print("Ingresar cedula: ");
//        objp.setCedula(obj.next());
//        System.out.print("Nombre: ");
//        objp.setNombre(obj.next());
//        System.out.print("Apellido: ");
//        objp.setApellido(obj.next());
//        System.out.print("Telefono: ");
//        objp.setTelefono(obj.next());
//        System.out.println(objp.getCedula() + " " + objp.getNombre());
//        objp.mostrar();
//        
//        ///una manera directa y mas practica 
//        Persona p1 = new Persona("0966", "Isabel", "Tigreros", "232876");
//        System.out.println(p1.getCedula()+" "+p1.getNombre()+" "+p1.getApellido()+" "+p1.getTelefono()+" val "+objp.vaidar());
        ///BUCLES
//        for (int i = 1; i < 10; i++) {
//            if (i % 3 == 0) {
//                System.out.println("#" + i);
//            }
//        }
//        int i = 1;
////        while (i <= 10) {
////            i++;
////            if (i % 3 == 0) {
////                System.out.println("#" + i);
////            }
////        }
//        i=0;
//        do {            
//            i++;
////             if (i % 3 == 0) {
//                System.out.println("#" + i);
////            }
//        } while (i<0);
    }
 
    private static void saludo() {
        System.out.println("Hola mundo");
        System.out.println("   Curso...");
    }

    private static void nombre() {
        System.out.println(" Anthony");

    }

    /////Menu de opciones
    private static void Menuop() {

        String opciones[] = {"Insertar.", "Consultar.", "Actualizar.",
            "Eliminar.", "Listar.", "Salir"};
        int op;
        op = Menu.Menu(opciones);

        switch (op) {
            case 1:
                formulario(0);
                Menuop();
                break;
            case 2:
                consulta();
                Menuop();
                break;
            case 3:
                actualizar();
                Menuop();
            case 4:
                eliminar();
                Menuop();
                break;
            case 5:///crea un archivo csv "excel" cuando en lista y actuliza 
                Listar();
                Menuop();
                break;
               default:
                    System.out.println("Opcion Fallida");
                
        }
    }
    
     private static void Listar() {
        String cadena = "";
        System.out.println("Lista de empleados: ");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).getCedula()
                    + " " + lista.get(i).getNombre()
                    + " " + lista.get(i).getApellido()
                    + " " + lista.get(i).getTelefono());
            
            cadena = cadena +lista.get(i).getCedula()+";"
                            + lista.get(i).getNombre()+";"
                            + lista.get(i).getApellido()+";"
                            +lista.get(i).getTelefono()+";\n";
   
        }
        if(lista.size() > 0){
            Archivo.CrearArchivos("Empleado.csv", cadena, false);
        }
    }
    
    private static void consulta(){
        String cedula;
        Empleado obj = null;
  
        cedula = Inputs.leerCadenas("Ingresa la cedula: ");
        obj = getCedula(cedula);
        if(obj!=null){
            llenarFormulario(obj);
        }else{
            System.out.println("La cedula no existe");
        }
    }
    
    private static void eliminar(){
        String cedula;
        int pos;
  
        cedula = Inputs.leerCadenas("Ingresa la cedula: ");
        pos = getPosicion(cedula);
        if(pos!=-1){
            lista.remove(pos);
        }else{
            System.out.println("La cedula no existe");
        }
    }
    
    private static void actualizar(){
        String cedula;
        int pos;
  
        cedula = Inputs.leerCadenas("Ingresa la cedula: ");
        pos = getPosicion(cedula);
        if(pos!=-1){
            Empleado obj = formulario(1);
            lista.set(pos, obj);
        }else{
            System.out.println("La cedula no existe");
        }
    }
    
    private static Empleado getCedula(String cedula){
        Empleado obj = null;
        for (int i = 0; i < lista.size(); i++) {
            if(cedula.equals(lista.get(i).getCedula())){
                obj = lista.get(i);
                break;
            }
        }
        return obj;
    }
    
    private static int getPosicion(String cedula){
        int pos = -1;
        for (int i = 0; i < lista.size(); i++) {
            if(cedula.equals(lista.get(i).getCedula())){
                pos = i;
                break;
            }
        }
        return pos;
    }
    
     private static void llenarFormulario(Empleado obj) {
         
        System.out.println("Cedula: "+obj.getCedula());
        System.out.println("Nombre: "+obj.getNombre());
        System.out.println("Apellidos: "+obj.getApellido());
        System.out.println("Telefono: "+obj.getTelefono());

    }

    private static Empleado formulario(int modo) {
        String cedula, nombre, apellido, telefono, msg;
        int edad;
        double sueldo;

//        try {
        cedula = Inputs.leerCadenas("Cedula: ");
        nombre = Inputs.leerCadenas("Nombre: ");
        apellido = Inputs.leerCadenas("Apellidos: ");
        telefono = Inputs.leerCadenas("Telefono: ");
        edad = Inputs.leerEnteros("Edad: ");
        sueldo = Inputs.leerEnteros("Sueldo: ");
        msg = Operaciones.edad(edad);
        System.out.println(msg);
        
        System.out.println(nombre + " " + apellido);

        Empleado obje = new Empleado(cedula, nombre, apellido, telefono, " ", " ");
        if(modo == 0){
        lista.add(obje);
        }
        return obje;
//        } catch (Exception e) {
//            System.out.println("Exeption " + e);
//            nombre = null;
//            apellido = null;
//            edad = 0;
//            sueldo = 0;
//
//        }
    }

    
    private static void venta() {
        String nombre, apellido, nom_articulo;
        double valor_articulo, total, iva, subtotal, descuento;
        int cantidad, cedula, edad;

        try {
            cedula = Inputs.leerEnteros("Cedula: ");
            nombre = Inputs.leerCadenas("Nombre del cliente: ");
            apellido = Inputs.leerCadenas("Apellido del cliente: ");
            edad = Inputs.leerEnteros("Edad del cliente: ");
            nom_articulo = Inputs.leerCadenas("Nombre del articulo: ");
            cantidad = Inputs.leerEnteros("Cantidad: ");
            valor_articulo = Inputs.leerEnteros("valor del articulo: ");
            subtotal = Operaciones.getsubtotal(cantidad, valor_articulo);
            iva = Operaciones.getIva(subtotal);
            descuento = Operaciones.edad(edad, subtotal, iva);
            total = descuento;//total = subtotal + iva - descuento;

            System.out.println("El total de su compra es: " + total);///contatenar todo
        } catch (Exception e) {
            System.out.println("Expection " + e);

        }
    }

    public static void operacion() {
        double num1, num2, cal;

        try {
            num1 = Inputs.leerReales("Primer numero: ");
            num2 = Inputs.leerReales("Segundo numero: ");
        } catch (Exception e) {
            System.out.println("Exeption " + e);
            num1 = 0;
            num2 = 0;
        }
        System.out.println("La suma es: " + Operaciones.suma(num1, num2));
        System.out.println("La resta es: " + Operaciones.resta(num1, num2));
        System.out.println("La multiplicacion es: " + Operaciones.multiplicacion(num1, num2));
        System.out.println("La division es: " + Operaciones.division(num1, num2));
    }

    private static void usoCaso() {
        int op;

        try {
            op = Inputs.leerEnteros("Elija opcion: ");
        } catch (Exception e) {
            System.out.println("Exception " + e);
            op = 0;
        }
        switch (op) {
            case 1:
                System.out.println("JAVA");
                break;
            case 2:
                System.out.println("C++");
                break;
            case 3:
                System.out.println("PYTHON");
                break;
            default:
                System.out.println("OPCION INCORRECTA");

        }

    }

    private static void menu() {
        int e;
        //otra manera de hacer para no utilizar sout se lo concatena pero con una variable 
        String cadena = "1. OPCION SALUDO"
                + "\n2. OPCION NOMBRE"
                + "\n3. OPCION FORMULARIO"
                + "\n4. OPCION VENTA"
                + "\n5. OPCION OPERACION"
                + "\n6. OPCION USO CASO"
                + "\n7. OPCION SALIR";
        System.out.println(cadena);

        //manera diferente de contenar
//        System.out.println("1. OPCION SALUDO"
//                + "\n2. OPCION NOMBRE"
//                + "\n3. OPCION FORMULARIO"
//                + "\n4. OPCION VENTA"
//                + "\n5. OPCION OPERACION"
//                + "\n6. OPCION USO CASO"
//                + "\n7. OPCION SALIR");
//        System.out.println("2. OPCION NOMBRE");
//        System.out.println("3. OPCION FORMULARIO");
//        System.out.println("4. OPCION VENTA");
//        System.out.println("5. OPCION OPERACION");
//        System.out.println("6. OPCION USO CASO");
//        System.out.println("7. OPCION SALIR");
        try {
            e = Inputs.leerEnteros("Escoja tu opcion de tus programas: ");
        } catch (Exception ex) {
            System.out.println("Exception " + ex);
            e = 0;
        }

        switch (e) {
            case 1:
////                for (int i = 1; i < 3; i++) {
                saludo();
////                }
                menu();
                break;

            case 2:
                nombre();
                menu();
                break;

            case 3:
                formulario(0);
                menu();
                break;

            case 4:
                venta();
                menu();
                break;

            case 5:
                operacion();
                menu();
                break;

            case 6:
                usoCaso();
                menu();
                break;

            case 7:
                System.exit(0);
                menu();
                break;

            default:
                System.out.println("OPCION INCORRECTA");

        }
    }

    public static void datos() {

        String cedula[] = new String[3];
        String nombre[] = new String[3];
        String apellido[] = new String[3];

        for (int i = 0; i < cedula.length; i++) {

            cedula[i] = Inputs.leerCadenas((i + 1) + " Cedula: ");
            nombre[i] = Inputs.leerCadenas((i + 1) + " Nombre: ");
            apellido[i] = Inputs.leerCadenas((i + 1) + " Apellido: ");
        }
        Arrays.sort(cedula);
        Arrays.sort(nombre);
        Arrays.sort(apellido);
        for (int i = 0; i < nombre.length; i++) {
            System.out.println("Cedula: " + cedula[i] + "\nNombre: " + nombre[i] + "\nApellido: " + apellido[i]);
        }

    }

    public static void ordenarNumeros() {

        String numero[] = new String[5];

        for (int i = 0; i < numero.length; i++) {

            numero[i] = Inputs.leerCadenas((i + 1) + " Ingrese numeros: ");

        }
        Arrays.sort(numero);
        for (int i = 0; i < numero.length; i++) {
            System.out.println(numero[i]);
        }
    }

    public static void dinamico() {
        ArrayList<String> lista = new ArrayList();
        lista.add("Isan");
        lista.add("Isabel");
        lista.add("Anthony");
        System.out.println("Antes " + lista.size());
        lista.remove(2);
        lista.set(0, "Anton");
        System.out.println("Despues " + lista.size());
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }

}
