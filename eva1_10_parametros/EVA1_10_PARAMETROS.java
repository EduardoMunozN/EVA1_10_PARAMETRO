/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva1_10_parametros;

/**
 *
 * @author eduar
 */
public class EVA1_10_PARAMETROS {

    public static void main(String[] args) {
       nPrintln("HOLA", 5);
    }
    public static void nPrintln(String message, int n){
        for(int i = 0; i < n; i++)
            System.out.println(message);
    }
}
