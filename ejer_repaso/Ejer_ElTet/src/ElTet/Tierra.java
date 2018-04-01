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
public class Tierra {
    private Cuadrante area[][];

    public Tierra() {
        this.area = new Cuadrante[3][3];
    }
    
    public void iniciarCuadrante(){
        
        for (int i = 0; i < this.area.length; i++) {
            for (int j = 0; j < this.area[0].length; j++) {
                this.area[i][j] = new Cuadrante(i,j);
            }
            
        }
    }
    
}
