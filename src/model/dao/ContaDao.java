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
import java.util.HashSet;
import java.util.List;
import model.Cliente;
import model.ContaCorrente;

/**
 *
 * @author rfabini
 */
public class ContaDao {
    
    String sql ="";
    
    public ContaCorrente getContaCorrente(long numeroConta) throws SQLException {
        Connection con = null;
        PreparedStatement stmt = null;
        
        
        try {
            ContaCorrente cc = new ContaCorrente();
            
            con = new ConnectionFactoryComProperties().getConnection();
            sql = "select * from tb_conta inner join tb_cliente on tb_conta.idcliente = tb_cliente.idcliente where num_conta = ?";
            
            stmt = con.prepareStatement(sql);
            stmt.setLong(1, numeroConta);
            
            ResultSet rst = stmt.executeQuery();    
            
            if (rst.next()) {
                cc.setDepositoInicial(rst.getDouble("deposito_inicial"));
                cc.setLimite(rst.getDouble("limite"));
                cc.setCliente( new Cliente(rst.getString("nome"), rst.getString("sobrenome"), rst.getString("rg"), rst.getString("cpf"), rst.getString("endereco")));
                cc.setNumConta(rst.getInt("num_conta"));
                cc.setTipo(rst.getString("tipo"));
            }
            
            return cc;
        } catch(SQLException e) {
             throw new RuntimeException(e);
        } finally {
            stmt.close(); 
            con.close();
        }
    }

    public void insert(ContaCorrente cc) throws SQLException{
        Connection con = null;
        PreparedStatement stmt = null;
        try{
            con = new ConnectionFactoryComProperties().getConnection();
            sql = "insert into tb_conta (idcliente , saldo, tipo , deposito_inicial, limite) values (?,?,?,?,?)";
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, cc.getCliente().getIdCliente());
            stmt.setDouble(2, cc.getSaldo());
            stmt.setString(3, cc.getTipo());
            stmt.setDouble(4, cc.getDepositoInicial());
            stmt.setDouble(5, cc.getLimite());
            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            stmt.close();
            con.close();
        }
    }
    

}


