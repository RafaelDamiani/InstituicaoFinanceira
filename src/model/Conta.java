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
    private double saldo;
    private Cliente cliente;
    private int numConta;
    private String tipo;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public void setNumConta(int num){
        numConta = num;
    }
    
    
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
    
    @Override
    public Cliente getDono() {
        return cliente;
    }
    
    @Override
    public int getNumero() {
       return numConta;
    }
    
    @Override
    public double getSaldo() {
        return saldo;
    }
    
    public void remunera() {
        
    }
}
