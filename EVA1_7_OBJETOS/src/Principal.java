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
       // System.out.println("");
        
        //AREGLO DE 10 ALUMNOs
        Alumno aaAlumnos[] = new Alumno[10];
        
        //LLENAR EL ARREGLO CON DATOS DEL ALUMNO
        
        for (int i = 0; i < 10; i++) {
            aaAlumnos[i] = new Alumno("Dayana","16550493",0);
            
        }
        
        //imnprimir 
        for (int i = 0; i < 10; i++) {
            System.out.println("Nombre "+ aaAlumnos[i].getaNom());
            System.out.println("Numero de Control "+ aaAlumnos[i].getaNoCtrl());
            System.out.println("Carrera "+ aaAlumnos[i].getiCarro());
            
        }
        
        //COPIA DEL ARREGLO
    
        
        Alumno aaCopia[] = new Alumno[10];
        
        for (int i = 0; i < 10; i++) {
            
            aaCopia[i] = new Alumno(aaAlumnos[i].getaNom(),
                             aaAlumnos[i].getaNoCtrl(),
                             aaAlumnos[i].getiCarro());
            
        }
        //probar
        
       // aaAlumnoss
    }
    
}

class Alumno{
    
    private String aNom;
    private String aNoCtrl;
    private int iCarro;
    
    //constructor para la clase,inicializar 
    
    public Alumno(String aNombre, String aNoControl, int iCarrera){
        aNom = aNombre;
        aNoCtrl = aNoControl;
        iCarro = iCarrera;// 0 --- ISO
    }
    
    //SET AND GET DE LOS ATRIBUTOS

    public String getaNom() {
        return aNom;
    }

    public void setaNom(String aNom) {
        this.aNom = aNom;
    }

    public String getaNoCtrl() {
        return aNoCtrl;
    }

    public void setaNoCtrl(String aNoCtrl) {
        this.aNoCtrl = aNoCtrl;
    }

    public int getiCarro() {
        return iCarro;
    }

    public void setiCarro(int iCarro) {
        this.iCarro = iCarro;
    }
    
}