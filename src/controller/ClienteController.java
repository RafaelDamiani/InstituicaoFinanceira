/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.SQLException;
import java.util.Collections;
import java.util.List;
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

    public void prepareDelete(Cliente cliente) {
        try {
            ClienteDao clienteDao = new ClienteDao();
            clienteDao.delete(cliente);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public List<Cliente> prepareFilter(String filtro, int ordenarPor) {
        try {
            ClienteDao clienteDao = new ClienteDao();
            List<Cliente> clientes = clienteDao.lista(filtro, ordenarPor);
            Collections.sort(clientes);
            return clientes;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void prepareUpdate(Cliente cliente) {
        try {
            ClienteDao clienteDao = new ClienteDao();
            clienteDao.update(cliente);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
