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
                int[][] matriz = MatrizAleatoria.matrizAleatoria(i, j);
                int[][] matriz2 = MatrizAleatoria.matrizAleatoria(j, k);
                int[][] matriz3 = new int [i][k];
                
                long iniciar = System.nanoTime();
                
                MatricesIterativo.multiplicarMatrices(matriz, matriz2);
                //MatrizAleatoria.imprimirMatriz(m1);
                
                long finalizar = System.nanoTime();
                System.out.println("Tiempo Iterativo " + "(" + m + ")" + ": " + (finalizar-iniciar) + "ns");
                
                long iniciar2 = System.nanoTime();
                
                MatricesRecursivo.multiplicarMatrices(matriz,matriz2,matriz3,0,0,0,i,j,k);
                //MatrizAleatoria.imprimirMatriz(m1);
                
                long finalizar2 = System.nanoTime();
                System.out.println("Tiempo Recursivo " + "(" + m + ")" + ": " + (finalizar2-iniciar2) + "ns");
                
                i += (int)((Math.random()*5)+10);
                j += (int)((Math.random()*5)+10);
                k += (int)((Math.random()*5)+10);
                
                System.out.println("i: " + i + " j: " + j + " k: " + k);
                
            } else{ // Calentamiento inicial (Evitar añadir tiempos de compilación, etc)
                int[][] matriz = MatrizAleatoria.matrizAleatoria(i, j);
                int[][] matriz2 = MatrizAleatoria.matrizAleatoria(j, k);
                int[][] matriz3 = new int [i][k];
                MatricesIterativo.multiplicarMatrices(matriz, matriz2);
                MatricesRecursivo.multiplicarMatrices(matriz, matriz2, matriz3, 0,0,0,i,j,k);
            }
        }
    }
}