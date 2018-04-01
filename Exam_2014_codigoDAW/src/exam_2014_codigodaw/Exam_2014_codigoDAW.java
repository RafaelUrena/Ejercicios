/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam_2014_codigodaw;

import java.util.Scanner;

/**
 *
 * @author the_d
 */
public class Exam_2014_codigoDAW {

    static int cifras(int n){
        int cont=0;
        
        do{
            n=n/10;
            cont++;
        }while(n>=0);
        
        return cont;
    }//Fin cifras---------------------------------------------------------------
    
    static int codif(int co1,int co2, int co3){
        int sol;
        int cifra;
        
        cifra = cifras(co1)+cifras(co2)+cifras(co3);
        
        while(cifra>=0){
            res = co1 % 10;
            
        }//Fin while
    }
    
    public static void main(String[] args) {
        char co_de;
        int coo1,coo2,coo3;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("¿Que desea hacer codificar(C) o descodificar(D)?");
        co_de = sc.nextLine().charAt(0);
        
        if(co_de == 'c' || co_de == 'C'){
           
            System.out.println("Escriba 3 coordenadas");
            coo1 = sc.nextInt();
            coo2 = sc.nextInt();
            coo3 = sc.nextInt();
        }//fin if
        
        
    }
    
}
