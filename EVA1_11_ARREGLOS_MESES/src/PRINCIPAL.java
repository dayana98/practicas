
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
public class PRINCIPAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String asMeses[] = {"Enero" , "Febrero","Marzo","Abril",
            "Mayo","Junio","Julio","Agosto", 
            "Septiembre"+ "Octubre", "Noviembre","Diciembre"};
                            
                           
       int aiDias[] = {31,28,31,30,31,30,
                        31,31,30,31,30,31};
       Scanner sCaptu= new Scanner (System.in);
        System.out.println("Introduce un número entre 1 y 12: ");
        int iMes =sCaptu.nextInt();
        System.out.println("El mes correspondiente es " +asMeses[iMes-1] + " " + "y tiene " + aiDias[iMes-1] + "dias." );
        
    }
    
}
