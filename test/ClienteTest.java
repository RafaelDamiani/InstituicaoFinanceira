/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.SQLException;
import java.util.List;
import model.Cliente;
import model.dao.ClienteDao;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author rafae
 */
public class ClienteTest {
    @Test
    public void insert() throws SQLException {
        Cliente cliente = new Cliente("TESTE", "TESTESOBRENOME", "1111111111", "1111111111", "Rua teste 123");
        ClienteDao persist = new ClienteDao();
        persist.insert(cliente);
    }
    
    
    @Test
    public void delete() throws SQLException {
        Cliente cliente = new Cliente();
        cliente.setIdCliente(1);
        ClienteDao persist = new ClienteDao();
        persist.delete(cliente);
    }
    
    @Test
    public void update() throws SQLException {
        Cliente cliente = new Cliente("TESTE", "TESTESOBRENOMEUPDATED", "2222222222", "3333333333", "Rua teste 123");
        cliente.setIdCliente(1);
        ClienteDao persist = new ClienteDao();
        persist.update(cliente);
    }
    
    @Test
    public void list() throws SQLException {        
        ClienteDao select = new ClienteDao();
        List<Cliente> result = select.lista("SOBRE");
        assertEquals(true, result.size() > 0);
    }
    
}
