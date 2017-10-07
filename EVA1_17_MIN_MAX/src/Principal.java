
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
        Scanner sCaptu= new Scanner(System.in);
        System.out.println("Cuantos datos ingresaras");
        int iDatos=sCaptu.nextInt();
        int aDatos[]=new int[iDatos];
        
        
        for (int i = 0; i < aDatos.length; i++) {
            System.out.println("Ingresa el dato");
            aDatos[i]=sCaptu.nextInt();
            
            
            
        }
        int min, max;
        min=max=aDatos[0];
        for (int i = 0; i < aDatos.length; i++) {
            if(min>aDatos[i]){
                min=aDatos[i]; 
            }
           
            if(max<aDatos[i]){
            max=aDatos[i];
        }
        }
        System.out.println("MAX "+max+" MIN "+min);
    }

}