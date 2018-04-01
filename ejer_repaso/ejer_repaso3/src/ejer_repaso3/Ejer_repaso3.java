/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer_repaso3;

/**
 *
 * @author the_d
 */
public class Ejer_repaso3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cad = "Comeme El Pirolo";
        String cadAx = cad.toLowerCase();
        
        int vocales=0;
        
        for(int i=0;i<cad.length();i++){
            
            if(cadAx.charAt(i) == 'a'  ||cadAx.charAt(i) == 'e' || cadAx.charAt(i) == 'i'|| cadAx.charAt(i) == 'o'||cadAx.charAt(i) == 'u'){
                
                vocales++;
                
            }
        }
        
        System.out.println("La cantidad de vocales es: "+vocales);
        
    }
    
}
