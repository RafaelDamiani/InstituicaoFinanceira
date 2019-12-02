/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.SQLException;
import model.ContaCorrente;
import model.ContaInvestimento;
import model.dao.ClienteDao;
import model.dao.ContaDao;
import org.junit.Test;

/**
 *
 * @author rfabini
 */
public class ContaTest {
    @Test
    public void inserirCC() throws SQLException{
        ContaCorrente cc = new ContaCorrente();
        cc.setDepositoInicial(1500.00);
        cc.setLimite(400.00);
        cc.setSaldo(1500.00);        
        cc.setCliente(new ClienteDao().getCliente(2));
        cc.setTipo("CC");
        ContaDao persist = new ContaDao();
        persist.insertContaCorrente(cc);        
    }
    
    @Test
    public void atualizarConta() throws SQLException{
        ContaDao persist = new ContaDao();
        ContaCorrente cc = persist.getContaCorrente(7);
        cc.setSaldo(cc.getSaldo() * 1.01);
        persist.update(cc);
    }

    @Test
    public void inserirCI() throws SQLException{
        ContaInvestimento ci = new ContaInvestimento();
        ci.setDepositoInicial(1500.00);
        ci.setSaldo(1500.00);   
        ci.setDepositoMinimo(200);
        ci.setMontanteMinimo(600);
        ci.setCliente(new ClienteDao().getCliente(2));
        ci.setTipo("CI");
        ContaDao persist = new ContaDao();
        persist.insertContaInvestimento(ci);        
    }
    
    @Test
    public void deletarConta() throws SQLException{
        ContaDao deletar = new ContaDao();
        ContaCorrente cc = deletar.getContaCorrente(7);
        deletar.delete(cc);
    }
}
