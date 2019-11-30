/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.SQLException;
import model.ContaCorrente;
import model.dao.ClienteDao;
import model.dao.ContaDao;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

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
        cc.setCliente(new ClienteDao().getCliente(2));
        cc.setTipo("CC");
        ContaDao persist = new ContaDao();
        persist.insert(cc);        
    }


    
}
