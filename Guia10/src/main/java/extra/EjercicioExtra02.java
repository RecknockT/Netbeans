
package extra;

import servicio.CantanteFamosoService;


public class EjercicioExtra02 {

    public static void main(String[] args) {
        
        CantanteFamosoService cfs = new CantanteFamosoService();
        for (int i = 0; i < 5; i++) {
            cfs.agregarCantante();
        }
        
        cfs.mostrar();
        
        cfs.menu();
        
    }

}
