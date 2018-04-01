/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ElTet;

/**
 *
 * @author the_d
 */
public class El_Tet {
    private  Dron alm_dron[];

    public El_Tet(Dron[] alm_dron) {
        this.alm_dron = new Dron[200]; 
    }
    
    public void iniciarDrones(int n){
        
        for (int i = 0; i < this.alm_dron.length; i++) {
            this.alm_dron[i] = new Dron(n);
        }
        
    }
    
    public Dron sacarDron(){
        int j=0;
        Dron d = new Dron(j);
        int i=0;
        
        while( i < this.alm_dron.length){
            d = this.alm_dron[i];
        }
        
        return d;
    }
    
    
    
}
