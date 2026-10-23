/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.epd4.epd4alg;

/**
 *
 * @author carlos
 */
public class EPD4ALG {

    public static void main(String[] args) {
        int[][]matriz = matrizAleatoria(3,3);
        
        /*código provisional para imprimir la matriz*/
        for(int i=0; i<matriz.length;i++){
            for(int j=0; j<matriz[i].length;j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
        
    }
    
    public static int[][] matrizAleatoria(int f, int c){
        /*crea una matriz de tamaño de los parámetros pasados*/
        int[][] matriz = new int[f][c];
        
        /*recorre la matriz introduciendo números aleatorios del 1 al 100*/
        for(int i=0; i<matriz.length;i++){
            for(int j=0; j<matriz[i].length;j++){
                matriz[i][j] = (int)(Math.random() * 100);
            }
        }
        
        return matriz;
    }
}

