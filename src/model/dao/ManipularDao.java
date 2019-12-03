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
import model.Conta;

/**
 *
 * @author rfabini
 */
public class ManipularDao {
    
    String sql ="";
    
    public Conta getContaByCpf(String cpf) throws SQLException {
        Connection con = null;
        PreparedStatement stmt = null;              
        try {
            Conta conta = new Conta();
            con = new ConnectionFactoryComProperties().getConnection();
            sql = "select * from tb_conta inner join tb_cliente on tb_conta.idcliente = tb_cliente.idcliente where cpf = ?";
            
            stmt = con.prepareStatement(sql);
            stmt.setString(1, cpf);
            
            ResultSet rst = stmt.executeQuery();    
            
            if (rst.next()) {
                conta.setNumConta(rst.getInt("num_conta"));
                conta.setSaldo(rst.getDouble("saldo"));
                conta.setTipo("tipo");
            }
            
            return conta;
        } catch(SQLException e) {
             throw new RuntimeException(e);
        } finally {
            stmt.close(); 
            con.close();
        }
    }
    
    public void updateSaldo(Conta conta) throws SQLException {
        Connection con = null;
        PreparedStatement stmt = null;
        try{
            con = new ConnectionFactoryComProperties().getConnection();
            sql = "update tb_conta set saldo = ? where num_conta = ?";
            stmt = con.prepareStatement(sql);
            stmt.setDouble(1, conta.getSaldo());
            stmt.setInt(2, conta.getNumero());
            
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            stmt.close();
            con.close();
        }
    }
}


