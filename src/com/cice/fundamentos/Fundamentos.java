/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.fundamentos;

/**
 *
 * @author formador
 */
public class Fundamentos {
    
    //tipos de datos primitivos
    int numero = 2_147_483_647; //numero entero
    char caracter = 'b'; //caracter
    long largo = 9_223_372_036_854_775_807l; //numero entero de mayor capacidad que el int
    boolean esVerdadero; // verdadero o falso
    double decimal; //decimal de gran capacidad
    float flotante; //decimal de menor capacidad que double
    short corto = 32767; //numero entero de pequeño tamaño, menor que int
    byte bite = -12; //numero entero menor que short
    static float decimales = 16.05021599999999F;
    static long iban = 1;
    int a = 1, b = 3, c = 0;
    String apellido;
    
    int []x = {1,2,3,4,5,6};
    
    final int edad = 34;
    
    public Fundamentos(){
        //edad = 34;
    }
    
    //El tipo String -> cadena de caracteres
    static String nombre = "Gustavo Gamboa";
    
    public static void main(String[] args){
        //caracter = 'c';
        System.out.println(nombre);
        System.out.println(decimales);
        System.out.println(iban);
        
        
        //CONSTANTE del metodo main
        final String name = "Gustavo Gamboa";
        //name = "";
        
        Coche coche = new Coche();
        
        Fundamentos fun = new Fundamentos();
        System.out.println(fun.apellido);    
        
    }
    
}
