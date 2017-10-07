/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author temporal2
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int aiArreglo3D[][][]=new int[2][2][2];
        //LLENARLO CON VALORES ALEATORIOS
        for (int i = 0; i < 2; i++) {//filas
            for (int j = 0; j < 2; j++) {//columnas
                for (int k = 0; k < 2; k++) {//niveles
                    aiArreglo3D[i][j][k]=(int)(Math.random()*100)+1;
                    
                }
                
            }
            
        }
        //IMPRIMIR
        for (int i = 0; i < 2; i++) {//filas
            for (int j = 0; j < 2; j++) {//columnas
                for (int k = 0; k < 2; k++) {//niveles
                    System.out.print("[" +  aiArreglo3D[i][j][k]+ "]");
                   
                    
                }
                System.out.println("");
                
            }
            
        }
        
    }
    
}
