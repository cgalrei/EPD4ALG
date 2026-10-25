
package com.epd4.epd4alg;

public class MatrizAleatoria {
    public static int[][] matrizAleatoria(int f, int c){
        /*crea una matriz de tamaño de los parámetros pasados*/
        int[][] matriz = new int[f][c];
        
        /*recorre la matriz introduciendo números aleatorios del 1 al 100*/
        for(int i=0; i<matriz.length;i++){
            for(int j=0; j<matriz[i].length;j++){
                matriz[i][j] = (int)((Math.random() * 20)+10);
            }
        }
        
        return matriz;
    }
    
    /*método para hacer debug*/
    public static void imprimirMatriz(int[][] matriz){
        for(int i = 0; i<(matriz.length); i++){
            for(int j = 0; j<matriz[0].length; j++){
                if(matriz[0].length > 1){
                    if(j == 0){
                        System.out.print("|" + matriz[i][j]);
                    }else if (j == (matriz[0].length - 1)){
                        System.out.println(" " + matriz[i][j] + "|");
                    }else{
                        System.out.print(" " + matriz[i][j]);
                    }
                }else if (matriz[0].length == 1){
                    System.out.println("|" + matriz[i][j]+ "|");
                } else{
                    System.out.println("[Error]: Tamaño inválido.");
                }
            }
        }
    }
}
