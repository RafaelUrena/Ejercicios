/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam_2014_fechas;

import java.util.Scanner;

/**
 *
 * @author Rafalaptop
 */
public class Exam_2014_Fechas {

    static int fecha(int d,int m[]){
        m[0]=1;
        int dia=31;
        
        while(d > dia){
            d = d - dia;
            m[0]++;
            if(m[0]==2){
                dia=28;
            }
            if(m[0]==4 || m[0]==6 || m[0]==9 || m[0]==11){
                dia=30;
            }
            if(m[0]==3 || m[0]==5 || m[0]==7 || m[0]==8 || m[0]==10 || m[0]==12){
                dia=31;
            }
        }
        
        return d;
    }
    public static void main(String[] args) {
        int n;
        int dia;
        int mes[] = new int[1];
        
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.print("Ponga un número: ");
            n = sc.nextInt();
            
        }while(n < 0 || n > 365);
        
        dia = fecha(n,mes);
        
        System.out.println("El día es el "+dia+" del mes "+mes[0]);
    }
    
}
