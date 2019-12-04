package controller;

import java.sql.SQLException;
import model.ContaCorrente;
import model.ContaInvestimento;
import model.dao.ContaDao;

/**
 *
 * @author mlcab
 */
public class ContaController {
    
    public void prepareInsertContaCorrente(ContaCorrente cc) {       
         try {
             ContaDao cd = new ContaDao();
             cd.insertContaCorrente(cc);
             /*Contact contato = view.getContact();   
             dao.insert(contato);
             model.adicionaContato(contato);*/
         } catch (SQLException e) {
            throw new RuntimeException(e);
         }
    }
    
    public void prepareInsertContaInvestimento(ContaInvestimento ci) throws SQLException{
        try{
            ContaDao cd = new ContaDao();
            cd.insertContaInvestimento(ci);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        
    }
}
