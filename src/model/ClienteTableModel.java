/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author rafae
 */
public class ClienteTableModel extends AbstractTableModel {

    private List<Cliente> dados = new ArrayList<>();
    private String[] colunas = { "Nome", "Sobrenome", "RG", "CPF" };

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }
    
    @Override
    public int getRowCount() {
        return dados.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return dados.get(rowIndex).getNome();
            case 1:
                return dados.get(rowIndex).getSobreNome();
            case 2:
                return dados.get(rowIndex).getRg();
            case 3:
                return dados.get(rowIndex).getCpf();
        }
        
        return null;
    }
    
    public void addLinha(Cliente cliente) {
        this.dados.add(cliente);
        this.fireTableDataChanged();
    }
}
