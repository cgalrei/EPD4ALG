package com.epd4.epd4alg;

public class MatricesIterativo {
    public static int[][] multiplicarMatrices(int[][] m1, int[][] m2){
        /*
        ----Parámetros----
        Matriz 1: int[][] m1 (matriz)
        Matriz 2: int[][] m2 (matriz).
        ----Return----
        Matriz_resultante: int[][] (matriz)
        ----EXPLICACIÓN----
        Esta función verifica que se cumpla la condición para multiplicar una matriz, en caso de poder
        operamos, de lo contrario, se enbiará un mensaje de error y se devolverá la matriz nula
        */
        
        /*Comprobamos que el número de columna de la primera matriz sea igual al
        de columnas de la segunda (Condición para multiplicar matrices).*/
        int[][] matriz_resultante = new int[m1.length][m2[0].length]; // Nºfilas de la primera y nºcolumnas de la segunda.
        
        if (m1[0].length == m2.length){
            /*Recorremos el número de filas de la primera matriz.*/
            for(int i = 0; i<m1.length; i++){
                /*Recorremos el número de columnas de la segunda matriz.*/
                for(int j = 0; j<m2[0].length; j++){
                    matriz_resultante[i][j] = 0;
                    /*En cada iteracion, multiplicamos cada elemento de la fila de la matriz_1
                    con las columnas de la otra matriz.*/
                    for(int k = 0; k<m1[0].length; k++){
                        matriz_resultante[i][j] += (m1[i][k] * m2[k][j]);
                    }
                }
            }
        }
        return matriz_resultante;
    }
}
