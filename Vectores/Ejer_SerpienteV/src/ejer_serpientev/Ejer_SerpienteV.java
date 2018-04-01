/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer_serpientev;

/**
 *
 * @author the_d
 */
public class Ejer_SerpienteV {

        static char[] crecer(char s[]){
            char ser[]= new char[s.length+1];
            
            for(int i=0;i<s.length;i++){
                ser[i]=s[i];
            }//fin for
            
            asignar_color(ser);
            
            return ser;
        }//Fin crecer---------------------------------------------------------
        
        
        static char[] decrecer(char s[]){
            char ser[]= new char[s.length-1];
            
            
            if(s.length>0){
                for(int i=0;i<ser.length;i++){
                    ser[i]=s[i];
                }//Fin for
            }//Fin if
            return ser;
        }//Fin decrecer---------------------------------------------------------
        
        
        static void cambiar_color(char s[]){
            int alea;
            
            
           
            for(int i=0;i<s.length;i++){
                
            alea = (int)(Math.random()*3);
            
                switch(alea){

                    case 0:
                        s[i] = 'R';
                        break;

                    case 1:
                        s[i] = 'N';
                        break;

                    case 2:
                        s[i] = 'B';
                        break;

                    default:
                        s[i] = 'A';

                }//Fin switch
            }//Fin for
        }//Fin cambiar_color------------------------------------------
        
        static void asignar_color(char s[]){
            int alea;
            
            alea = (int)(Math.random()*3);
            
                switch(alea){

                    case 0:
                        s[s.length-1] = 'R';
                        break;

                    case 1:
                        s[s.length-1] = 'N';
                        break;

                    case 2:
                        s[s.length-1] = 'B';
                        break;

                    default:
                        s[s.length-1] = 'A';

                }//Fin switch
            
        }//Fin asignar-----------------------------------------------------
        
        
        static void iniciar(char s[]){
            
            for(int i=0;i<s.length;i++){
                
                s[i] = 'B';
                
            }//fin for
            
        }//fin iniciar--------------------------------------------------------
        
        static void mostrar(char s[]){
            
            for(int i=0;i<s.length;i++){
                System.out.print("["+s[i]+"]");
            }//fin for
            System.out.println(" ");
        }//Fin mostrar-------------------------------------------------
        
        
    public static void main(String[] args) {
        char serpiente[] = new char[1];
        boolean esta_muerta=false;
        int alea,alea2;
        int edad=0,edad_final=20;
        boolean ataca_mangosta = false;
        
        
        iniciar(serpiente);
        
        mostrar(serpiente);
        
        while(!esta_muerta && !ataca_mangosta){
            
            alea2 = (int)(Math.random()*100); 
            
                if(edad <= edad_final/2){
                    if(alea2<=80){
                        serpiente = crecer(serpiente);
                        System.out.println("La serpiente ha crecido");
                    }//fin if
                    
                    alea2 = (int)(Math.random()*100);
                    
                    if(alea2<=20){
                        cambiar_color(serpiente);
                        System.out.println("La serpiente ha mudado");
                    }//Fin if
                    
                }//Fin if

                alea2 = (int)(Math.random()*100);
                
                if(edad >= edad_final/2){
                    
                    if(alea2<=75){
                        serpiente = decrecer(serpiente);
                        System.out.println("La serpiente ha decrecido");
                    }//Fin if
                    if(alea2<=25){
                        cambiar_color(serpiente);
                        System.out.println("La serpiente ha mudado");
                    }//Fin if
                }//Fin if
            
                alea = (int)(Math.random()*100);
                
                if(alea <= 10){
                    
                    ataca_mangosta=true;
                    
                }//Fin if
                
                if(edad == edad_final){
                    
                    esta_muerta=true;
                    
                }//Fin if
                
                mostrar(serpiente);
            
            edad++;
                
        }//Fin while
        
        if(ataca_mangosta){
            System.out.println("La serpiente murio por una mangosta con "+edad+" años de edad");
        }//fin if
        
        if(esta_muerta){
            System.out.println("La serpiente ha muerto de vieja con "+edad+ " años de edad");
        }//fin if
        
    }//Fin main
    
}
