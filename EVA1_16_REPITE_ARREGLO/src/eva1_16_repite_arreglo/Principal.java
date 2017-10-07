/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_16_repite_arreglo;

import java.util.Scanner;

/**
 *
 * @author 16550493
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Pedir los datos del arreglo
        Scanner sCaptu= new Scanner(System.in);
        System.out.println("Cuantos datos ingresaras");
        int iDatos=sCaptu.nextInt();
        int aDatos[]=new int[iDatos];
        
        
        for (int i = 0; i < aDatos.length; i++) {
            System.out.println("Ingresa el dato");
            aDatos[i]=sCaptu.nextInt();
            
            
        }
        System.out.println("Que elemento quieres saver si se repite");
        int iValor=sCaptu.nextInt();
        int iCon=0;
        for (int i = 0; i < aDatos.length; i++) {
            if(iValor==aDatos[i]){
                iCon++;
                
                
            }
            
        }
        System.out.println("Se repite "+iCon);
        
    }
    
}
