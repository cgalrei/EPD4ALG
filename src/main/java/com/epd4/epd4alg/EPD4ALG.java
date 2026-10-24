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
        /*Tambien provisional para DEBUG*/
        int[][]matriz1 = {{2,4},{1,2}};
        int[][]matriz2 = {{1,3},{1,1}};
        int[][]matriz3 = {{0,0},{0,0}};
        
        MatricesRecursivo.matricesRecursivo(matriz1, matriz2, matriz3, 0, 0, 0, 2, 2, 2);
        
    }
}