/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.epd4.epd4alg;

/**
 *
 * @author carlos
 */
public class MatricesRecursivo {
    /*
    Indices: i,j,k
    Tamaños: m,n,p
    Matrices: A[i..i+m-1][j..j+n-1] * B[j..j+n-1][k..k+p-1] = C[i..i+m-1][k..k+p-1]
    */
    public static void matricesRecursivo(int[][]A, int[][]B, int[][]C, int i, int j, int k, int m, int n, int p){
        //CASO BASE: m=1, n=1, p=1
        if(m==1&&n==1&&p==1){
            C[i][k] += A[i][j] * B[j][k];

            System.out.println(C[i][k]);    /*provisional para DEBUG*/
            return;
        }
        
        
        //CASO GENERAL 1: m es el mayor. Parte por la mitad las filas de A
        if(m>=n && m>=p){
            int h = m/2;
            matricesRecursivo(A,B,C,i,j,k,h,n,p);
            matricesRecursivo(A,B,C,i+h,j,k,m-h,n,p);
        }
        
        //CASO GENERAL 2: p es el mayor. Parte por la mitad las columnas de B
        else if(p>=n){
            int h = p/2;
            matricesRecursivo(A,B,C,i,j,k,m,n,h);
            matricesRecursivo(A,B,C,i,j,k+h,m,n,p-h);
        }
        
        //CASO GENERAL 3: n es el mayor. Parte por la mitad la dimension común
        else{
            int h = n/2;
            matricesRecursivo(A,B,C,i,j,k,m,h,p);
            matricesRecursivo(A,B,C,i,j+h,k,m,n-h,p);
        }
    }
}
