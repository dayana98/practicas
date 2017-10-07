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
        // CUBO (3 Dimensiones)
        int aiArreglo3D [] [] []  = new int [3][3] [3];
        //Recorrerlo y llenarlo de valores 
        for (int i = 0; i < 3; i++) { //Filas
            for (int j = 0; j < 3; j++) { //Columnas
                for (int k = 0; k < 3; k++) { //Niveles
                    aiArreglo3D[i][j][k] = (int)(Math.random() * 10 ) +1;
                    
                    
                }
            }
        }
        //Imprimir
        for (int i = 0; i < 3; i++) { //Filas 
            for (int j = 0; j < 3; j++) {//Columnas
                for (int k = 0; k < 3; k++) {//Niveles
                    System.out.println("[" + aiArreglo3D [i] [j] [k] +   "]"); // Imprimir en linea ya que es dificil representar un cubo 
                    
                }
                
            }
            
        }
    }
    
}
