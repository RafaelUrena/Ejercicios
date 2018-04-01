/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer29_estructurada;

import java.util.Scanner;

/**
 *
 * @author Pancarcho Clasmerdeles
 */
public class Ejer29_Estructurada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float notas;
        int sobre=0,nota=0,bien=0,aprob=0,susp=0;
        
        Scanner sc=new Scanner(System.in);
        
        do{
            do{
                System.out.println("Ponga la nota del alumno");
                notas = sc.nextFloat();
                if (notas>10){
                    System.out.println("Nota erronea");
                }//Fin if
                
            }while(notas>10);
            
            if(notas>=0 && notas<=10){
                
                if(notas==0 || notas<=4){
                    susp++;
                }//Fin if
                if(notas>=5 && notas<=10){
                    aprob++;
                }//Fin if
                if(notas==5 || notas==6){
                    bien++;
                }//Fin if
                if(notas==7 || notas==8){
                    nota++;
                }//Fin if
                if(notas==9 || notas==10){
                    sobre++;
                }//Fin if
            }//Fin if
            
        }while(notas>=0);
        
        System.out.println("Los alumnos aprobados son: "+aprob);
        System.out.println("Los alumnos suspensos son: "+susp);
        System.out.println("Los alumnos que han sacado de 5 a 6 son: "+bien);
        System.out.println("Los alumnos que han sacado de 7 a 8 son: "+nota);
        System.out.println("Los alumnos que han sacado de 9 a 10 son: "+sobre);
    }//Fin main
    
}//Fin class
