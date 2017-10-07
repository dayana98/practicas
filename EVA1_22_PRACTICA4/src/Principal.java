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
        Double aDatos[][]=new Double[5][5];
        Double aCDatos[][]=new Double[5][5];
        Double aMatrizR[][]=new Double[5][5];
       //LLENAR MATRIZ 1
        for (int i = 0; i < aDatos.length; i++) {
            for (int j = 0; j < aDatos.length; j++) {
                aDatos[i][j]=(Math.random()*10)+1;
            }
             
            
        }
        //IMPRIMIR MATRIZ 1
        for (int i = 0; i < aDatos.length; i++) {//filas
              for (int j = 0; j < aDatos.length; j++) {//COLUMNAS
                  System.out.print("[" + aDatos[i][j]+ "]");
                  
              }
                 System.out.println("");
             }
        //LLENAR MATRIZ 2
         for (int i = 0; i < aCDatos.length; i++) {
            for (int j = 0; j < aCDatos.length; j++) {
                aCDatos[i][j]=(Math.random()*10)+1;
            }
             
            
        }
         //IMPRIMIR MATRIZ 2
        for (int i = 0; i < aCDatos.length; i++) {//filas
              for (int j = 0; j < aCDatos.length; j++) {//COLUMNAS
                  System.out.print("[" + aCDatos[i][j]+ "]");
                  
              }
                 System.out.println("");
             }
        //MATRIZ QUE MULTIPLICA
        for (int i = 0; i < aMatrizR.length; i++) {
            for (int j = 0; j < aMatrizR.length; j++) {
                aMatrizR[i][j]=aDatos[i][j]*aCDatos[i][j];
            }
             
            
        }
        //IMPRIMIR MATRIZ DE RESULTADOS
        for (int i = 0; i < aMatrizR.length; i++) {//filas
              for (int j = 0; j < aMatrizR.length; j++) {//COLUMNAS
                  System.out.print("[" + aMatrizR[i][j]+ "]");
                  
              }
                 System.out.println("");
             }
        
        
    }
    
}
