/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam_2014_capicua;

/**
 *
 * @author Rafalaptop
 */
public class Exam_2014_Capicua {

    static int capi(int n){
        int sol=0,res,cont=1;
        int cifra[] = new int[1];
        
        cifra(n,cifra);
        
        do{
            res = n % 10;
            sol = (int) (sol + (res * Math.pow(10, cifra[0])));
            n=n/10;
            cifra[0]--;
        }while(n!=0);
        
        sol = sol/10;
        
        return sol;
    }//Fin capi-----------------------------------------------------------------
    
    static void cifra(int n,int ci[]){
        
        do{
            n=n/10;
            ci[0]++;
        }while(n!=0);
        
    }//Fin cifra----------------------------------------------------------------
    public static void main(String[] args) {
        int n;
        int n_inv;
        int cif[] = new int[1];
                    
            n =(int) (Math.random()*99999)+99;
            
            System.out.println(n);
            
            n_inv = capi(n);
            
            System.out.println(n_inv);
            
            if(n == n_inv){
                System.out.println("El número es capicua");
            }
            else{
                System.out.println("El numero no es capicua");
            }
        
        
        
        
        
    }
    
}
