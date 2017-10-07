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
    public static final int TAMA=10;
    public static void main(String[] args) {
        // TODO code application logic here
        //LAS VARIABLES QUE ESTEN DESPUES DE ESTE TAMBIEN SERAN ARREGLOS
        int[] iArreglo1;
        //LAS VARIABLES QUE ESTAN DESPUES DE ESTE NO SON ARREGLOS AMENOS QUE SE COLOGEN "[]"
        int iAreglo2[];
        
        int iArre[]=new int[TAMA];
        //LLENARLO CON NEMEROS DEL 0 AL 10, CADA EL ELEMENTO DEL ARREGLO
        for(int i = 0; i < iArre.length; i++){
        iArre[i]=(int)(Math.random()*10)+1;
    }
        for (int j : iArre) {
            System.out.println("valor = " + j);
            
        }
                
    }
    
}
