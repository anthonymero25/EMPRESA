/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curso.archivo;

import java.io.File;
import java.io.FileWriter;

/**
 *
 * @author Luis Alberto Mero
 */
public class Archivo {
    
    public static void CrearArchivos(String archivos, String contenido, boolean tipo) {
        ///tipo di es "false" se sobre escribe si es "true" añande registro
        try {
            File archivo = new File(archivos);///crea archivo vacio
            FileWriter escribir = new FileWriter(archivo,tipo);///crea objeto de escritura
            
            escribir.write(contenido);///escrribe contenido en el archivo
            escribir.close();///cierra archivo
        } catch (Exception e) {
        }
    }
    
}
