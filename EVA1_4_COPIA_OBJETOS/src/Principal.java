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
        int iVal=10;
        System.out.println("iVal = "+ iVal );
        //CREAR UNA COPIA
        int iCopiaVal=iVal;
        System.out.println("iCopiaVal = "+ iCopiaVal );
        // INCREMENTAMOS iVal
        iVal++;
        System.out.println("iVal = "+ iVal );
        System.out.println("iCopiaVal = "+ iCopiaVal );
        //--
        Datos dObj=new Datos();
         System.out.println("Obj.iVal = "+ dObj.iVal  );
         //CODIGO QUE NO FUNCIONA
         Datos dCopiaFakeObj=dObj;
         System.out.println("dCopiaFakeObj.iVal = "+ dCopiaFakeObj.iVal  );
         dObj.iVal++;
         System.out.println("dObj.iVal = "+ dObj.iVal  );
         System.out.println("dCopiaFakeObj.iVal = "+ dCopiaFakeObj.iVal  );
         //CODIGO QUE SI FUNIONA
         Datos dCopiaRealObj=new Datos();
         dCopiaRealObj.iVal=dObj.iVal;
         System.out.println("dObj.iVal = "+ dObj.iVal  );
         System.out.println("dCopiaRealObj.iVal = "+ dCopiaRealObj.iVal  );
         dObj.iVal++;
         System.out.println("dObj.iVal = "+ dObj.iVal  );
         System.out.println("dCopiaRealObj.iVal = "+ dCopiaRealObj.iVal  );
         System.out.println( dObj  );
         System.out.println( dCopiaRealObj );
         System.out.println( dCopiaFakeObj );
    }
    
    
}
class Datos{
    public int iVal=10;
        
    }
