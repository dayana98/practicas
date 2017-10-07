
import java.util.Arrays;
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
        System.out.println("Cuantos edades deseas capturar");
        int iDatos=sCaptu.nextInt();
        int aDatos[]=new int[iDatos];
        int aCDatos[]=new int[iDatos];
        double media=0;
        
        for (int i = 0; i < aDatos.length; i++) {
            System.out.println("Introduce la edad");
             aDatos[i]=(int) sCaptu.nextDouble();
            media=media+aDatos[i];
        }
        
        int aux;
        for (int i = 0; i < aDatos.length; i++) {
            for (int j =i+1; j < aDatos.length; j++) {
                if(aDatos[i]>aDatos[j]){
                     aux=aDatos[i];
                    aDatos[i]=aDatos[j];
                    aDatos[j]=aux;
                    
                    
                }
            }
             
            
        }
        int icon=0,moda=0;
        for (int i = 0; i < aDatos.length; i++) {
            int vr=0;
            for (int j = 0; j < aDatos.length; j++) {
                if(aDatos[i]==aDatos[j]){
                    vr++;
                }if(vr>icon){
                    moda=aDatos[i];
                    icon=vr;
                    
                    
                }
            }
            
        }
      
        for (int i : aDatos) {
            System.out.println(+i);
            
            
        }
        double promedio=0,mediana,var,var1=0,var2=0,des;
        int resi,div;
        resi=iDatos%2;
        div=iDatos/2;
        if(resi==0){
            mediana=(aDatos[div]+aDatos[div+1])/2;
            System.out.println("la mediana es "+mediana);
        }else{
            mediana=aDatos[div+resi];
            System.out.println("la mediana es "+mediana);
        }
        promedio=media/iDatos;
        for (int i = 0; i < aDatos.length; i++) {
            var=Math.pow((-promedio+aDatos[i]),2);
            var1=var1+var;
            
            
        }
        var2=var1/iDatos;
        des=Math.sqrt(var2);
        
        
        
        
          System.out.println("Moda es el numero "+moda);
          System.out.println("La media es "+promedio);
        System.out.println("la varianza es "+var2);
        System.out.println("La desviacion estadar es "+des);
    }
    
}
