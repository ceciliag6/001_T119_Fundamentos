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
public class Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //declaracion de arrays
        int[] numeros = {1, 2};
        int otrosNumeros[];
        int[] otros;
        
        int[][] bidi = { {1, 2}, {1, 2} };
        
        int[][][] tresd = { { {1, 2}, {1, 2, 3}, {0, 1, 2} }, { {1, 2}, {1} , {0, 0, 1, 2, 5, 7} }, { {0, 0, 1, 2, 5, 7} } };
        
        int nombres[][];
        
        int[] edades[] = new int[2][2];
        String[] tipos[][] = new String[2][2][2];
        
        tipos[0][0][1] = "25";
        
        //[3][3][6]
        //tresd[0][0][2] = 0;
        
        for (String[][] c : tipos) {
            for(String[] d : c) {
                for(String v : d){
                    System.out.println(v);
                }
            }
        }
    }
    
}
