/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.epd4.epd4alg;

/**
 *
 * @author lucas
 */
public class MatricesIterativo {
    public static int[][] multiplicarMatrices(int[][] m1, int[][] m2){
        /*Esta función verifica que se cumpla la condición para multiplicar una matriz, en caso de poder
        operamos, de lo contrario, se enviará un mensaje de error y se devolverá la matriz nula*/
        /*Parámetros: int[][] m1 (matriz), int[][] m2 (matriz).*/
        /*Return: int[][] (matriz resultante)*/
        
        /*Comprobamos que el número de columna de la primera matriz sea igual al
        de columnas de la segunda (Condición para multiplicar matrices)*/
        int[][] matriz_resultante = new int[m1.length][m2[0].length]; // La matriz tendrá las filas de la primera y las columnas de la segunda.
        
        if (m1[0].length == m2.length){
            for(int i = 0; i<m1.length; i++){ // Recorremos el número de filas de la primera matriz.
                
                for(int j = 0; j<m2[0].length; j++){ // Recorremos el número de columnas de la segunda matriz.
                    matriz_resultante[i][j] = 0;
                    
                    for(int k = 0; k<m1[0].length; k++){ // En cada iteracion, multiplicamos cada elemento de la fila de la matriz_1 con las columnas de la otra matriz.
                        matriz_resultante[i][j] += (m1[i][k] * m2[k][j]);
                    }
                }
            }
        }
        
        return matriz_resultante;
    }
}
