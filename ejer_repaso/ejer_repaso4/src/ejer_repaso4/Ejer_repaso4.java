/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer_repaso4;

import java.util.Scanner;

/**
 *
 * @author the_d
 */
public class Ejer_repaso4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cad;
        char usu;
        int cont=0;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ponga una cadena: ");
        cad = sc.nextLine();
        
        System.out.print("Ponga un caracter para ver cuantas veces aparece: ");
        usu = sc.nextLine().charAt(0);
        
        for(int i=0;i<cad.length();i++){
            
            if(cad.charAt(i)== usu){
                cont++;
            }
        }
        System.out.println("El caracter "+usu+" se repite "+cont+" veces");
        
    }
    
}
