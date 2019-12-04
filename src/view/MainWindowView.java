/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ContaController;
import model.dao.ConnectionFactoryComProperties;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import model.Cliente;
import model.ContaCorrente;
import model.ContaInvestimento;
import model.dao.ClienteDao;
import model.dao.ContaDao;

/**
 *
 * @author rfabini
 */
public class MainWindowView extends javax.swing.JFrame {

    /**
     * Creates new form MainView
     */
    public MainWindowView() {
        initComponents();
        
        Connection con = null;
        PreparedStatement stmt = null;

        try {
            con = new ConnectionFactoryComProperties().getConnection();
            List<String> strList = new ArrayList<String>();

            String query = "SELECT * FROM tb_cliente";
            stmt = con.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();

            while(rs.next()){
                strList.add(rs.getString("nome") + " " + rs.getString("sobrenome"));
            }
            stmt.close();
            con.close();
            DefaultComboBoxModel defaultComboBoxModel = new DefaultComboBoxModel(strList.toArray());
            jComboCliente.setModel(defaultComboBoxModel);
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        clienteView1 = new view.ClienteView();
        clienteView3 = new view.ClienteView();
        clienteView2 = new view.ClienteView();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        clientesView1 = new view.ClienteView();
        clienteView4 = new view.ClienteView();
        contasView1 = new view.ContaView();
        jComboConta = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        inputClienteConta3 = new javax.swing.JTextField();
        jLabelClienteConta3 = new javax.swing.JLabel();
        jButtonSalvarClienteConta = new javax.swing.JButton();
        inputClienteConta1 = new javax.swing.JTextField();
        jLabelClienteConta1 = new javax.swing.JLabel();
        inputClienteConta2 = new javax.swing.JTextField();
        jLabelClienteConta2 = new javax.swing.JLabel();
        jLabelCliente = new javax.swing.JLabel();
        jComboCliente = new javax.swing.JComboBox<>();
        jLabelConta = new javax.swing.JLabel();
        manipularView1 = new view.ManipularView();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout clientesView1Layout = new javax.swing.GroupLayout(clientesView1);
        clientesView1.setLayout(clientesView1Layout);
        clientesView1Layout.setHorizontalGroup(
            clientesView1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clientesView1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(clienteView4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        clientesView1Layout.setVerticalGroup(
            clientesView1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, clientesView1Layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(clienteView4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Clientes", clientesView1);

        jComboConta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Conta Corrente", "Conta Investimento" }));
        jComboConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboContaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Vincular Cliente e Conta");

        inputClienteConta3.setEditable(false);
        inputClienteConta3.setBackground(java.awt.Color.lightGray);
        inputClienteConta3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabelClienteConta3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelClienteConta3.setText("Número da Conta: ");

        jButtonSalvarClienteConta.setText("Salvar");
        jButtonSalvarClienteConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarClienteContaActionPerformed(evt);
            }
        });

        inputClienteConta1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        inputClienteConta1.setText("0.00");

        jLabelClienteConta1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelClienteConta1.setText("Depósito Inicial:     R$");

        inputClienteConta2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        inputClienteConta2.setText("0.00");

        jLabelClienteConta2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelClienteConta2.setText("Limite:                 R$");

        jLabelCliente.setText("Cliente:");

        jComboCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um cliente..." }));

        jLabelConta.setText("Conta:");

        javax.swing.GroupLayout contasView1Layout = new javax.swing.GroupLayout(contasView1);
        contasView1.setLayout(contasView1Layout);
        contasView1Layout.setHorizontalGroup(
            contasView1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contasView1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contasView1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelCliente)
                    .addComponent(jLabelConta, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contasView1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboConta, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboCliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(contasView1Layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contasView1Layout.createSequentialGroup()
                .addContainerGap(110, Short.MAX_VALUE)
                .addGroup(contasView1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contasView1Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jButtonSalvarClienteConta, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contasView1Layout.createSequentialGroup()
                        .addGroup(contasView1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contasView1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabelClienteConta2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelClienteConta1))
                            .addComponent(jLabelClienteConta3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(contasView1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputClienteConta3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputClienteConta1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputClienteConta2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(104, 104, 104))
        );
        contasView1Layout.setVerticalGroup(
            contasView1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contasView1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(contasView1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contasView1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelConta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboConta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contasView1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelClienteConta1)
                    .addComponent(inputClienteConta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(contasView1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputClienteConta2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelClienteConta2))
                .addGap(18, 18, 18)
                .addGroup(contasView1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputClienteConta3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelClienteConta3))
                .addGap(28, 28, 28)
                .addComponent(jButtonSalvarClienteConta, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(170, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Contas", contasView1);

        javax.swing.GroupLayout manipularView1Layout = new javax.swing.GroupLayout(manipularView1);
        manipularView1.setLayout(manipularView1Layout);
        manipularView1Layout.setHorizontalGroup(
            manipularView1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 501, Short.MAX_VALUE)
        );
        manipularView1Layout.setVerticalGroup(
            manipularView1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 484, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Manipular", manipularView1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 503, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jComboContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboContaActionPerformed
        String conta = (String) jComboConta.getSelectedItem();
        if(conta.equals("Conta Investimento")){
            jLabelClienteConta1.setText("Montante Mínimo:  R$");
            jLabelClienteConta2.setText("Depósito Mínimo:   R$");
            jLabelClienteConta3.setText("Depósito Inicial:     R$");
            inputClienteConta3.setText("0.00");
            inputClienteConta3.setEditable(true);
            inputClienteConta3.setBackground(Color.WHITE);
        }else{
            jLabelClienteConta1.setText("Depósito Inicial:     R$");
            jLabelClienteConta2.setText("Limite:                 R$");
            jLabelClienteConta3.setText("Número da Conta: ");
            inputClienteConta3.setEditable(false);
            inputClienteConta3.setText("");
            inputClienteConta3.setBackground(Color.LIGHT_GRAY);
        }
    }//GEN-LAST:event_jComboContaActionPerformed

    private void jButtonSalvarClienteContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarClienteContaActionPerformed
        String conta = (String) jComboConta.getSelectedItem();
        int idCliente = 0, numConta = 0;
        String sobrenome = "";
        Double salario = null;
        if(conta.equals("Conta Corrente")){
            ContaCorrente cc = new ContaCorrente();
            String depIn = inputClienteConta1.getText();
            Double di = Double.parseDouble(depIn);
            cc.setDepositoInicial(di);
            cc.setSaldo(di);
            String limite = inputClienteConta2.getText();
            Double lim = Double.parseDouble(limite);
            cc.setLimite(lim);
            
            String cliente = (String) jComboCliente.getSelectedItem();
            String[] textoSeparado = cliente.split(" ");
            String nome = textoSeparado[0];
            for(int i = 1; i < textoSeparado.length; i++){
                if(i == (textoSeparado.length - 1)){
                    sobrenome += textoSeparado[i];
                }else{
                    sobrenome += textoSeparado[i] + " ";
                }
            }
            //Busca id do cliente
            ContaController contaController = new ContaController();
            ClienteDao clienteDao = new ClienteDao();
            try {
                cc.setCliente(clienteDao.clienteNomeSobrenome(nome, sobrenome));
            } catch (SQLException ex) {
                System.out.println("Problema ao busca id do cliente" + ex.getMessage());
            }
            contaController.prepareInsertContaCorrente(cc);
            //gera o numero da conta
            ContaDao contaDao = new ContaDao();
            try {
                numConta = contaDao.getNumConta(clienteDao.clienteNomeSobrenome(nome, sobrenome).getIdCliente());
            } catch (SQLException ex) {
                System.out.println("Problema ao gerar numero da conta" + ex.getMessage());
            }
            String nc = Integer.toString(numConta);
            inputClienteConta3.setText(nc);
        }else{
            ContaInvestimento ci = new ContaInvestimento();
            String monMin = inputClienteConta1.getText();
            Double mm = Double.parseDouble(monMin);
            ci.setMontanteMinimo(mm);
            String depMin = inputClienteConta2.getText();
            Double dm = Double.parseDouble(depMin);
            ci.setDepositoMinimo(dm);
            String depIni = inputClienteConta3.getText();
            Double di = Double.parseDouble(depIni);
            ci.setDepositoInicial(di);
            ci.setSaldo(di);
            
            String cliente = (String) jComboCliente.getSelectedItem();
            String[] textoSeparado = cliente.split(" ");
            String nome = textoSeparado[0];
            for(int i = 1; i < textoSeparado.length; i++){
                if(i == (textoSeparado.length - 1)){
                    sobrenome += textoSeparado[i];
                }else{
                    sobrenome += textoSeparado[i] + " ";
                }
            }
            //Busca id do cliente
            ContaController contaController = new ContaController();
            ClienteDao clienteDao = new ClienteDao();
            try {
                ci.setCliente(clienteDao.clienteNomeSobrenome(nome, sobrenome));
                contaController.prepareInsertContaInvestimento(ci);
            } catch (SQLException ex) {
                System.out.println("Problema ao busca id do cliente" + ex.getMessage());
            }
        }
    }//GEN-LAST:event_jButtonSalvarClienteContaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainWindowView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindowView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindowView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindowView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindowView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private view.ClienteView clienteView1;
    private view.ClienteView clienteView2;
    private view.ClienteView clienteView3;
    private view.ClienteView clienteView4;
    private view.ClienteView clientesView1;
    private view.ContaView contasView1;
    private javax.swing.JTextField inputClienteConta1;
    private javax.swing.JTextField inputClienteConta2;
    private javax.swing.JTextField inputClienteConta3;
    private javax.swing.JButton jButtonSalvarClienteConta;
    private javax.swing.JComboBox<String> jComboCliente;
    private javax.swing.JComboBox<String> jComboConta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCliente;
    private javax.swing.JLabel jLabelClienteConta1;
    private javax.swing.JLabel jLabelClienteConta2;
    private javax.swing.JLabel jLabelClienteConta3;
    private javax.swing.JLabel jLabelConta;
    private javax.swing.JTabbedPane jTabbedPane1;
    private view.ManipularView manipularView1;
    // End of variables declaration//GEN-END:variables
}
