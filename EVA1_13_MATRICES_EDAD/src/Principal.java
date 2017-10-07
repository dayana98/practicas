
import java.util.Scanner;

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
        //int  aiEdades[][]= new int[4][30];
        int  aiEdades[][];
        //PREGUNTAR CUANTOS GRUPOS SE TIENEN
        Scanner sCaptu=new Scanner (System.in);
        System.out.println("Cuantos grupos tienes");
        int iNoGru=sCaptu.nextInt();
        aiEdades = new int[iNoGru][];
        
        for (int i = 0; i < aiEdades.length; i++) {
            System.out.println("Cuantos alumnos tienes");
            int iNoAlu=sCaptu.nextInt();
            aiEdades[i]=new int[iNoAlu];
            
            for (int j = 0; j < iNoAlu; j++) {
            System.out.println("Introduce la edad");
            aiEdades[i][j]=sCaptu.nextInt();
            
        }
              
        }
         //CALCULAR EL PROMEDIO
        double iSum;
        double dProm=0;
            for (int k = 0; k < iNoGru; k++) {
                iSum=0;
                for (int l = 0; l < aiEdades[k].length; l++) {
                    iSum+=aiEdades[k][l];
                    dProm=iSum/(aiEdades[k].length);
                    
                }
                
                System.out.println("Suma "+iSum);
                System.out.println("Promedio "+dProm);
                //dProm=iSum/
                
            }
           // System.out.println("Suma "+iSum);
       
    }
    
    
}
 //PREGUNATAR GRUPO POR GRUPO CUANTOS ALUMNOS TIENE
        //aiEdades[0]=new int[10];
        //aiEdades[1]=new int[28];