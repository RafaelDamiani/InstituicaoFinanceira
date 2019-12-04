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
    protected double depositoInicial;
    protected double saldo;
    protected Cliente cliente;
    protected int numConta;
    protected String tipo;

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
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    public void remunera() {
    }
    
    public boolean deposita(double valor) {
        return valor > 0;
    }
    
    public boolean saca(double valor) {
        return valor > 0;
    }
}
