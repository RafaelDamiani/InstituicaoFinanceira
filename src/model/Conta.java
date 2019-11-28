/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author rafae
 */
public class Conta implements ContaI {
    public double depositoInicial;
    
    public double getDepositoInicial() {
        return depositoInicial;
    }

    public void setDepositoInicial(double depositoInicial) {
        this.depositoInicial = depositoInicial;
    }
    
    public boolean deposita(double valor) {
        return true;
    }
    
    public boolean saca(double valor) {
        return true;
    }
    
    public Cliente getDono() {
        return new Cliente();
    }
    
    public int getNumero() {
       return 1;
    }
    
    public double getSaldo() {
        return 2.0;
    }
    
    public void remunera() {
        
    }
}
