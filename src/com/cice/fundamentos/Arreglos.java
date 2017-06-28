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
        int[] tipos[][] = new int[2][2][2];
        
        tipos[0][0][1] = 2;
        
        //[3][3][6]
        //tresd[0][0][2] = 0;
        
     /*   
        for(int[][] mi_array_2d:tresd){
            for (int[] mi_arr:mi_array_2d ){
                for(int variable:mi_arr){
                    System.out.println(variable); 
                }
            }
        }
        
        
     */   
        
        for (int[][] c : tipos) {
            for(int[] d : c) {
                for(int v : d){
                    System.out.println(v);
                }
            }
        }
    }
    
}
