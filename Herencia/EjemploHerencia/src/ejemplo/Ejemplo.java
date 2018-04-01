/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo;

import Personal.*;
//import Personal.Alumno;
//import Personal.Profesor;

/**
 *
 * @author faranzabe
 */
public class Ejemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Profesor p = new Profesor("Jaime","Tutor");
        Alumno a = new Alumno("Nuria",6);
        //Comun c = new Comun("Victor");
        
        //System.out.println(c);
        System.out.println(p);

        
        //a.ejemploOverride("wkjhfjkds");
        p.ejemploOverride();
//        a.ejemploOverride();
//        c.ejemploOverride();
    }
    
}
