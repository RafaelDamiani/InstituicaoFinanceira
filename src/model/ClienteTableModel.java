/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.ClienteController;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author rafae
 */
public class ClienteTableModel extends AbstractTableModel {

    private List<Cliente> dados = new ArrayList<>();
    private String[] colunas = { "Nome", "Sobrenome", "RG", "CPF", "Salário" };

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
                return dados.get(rowIndex).getSobrenome();
            case 2:
                return dados.get(rowIndex).getRg();
            case 3:
                return dados.get(rowIndex).getCpf();
            case 4:
                return dados.get(rowIndex).getSalario();
        }
        
        return null;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Cliente cliente = new Cliente(
            dados.get(rowIndex).getNome(),
            dados.get(rowIndex).getSobrenome(),
            dados.get(rowIndex).getRg(),
            dados.get(rowIndex).getCpf(),
            dados.get(rowIndex).getEndereco(),
            dados.get(rowIndex).getSalario()
        );
        
        switch (columnIndex) {
            case 0:
                cliente.setNome((String) aValue);
                dados.get(rowIndex).setNome((String) aValue);
                break;
            case 1:
                cliente.setSobrenome((String) aValue);
                dados.get(rowIndex).setSobrenome((String) aValue);
                break;
            case 2:
                cliente.setRg((String) aValue);
                dados.get(rowIndex).setRg((String) aValue);
                break;
            case 3:
                cliente.setCpf((String) aValue);
                dados.get(rowIndex).setCpf((String) aValue);
                break;
            case 4:
                cliente.setEndereco((String) aValue);
                dados.get(rowIndex).setEndereco((String) aValue);
                break;
            case 5:
                cliente.setSalario(Double.valueOf(aValue.toString()));
                dados.get(rowIndex).setSalario(Double.valueOf(aValue.toString()));
                break;
        }        
        int idCliente = dados.get(rowIndex).getIdCliente();
        cliente.setIdCliente(idCliente);
        
        ClienteController clienteController = new ClienteController();
        clienteController.prepareUpdate(cliente);
        
        this.fireTableRowsUpdated(rowIndex, rowIndex);
    }
    
    public void addLinha(Cliente cliente) {
        this.dados.add(cliente);
        this.fireTableDataChanged();
    }
    
    public void removeLinha(int linha) {
        this.dados.remove(linha);
        this.fireTableRowsDeleted(linha, linha);
    }
    
    public void removeCliente(int linha) {
        Cliente cliente = new Cliente();
        int idCliente = dados.get(linha).getIdCliente();
        cliente.setIdCliente(idCliente);        
        
        ClienteController clienteController = new ClienteController();
        clienteController.prepareDelete(cliente);

        removeLinha(linha);
    }
}
