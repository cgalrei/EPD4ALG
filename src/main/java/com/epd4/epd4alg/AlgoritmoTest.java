/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.epd4.epd4alg;
/**
 *
 * @author lucas y carlos
 */
public class AlgoritmoTest {
    public static void main(String args[]){
        MedirTiempo();
    }
    
    public static void MedirTiempo(){
        int n = 6; //Número de iteraciones
        int i = 2;
        int j = 2;
        int k = 2;
        for(int m = -5; m<n; m++){         
            if(m >= 0){ // Tras calentar, comenzamos a medir cada iteración
                int[][] matriz = MatrizAleatoria.matrizAleatoria(i, k);
                int[][] matriz2 = MatrizAleatoria.matrizAleatoria(k, j);
                long iniciar = System.nanoTime();
                int[][] m1 = MatricesIterativo.multiplicarMatrices(matriz, matriz2);
                MatrizAleatoria.imprimirMatriz(m1);
                long finalizar = System.nanoTime();
                System.out.println("Tiempo " + "(" + m + ")" + ": " + (finalizar-iniciar) + "ns");
                i += (int)((Math.random()*5)+10);
                j += (int)((Math.random()*5)+10);
                k += (int)((Math.random()*5)+10);
                System.out.println("i: " + i + " j: " + j + " k: " + k);
                
            } else{ // Calentamiento inicial (Evitar añadir tiempos de compilación, etc)
                int[][] matriz = MatrizAleatoria.matrizAleatoria(i, k);
                int[][] matriz2 = MatrizAleatoria.matrizAleatoria(k, j);
                MatricesIterativo.multiplicarMatrices(matriz, matriz2);
            }
        }
    }
}