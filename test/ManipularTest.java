/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import controller.ManipularController;
import java.sql.SQLException;
import model.Conta;
import model.dao.ManipularDao;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author rafae
 */
public class ManipularTest {
    @Test
    public void getContaByCpf() throws SQLException {
        ManipularDao get = new ManipularDao();
        get.getContaByCpf("12345678910");
    }
    
    @Test
    public void doRemuneracaoCC() throws SQLException {
        ManipularDao get = new ManipularDao();
        Conta conta = get.getContaByCpf("12345678910");
        ManipularController manpController = new ManipularController();
        double saldoAnterior = conta.getSaldo();
        saldoAnterior *= 1.1;
        manpController.doRemuneracao(conta);
        double saldoPosterior = conta.getSaldo();
        
        Assert.assertTrue(saldoAnterior == saldoPosterior);
    }
    
    @Test
    public void doRemuneracaoINV() throws SQLException {
        ManipularDao get = new ManipularDao();
        Conta conta = get.getContaByCpf("1231212313");
        ManipularController manpController = new ManipularController();
        double saldoAnterior = conta.getSaldo();
        saldoAnterior *= 1.2;
        manpController.doRemuneracao(conta);
        double saldoPosterior = conta.getSaldo();
        
        Assert.assertTrue(saldoAnterior == saldoPosterior);
    }
    
    @Test
    public void doSaqueCCFalse() throws SQLException {
        ManipularDao get = new ManipularDao();
        Conta conta = get.getContaByCpf("12345678910");
        ManipularController manpController = new ManipularController();
        Assert.assertFalse(manpController.doSaque(conta, 500));
    }
    
    @Test
    public void doSaqueCCTrue() throws SQLException {
        ManipularDao get = new ManipularDao();
        Conta conta = get.getContaByCpf("12345678910");
        ManipularController manpController = new ManipularController();
        Assert.assertTrue(manpController.doSaque(conta, 300));
    }
    
    @Test
    public void doSaqueINVFalse() throws SQLException {
        ManipularDao get = new ManipularDao();
        Conta conta = get.getContaByCpf("1231212313");
        ManipularController manpController = new ManipularController();
        Assert.assertFalse(manpController.doSaque(conta, -100000));
    }
    
    @Test
    public void doSaqueINVTrue() throws SQLException {
        ManipularDao get = new ManipularDao();
        Conta conta = get.getContaByCpf("1231212313");
        ManipularController manpController = new ManipularController();
        Assert.assertTrue(manpController.doSaque(conta, 1));
    }
    
    @Test
    public void doDepositoCCFalse() throws SQLException {
        ManipularDao get = new ManipularDao();
        Conta conta = get.getContaByCpf("12345678910");
        ManipularController manpController = new ManipularController();
        Assert.assertFalse(manpController.doDeposito(conta, -1));
    }
    
    @Test
    public void doDepositoCCTrue() throws SQLException {
        ManipularDao get = new ManipularDao();
        Conta conta = get.getContaByCpf("12345678910");
        ManipularController manpController = new ManipularController();
        Assert.assertTrue(manpController.doDeposito(conta, 300));
    }
    
    @Test
    public void doDepositoINVFalse() throws SQLException {
        ManipularDao get = new ManipularDao();
        Conta conta = get.getContaByCpf("1231212313");
        ManipularController manpController = new ManipularController();
        Assert.assertFalse(manpController.doDeposito(conta, 100));
    }
    
    @Test
    public void doDepositoINVTrue() throws SQLException {
        ManipularDao get = new ManipularDao();
        Conta conta = get.getContaByCpf("1231212313");
        ManipularController manpController = new ManipularController();
        Assert.assertTrue(manpController.doDeposito(conta, 600));
    }
}
