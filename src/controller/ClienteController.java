/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.SQLException;
import model.Cliente;
import model.dao.ClienteDao;

/**
 *
 * @author rafae
 */
public class ClienteController {
    
    public void prepareInsert(Cliente cliente) {
        try {
            ClienteDao clienteDao = new ClienteDao();
            clienteDao.insert(cliente);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
