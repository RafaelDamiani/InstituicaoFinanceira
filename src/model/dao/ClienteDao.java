/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Cliente;

/**
 *
 * @author rafae
 */
public class ClienteDao {
    private String sql = "";
    
    public void insert(Cliente cliente) throws SQLException {
        Connection con = null;
        PreparedStatement stmt = null;
        try{
            con = new ConnectionFactoryComProperties().getConnection();
            sql = "insert into tb_cliente (cpf, nome, sobrenome, rg, endereco) values (?,?,?,?,?)";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, cliente.getCpf());
            stmt.setString(2, cliente.getNome());
            stmt.setString(3, cliente.getSobreNome());
            stmt.setString(4, cliente.getRg());
            stmt.setString(5, cliente.getEndereco());
            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            stmt.close();
            con.close();
        }
    }
    
    public void delete(Cliente cliente) throws SQLException {
        Connection con = null;
        PreparedStatement stmt = null;
        try {
            con = new ConnectionFactoryComProperties().getConnection();
            int idCliente = cliente.getIdCliente();
            sql = "delete from tb_conta where idcliente  = ?";
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, idCliente);
            stmt.executeUpdate();
            
            sql = "delete from tb_cliente where idcliente = ?";
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, idCliente);
            stmt.executeUpdate();
        } catch(SQLException e) {
             throw new RuntimeException(e);
        } finally {
            stmt.close();
            con.close();
        }
    }
    
    public List<Cliente> lista(String filtro) throws SQLException {
        Connection con = null;
        PreparedStatement stmt = null;
        
        String filtroNome = "%" + filtro + "%";
        
        try {
            Cliente cliente = new Cliente(filtroNome, filtroNome, filtro, filtro, filtro);
            con = new ConnectionFactoryComProperties().getConnection();
            sql = "select * from tb_cliente where nome like ? or sobrenome like ? or rg = ? or cpf = ?";
            
            stmt = con.prepareStatement(sql);
            stmt.setString(1, filtroNome);
            stmt.setString(2, filtroNome);
            stmt.setString(3, filtro);
            stmt.setString(4, filtro);
            
            ResultSet rst = stmt.executeQuery();    
            
            List<Cliente> clientes = new ArrayList<Cliente>();
            while (rst.next()) {
                cliente = new Cliente();
                cliente.setNome(rst.getString("nome"));
                cliente.setSobreNome(rst.getString("sobrenome"));
                cliente.setRg(rst.getString("rg"));
                cliente.setCpf(rst.getString("cpf"));
                cliente.setEndereco(rst.getString("endereco"));
                
                clientes.add(cliente);
            }
            
            return clientes;
        } catch(SQLException e) {
             throw new RuntimeException(e);
        } finally {
            stmt.close(); 
            con.close();
        }
    }
    
    public void update(Cliente cliente) throws SQLException {
        Connection con = null;
        PreparedStatement stmt = null;
        try{
            con = new ConnectionFactoryComProperties().getConnection();
            sql = "update tb_cliente set nome = ?, sobrenome = ?, rg = ?, cpf = ?, Endereco = ? where idcliente = ?";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getSobreNome());
            stmt.setString(3, cliente.getRg());
            stmt.setString(4, cliente.getCpf());
            stmt.setString(5, cliente.getEndereco());
            stmt.setInt(6, cliente.getIdCliente());
            
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            stmt.close();
            con.close();
        }
    }
}
