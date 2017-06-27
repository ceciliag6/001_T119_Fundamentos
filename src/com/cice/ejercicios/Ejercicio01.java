/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.ejercicios;

import java.util.Scanner;

/**
 *
 * @author formador
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //declaro la variable a usar por el cliente;
        int numero;
        
        //creo la instancia del scanner
        Scanner scanner = new Scanner(System.in);
        
        //pregunto al usuario
        System.out.print("Introduce el numero deseado: ");
        
        numero = scanner.nextInt();
        
        System.out.println("El numero " + numero + " al cuadrado es = " + numero*numero);
        

    }
    
}
