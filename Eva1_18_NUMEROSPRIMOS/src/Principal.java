
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
        Scanner sCaptu=new Scanner(System.in);
        System.out.println("Cual es el numero");
        int iNum=sCaptu.nextInt();
        //PRIMER ALGORITMO
        int iResi=0;
        boolean bBande=false;
        for (int i = 2; i < iNum; i++) {
            iResi=iNum%i;
            if(iResi==0){
                bBande=true;
                break;
            }
            
            
        }
        if(bBande){
            System.out.println("El numero no es primo");
        }else{
            System.out.println("El numero es primo");
        }
        
       // -----------------------------------------------------
              int iRaiz = (int)Math.sqrt(iNum);
                 bBande=false;
        for (int i = 2; i < iRaiz; i++) {
            iResi=iNum%i;
            if(iResi==0){
                bBande=true;
                break;
            }
            
            
        }
        if(bBande){
            System.out.println("El numero no es primo");
        }else{
            System.out.println("El numero es primo");
        }
        
    }
    
}
