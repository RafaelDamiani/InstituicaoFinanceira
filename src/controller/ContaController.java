package controller;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.ContaCorrente;
import model.ContaInvestimento;
import model.dao.ContaDao;
import view.ContaView;

/**
 *
 * @author mlcab
 */
public class ContaController {
    
    public void prepareInsertContaCorrente(ContaCorrente cc, ContaView cv) throws SQLException {       
         try {
             ContaDao cd = new ContaDao();
             cd.insertContaCorrente(cc);
             /*Contact contato = view.getContact();   
             dao.insert(contato);
             model.adicionaContato(contato);*/
         } catch (SQLException e) {
            if (e.getMessage().contains("uk"))
                JOptionPane.showMessageDialog(cv, "Esse cliente já possui uma Conta Corrente");
         }
    }
    
    public void prepareInsertContaInvestimento(ContaInvestimento ci, ContaView cv) throws SQLException{
        try{
            ContaDao cd = new ContaDao();
            cd.insertContaInvestimento(ci);
        } catch (SQLException e) {           
            if (e.getMessage().contains("uk"))
                JOptionPane.showMessageDialog(cv, "Esse cliente já possui uma Conta Investimento");
        }
        
    }
}
