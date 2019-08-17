/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigo;

import java.io.File;

/**
 *
 * @author owner
 */
public class Principal {
    public static void main(String[] args) {
        String ruta="C:/Users/owner/Documents/NetBeansProjects/AnalizadorLexico/src/Codigo/Lexer.flex";
        generadorLexer(ruta);
    }

    private static void generadorLexer(String ruta) {
        File archivo=new File(ruta);
        JFlex.Main.generate(archivo);
    }
    
}
