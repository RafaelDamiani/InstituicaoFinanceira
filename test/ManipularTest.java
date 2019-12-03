/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.SQLException;
import model.Conta;
import model.dao.ManipularDao;
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
    public void updateSaldo() throws SQLException {
        ManipularDao get = new ManipularDao();
        Conta conta = new Conta();
        conta.setNumConta(4);
        conta.setSaldo(2000);
        get.updateSaldo(conta);
    }
}
