/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer7_objetos_mosca;

/**
 *
 * @author the_d
 */
public class Tablero {
    
    private Mosca tab[][];
    
    //Constructor

    public Tablero(int n) {
       this.tab = new Mosca[n][n];
    }

    public Mosca[][] getTab() {
        return tab;
    }

    public void setTab(Mosca[][] tab) {
        this.tab = tab;
    }
    
    //Métodos
    
    public void iniciarTab(){
        
        for(int i=0;i<this.tab.length;i++){
            for(int j=0;j<this.tab[i].length;j++){
                this.tab[i][j] = null;
            }
        }
    }//Fin iniciarTab-------------------------------
    
    
    public void colocarMosca(){
        int pos1,pos2;
        
        pos1 = (int)(Math.random()*tab.length-1);
        pos2 = (int)(Math.random()*tab[0].length-1);
        
        this.tab[pos1][pos2] = new Mosca();
        
    }//Fin colocarMosca---------------------------------
    
    public void colocarMosca(Mosca aux){
        int pos1,pos2;
        
        pos1 = (int)(Math.random()*tab.length-1);
        pos2 = (int)(Math.random()*tab[0].length-1);
        
        this.tab[pos1][pos2] = aux;
    }
    
    
    public int darManotazo(int posF,int posC){
        int qhp=0;//no ha pasado nada
        
        if(this.tab[posF][posC] != null){
                this.tab[posF][posC].setVidas(this.tab[posF][posC].getVidas()-1);
                
                if(this.tab[posF][posC].getVidas()==0){
                    qhp=3;//Esta muerta
                }
                
                if(this.tab[posF][posC].getVidas()>0){
                    qhp=2;//Le ha dado pero no esta muerta
                }
        }
        else{
            for(int auxf = posF - 1;auxf <= posF + 1;auxf++){
                for(int auxc = posC - 1;auxc<= posC +1;auxc++){
                    if(auxf >= 0 && auxf < this.tab.length && auxc >= 0 && auxc < this.tab[0].length){
                        if(this.tab[auxf][auxc]!=null){
                            qhp=1;//ha dado cerca de la mosca
                        }
                    }
                }
            }
        }
        
        
        return qhp;
    }
    
    public void mostrar(){
        
        for(int i=0;i<this.tab.length;i++){
            for(int j=0;j<this.tab[i].length;j++){
                
                if(this.tab[i][j] == null) System.out.print("[ ]");
                else                  System.out.print("[*]");
                
            }
            System.out.println("");
        }
    }//fin mostrar-------------------------------------
    
    public void revolotear(){
        Mosca auxm;
        int alea1,alea2;
        
        for(int i=0;i<this.tab.length;i++){
            for(int j=0;j<this.tab[0].length;j++){
                
                if(this.tab[i][j]!=null){
                    auxm = this.tab[i][j];
                    this.tab[i][j]=null;
                    colocarMosca(auxm);
                }
            }
        }
    }//Fin revolotear--------------------------------------
    
    public void mostrarMosca(){
        
        for(int i=0;i<this.tab.length;i++){
            for(int j=0;j<this.tab[0].length;j++){
                if(this.tab[i][j]!=null){
                    System.out.println(this.tab[i][j].toString());
                }
            }
        }
        
    }
    
}
