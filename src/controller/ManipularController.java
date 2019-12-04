/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.SQLException;
import model.Conta;
import model.dao.ManipularDao;

/**
 *
 * @author rafae
 */
public class ManipularController {
    
    public Conta prepareGetContaByCpf(String cpf) {
        try {
            ManipularDao manipularDao = new ManipularDao();
            return manipularDao.getContaByCpf(cpf);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public void doRemuneracao(Conta conta) {
        conta.remunera();
        updateSaldo(conta);
    }
    
    public boolean doSaque(Conta conta, double valor) {
        if (!conta.saca(valor))
            return false;
        conta.setSaldo(conta.getSaldo() - valor);
        updateSaldo(conta);
        return true;
    }

    public boolean doDeposito(Conta conta, double valor) {
        if (!conta.deposita(valor))
            return false;
        conta.setSaldo(conta.getSaldo() + valor);
        updateSaldo(conta);
        return true;
    }
    
    public void updateSaldo(Conta conta) {
        try {
            ManipularDao manipularDao = new ManipularDao();
            manipularDao.updateSaldo(conta);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
