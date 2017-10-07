/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ramiro
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int aiArray2D[][]= new int[5][5];
        int aiCArray2D[][]=new int[5][5];
        //LENAR CADA ELEMENTO DEL ARRELGO CON # ALEATORIOS 
          for (int i = 0; i <  aiArray2D.length; i++) {//filas
              for (int j = 0; j <  aiArray2D.length; j++) {//COLUMNAS
                  aiArray2D[i][j]=(int)(Math.random()*100)+1;
                  
              }
                 
             }
          //IMPRIMIR
          for (int i = 0; i <  aiArray2D.length; i++) {//filas
              for (int j = 0; j <  aiArray2D.length; j++) {//COLUMNAS
                  System.out.print("[" + aiArray2D[i][j]+ "]");
                  
              }
                 System.out.println("");
             }
          
          //MATRIZ COPIA
         // aiCArray2D=aiArray2D;
          int c=0;
          int k=-1;
          for (int i =4; i>=0; i--) {
                  k++;
                  System.out.print(+k);
              for (int j =4; j>=0; j--) {
                  c++;
                  System.out.print(+c);
                 aiCArray2D[k][c]=aiArray2D[i][j];
                 
                  

              }
        }
          
          
          //IMPRIMIR COPIA
          for (int l = 0; l < aiCArray2D.length; l++) {//filas
              for (int m = 0; m <  aiCArray2D.length; m++) {//COLUMNAS
                  System.out.print("[" + aiCArray2D[l][m]+ "]");
                  
              }
                 System.out.println("");
             }
          
          
          
          
          
          
          
          
    }
    
    
    
}
