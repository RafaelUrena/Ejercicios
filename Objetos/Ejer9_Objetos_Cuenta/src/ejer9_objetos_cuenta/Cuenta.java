/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer9_objetos_cuenta;

/**
 *
 * @author the_d
 */
public class Cuenta {
    //******************** Atributos ***********************//
    private Usuario user;
    private boolean titular;
    private float saldo;
    
    //****************** Constructores **********************//

    public Cuenta() {
        
    }

    public Cuenta(Usuario user, boolean titular, float saldo) {
        this.user = user;
        this.titular = titular;
        this.saldo = saldo;
    }
    
    // ********************** get y set *********************// 

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }

    public boolean isTitular() {
        return titular;
    }

    public void setTitular(boolean titular) {
        this.titular = titular;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    //******************* to String *********************//

    @Override
    public String toString() {
        return "Cuenta{" + "user=" + user + ", titular=" + titular + ", saldo=" + saldo + '}';
    }
    
    //******************** Otros métodos ***************************//
    
    public void addUser(){
        
    }//Fin addUser---------------------------------------------
    
    public void supUser(){
        
    }//Fin delUser---------------------------------------------
    
    public void modUser(){
        
    }//Fin modUser---------------------------------------------
    
    public void ingreMon(){
        
    }//Fin ingreMon--------------------------------------------
    
    public void sacarMon(){
        
    }//Fin sacarMon--------------------------------------------
    
    
}
