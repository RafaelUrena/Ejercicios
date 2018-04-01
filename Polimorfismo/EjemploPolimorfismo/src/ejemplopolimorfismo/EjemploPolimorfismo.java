/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplopolimorfismo;

import Personal.*;

/**
 *
 * @author faranzabe
 */
public class EjemploPolimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Profesor p = new Profesor();
//        Alumno a = new Alumno();
//        
//        Profesor profs[] = new Profesor[50];
//        Alumno als[] = new Alumno[500];
        Object personal[] = new Object[550];
        personal[0] = new Profesor("Jaime", "Tutor");
        personal[1] = new Alumno("Victor", 10);
        personal[2] = new Alumno("Rafa", 25);
        personal[3] = new Profesor("Agustín", "Profesor LM");
        Alumno otral = new Alumno("Nuria",36);
        personal[4] = otral;

        Alumno a = null;
        Profesor p = null;

        for (int i = 0; i < personal.length; i++) {
            if (personal[i] != null) {
                if (personal[i] instanceof Alumno) {
                    a = (Alumno) personal[i];
                    a.setNota(a.getNota() + 1);
                    System.out.println("Alumno: " + a);
                }
                if (personal[i] instanceof Profesor){
                    p = (Profesor) personal[i];
                    System.out.println("Profesor: " + p);
                }
            }
        }
    }

}
