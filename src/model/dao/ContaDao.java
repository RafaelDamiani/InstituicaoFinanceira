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
            sql = "select * from tb_conta where num_conta = ?";
            
            stmt = con.prepareStatement(sql);
            stmt.setLong(1, numeroConta);
            
            ResultSet rst = stmt.executeQuery();    
            
            if (rst.next()) {
                cc.setDepositoInicial(rst.getDouble("deposito_inicial"));
                cc.setLimite(rst.getDouble("limite"));
            }
            
            return cc;
        } catch(SQLException e) {
             throw new RuntimeException(e);
        } finally {
            stmt.close(); 
            con.close();
        }
    }
}


