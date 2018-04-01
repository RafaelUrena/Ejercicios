/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionamiento_strings;

/**
 *
 * @author the_d
 */
public class Funcionamiento_Strings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int ultima_letra;
        
        String mi_nombre="Rafael Angel";
        
        System.out.println("Mi nombre es: " + mi_nombre);
        
        System.out.println("Mi nombre tiene "+ mi_nombre.length()+ " letras.");
        
        System.out.println("La primera letra de mi nombre es: "+
                mi_nombre + " es la "+ mi_nombre.charAt(0) );
        
        
        ultima_letra = mi_nombre.length();
        
        System.out.println("Y la última letra es la "+ mi_nombre.charAt(ultima_letra-1));
        
        System.out.println("--------------------------------------------------------------------------");
        
        String frase="Hoy es un dia de puta madre para fumarse un mayns...";
        
        String frase_resumen=frase.substring(0,32);
        
        System.out.println(frase_resumen + " programar en Java.");
        
        String frase1=" aprender a programar en Java";
        
        String frase2 = frase + " y " + frase1;
        
        System.out.println(frase2);
        
        String alumno1,alumno2;
        
        alumno1 = "David";
        
        alumno2 = "david";
        
        System.out.println(alumno1.equalsIgnoreCase(alumno2));
    }
    
}
