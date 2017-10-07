
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
public class PRINCIPAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //PEDIR NUMERO DE DATOS
        Scanner sCaptu= new Scanner(System.in);
        System.out.println("Cuantos datos ingresaras");
        int iDatos=sCaptu.nextInt();
        int aDatos[]=new int[iDatos];
        
        
        for (int i = 0; i < aDatos.length; i++) {
            System.out.println("Ingresa el dato");
            aDatos[i]=sCaptu.nextInt();
            
            
        }
        System.out.println("Que dato se quiere buscar");
        int iDB=sCaptu.nextInt();
        boolean bBande=false;
        for (int i = 0; i < aDatos.length; i++) {
            if(iDB==aDatos[i]){
                System.out.println("Se encuentra el la posicion "+(i+1));
                bBande=true;
                
                
            }
        }
        if(bBande == false){
            System.out.println("No existe ese número en este arreglo");
        }
    }
    
}
