package com.epd4.epd4alg;

public class MatricesRecursivo {
    /*
    -----PARÁMETROS-----
    Indices: i,j,k
    Tamaños: m,n,p
    Matrices: A[i..i+m-1][j..j+n-1] * B[j..j+n-1][k..k+p-1] = C[i..i+m-1][k..k+p-1]
    -----EXPLICACIÓN-----
    Este método consiste en buscar la dimensión más alta entre m,n y p y dividirla entre 2.
    Con ambas partes de la división se hará una llamada recursiva del método y se hará esta división
    hasta el caso base, en el que la dimensión sea igual a 1. En el caso base ambos elementos de 
    dimensión 1 se multiplican.
    */
    public static int[][] multiplicarMatrices(int[][]A, int[][]B, int[][]C, int i, int j, int k, int m, int n, int p){
        //CASO BASE: m=1, n=1, p=1
        if(m==1&&n==1&&p==1){
            C[i][k] += A[i][j] * B[j][k];
            return C;
        }
        
        
        //CASO GENERAL 1: m es el mayor. Parte por la mitad las filas de A
        if(m>=n && m>=p){
            int h = m/2;
            multiplicarMatrices(A,B,C,i,j,k,h,n,p);
            multiplicarMatrices(A,B,C,i+h,j,k,m-h,n,p);
        }
        
        //CASO GENERAL 2: p es el mayor. Parte por la mitad las columnas de B
        else if(p>=n){
            int h = p/2;
            multiplicarMatrices(A,B,C,i,j,k,m,n,h);
            multiplicarMatrices(A,B,C,i,j,k+h,m,n,p-h);
        }
        
        //CASO GENERAL 3: n es el mayor. Parte por la mitad la dimension común
        else{
            int h = n/2;
            multiplicarMatrices(A,B,C,i,j,k,m,h,p);
            multiplicarMatrices(A,B,C,i,j+h,k,m,n-h,p);
        }
        return C;
    }
}
