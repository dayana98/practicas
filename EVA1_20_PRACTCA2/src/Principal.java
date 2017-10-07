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
        // TODO code application logic here
        int aiArray2D[][]= new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if(i==j){
                    aiArray2D[i][j]=1;
                }else{
                    aiArray2D[i][j]=0;
                }
                
            }
            
        }
        
        
        
        for (int i = 0; i <  aiArray2D.length; i++) {//filas
              for (int j = 0; j <  aiArray2D.length; j++) {//COLUMNAS
                  System.out.print("[" + aiArray2D[i][j]+ "]");
                  
              }
                 System.out.println("");
             }
    }
    
}
