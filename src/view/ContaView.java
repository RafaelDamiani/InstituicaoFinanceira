/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;

/**
 *
 * @author rfabini
 */
public class ContaView extends javax.swing.JPanel {

    /**
     * Creates new form ContasView
     */
    public ContaView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButtonSalvarClienteConta, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(162, 162, 162))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCliente)
                            .addComponent(jLabelConta, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboConta, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboCliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabelClienteConta2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelClienteConta1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabelClienteConta3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputClienteConta3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputClienteConta1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputClienteConta2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 50, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelConta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboConta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelClienteConta1)
                    .addComponent(inputClienteConta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputClienteConta2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelClienteConta2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputClienteConta3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelClienteConta3))
                .addGap(20, 20, 20)
                .addComponent(jButtonSalvarClienteConta, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboContaActionPerformed
        String conta = (String) jComboConta.getSelectedItem();
        if(conta.equals("Conta Investimento")){
            /*jLabelDepositoInicial.setVisible(false);
            depositoInicial.setVisible(false);
            jLabelLimite.setVisible(false);
            limite.setVisible(false);
            jLabelNumeroConta.setVisible(false);
            numeroConta.setVisible(false);*/
            jLabelClienteConta1.setText("Montante Mínimo:  R$");
            jLabelClienteConta2.setText("Depósito Mínimo:   R$");
            jLabelClienteConta3.setText("Depósito Inicial:     R$");
            inputClienteConta3.setText("0.00");
            inputClienteConta3.setEditable(true);
            inputClienteConta3.setBackground(Color.WHITE);
        }else{
            /*jLabelDepositoInicial.setVisible(true);
            depositoInicial.setVisible(true);
            jLabelLimite.setVisible(true);
            limite.setVisible(true);
            jLabelNumeroConta.setVisible(true);
            numeroConta.setVisible(true);*/
            jLabelClienteConta1.setText("Depósito Inicial:     R$");
            jLabelClienteConta2.setText("Limite:                 R$");
            jLabelClienteConta3.setText("Número da Conta: ");
            inputClienteConta3.setEditable(false);
            inputClienteConta3.setText("");
            inputClienteConta3.setBackground(Color.LIGHT_GRAY);
        }
    }//GEN-LAST:event_jComboContaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
