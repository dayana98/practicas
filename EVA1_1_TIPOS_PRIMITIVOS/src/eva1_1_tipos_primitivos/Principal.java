/*PRACTICA PARA ESCRIBIR LOS TIPOS DE DATOS DE LENGUAJE JAVA*/

package eva1_1_tipos_primitivos;

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
        String sNom;
        int iEdad;
        double dSal;
        Scanner sCaptura = new Scanner(System.in);
        System.out.println("Cúal es tu mombre?");
        sNom=sCaptura.nextLine();
        System.out.println("Cúal es tu edad?");
        iEdad=sCaptura.nextInt();
        System.out.println("Cúal es tu salario?");
        dSal=sCaptura.nextDouble();
        hacerAlgo(sNom, iEdad, dSal);
        
    }

    /**
     *Un metodo para imprimir los valores del uruario
     * @param sNombre Nombre del usuario
     * @param Iedad Edad del usuario
     * @param dSalario Salario del usuario
     */
    public static void hacerAlgo(String sNombre, int iEdad, double dSalario){
        System.out.println(sNombre +" "+ iEdad + " "+dSalario);
    }
    
}
