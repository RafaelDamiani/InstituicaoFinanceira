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
public class ContaInvestimento extends Conta {
    public double montanteMinimo;
    public double depositoMinimo;

    public double getMontanteMinimo() {
        return montanteMinimo;
    }

    public void setMontanteMinimo(double montanteMinimo) {
        this.montanteMinimo = montanteMinimo;
    }

    public double getDepositoMinimo() {
        return depositoMinimo;
    }

    public void setDepositoMinimo(double depositoMinimo) {
        this.depositoMinimo = depositoMinimo;
    }

    @Override
    public boolean deposita(double valor) {
        if (valor >= this.depositoMinimo)
            return super.deposita(valor);
        return false;
    }
    
    @Override
    public boolean saca(double valor) {
        if (this.saldo - valor >= this.montanteMinimo)
            return super.saca(valor);
        return false;
    }
    
    @Override
    public void remunera() {
        this.saldo *= 1.2;
    }
}
