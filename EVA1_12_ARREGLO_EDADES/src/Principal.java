
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
        Scanner sCaptu=new Scanner (System.in);
        System.out.println("Cuantos alumnos tiene el grupo");
        int iNoAlum=sCaptu.nextInt();
        //CREAR EL ARREGLO PARA LAS EDADES (ENTERO)
        int aiEdades[]=new int[iNoAlum];
        //LLENARLO
        for (int i = 0; i < aiEdades.length; i++) {
            System.out.println("Introduce la edad");
            aiEdades[i]=sCaptu.nextInt();
            
        }
        //CALCULAR EL PROMEDIO
        int iSuma=0;
        for (int iEdad : aiEdades) {
            iSuma+=iEdad; //iSuma = iSuma + iEdad;
            
        }
        //MOSTRAR
        double dProm=iSuma/iNoAlum;
        System.out.println("EL promedio es " +dProm);
    }
    
}
