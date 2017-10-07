
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
    
    public static final int TAMA=5;
    public static void main(String[] args) {
        // TODO code application logic here
        String asNombres[]=new String[TAMA];
        //CAPTURAR 5 NNOMBRES 
        Scanner sCaptu = new Scanner (System.in);
        for (int i = 0; i < TAMA; i++) {
           System.out.println("Tu nombre :");
           asNombres[i]=sCaptu.nextLine();
        }
        for (String asNombre : asNombres) {
            System.out.println("Nombre: " + asNombre);
            
        }
        //CREAR UNA COPIA DEL ARREGLO
        /*String asCopia[]=asNombre;//Esto no funciona
        asNombre[0]="HOLA MUNDO";
        System.out.println(asCopia[0]);*/
         
        String asCopia[]=new String[TAMA];
        for (int i = 0; i < TAMA; i++) {
            asCopia[i]=asNombres[i];
            
        }
        asNombres[0]="HOLA MUNDO";
        System.out.println("Nombre = " + asNombres[0]);
        System.out.println("Copia = " + asCopia[0]);
    }
    
}
