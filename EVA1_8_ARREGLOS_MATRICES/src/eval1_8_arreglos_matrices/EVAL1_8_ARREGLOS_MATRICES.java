/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eval1_8_arreglos_matrices;

/**
 *
 * @author temporal2
 */
public class EVAL1_8_ARREGLOS_MATRICES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int aiArray2D[][]= new int[3][3];
        //LENAR CADA ELEMENTO DEL ARRELGO CON # ALEATORIOS 
          for (int i = 0; i < 3; i++) {//filas
              for (int j = 0; j < 3; j++) {//COLUMNAS
                  aiArray2D[i][j]=(int)(Math.random()*10)+1;
                  
              }
                 
             }
          //IMPRIMIR
          for (int i = 0; i < 3; i++) {//filas
              for (int j = 0; j < 3; j++) {//COLUMNAS
                  System.out.print("[" + aiArray2D[i][j]+ "]");
                  
              }
                 System.out.println("");
             }
          
          
    }
    
}
