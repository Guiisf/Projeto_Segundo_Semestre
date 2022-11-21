/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import DAO.produtosDAO;
import Model.Produto;
import static java.awt.Color.yellow;
import java.awt.event.KeyEvent;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author guilh
 */
public class TelaCadastroProduto extends javax.swing.JFrame {

    /**
     * @return the modoTela
     */
    public String getModoTela() {
        return modoTela;
    }

    /**
     * @param modoTela the modoTela to set
     */
    public void setModoTela(String modoTela) {
        this.modoTela = modoTela;
    }

    /**
     * @return the objProduto
     */
    public Produto getObjProduto() {
        return objProduto;
    }

    /**
     * @param objProduto the objProduto to set
     */
    public void setObjProduto(Produto objProduto) {
        this.objProduto = objProduto;
    }

    /**
     * @return the btnAdicionar
     */
    public javax.swing.JButton getBtnAdicionar() {
        return btnAdicionar;
    }

    /**
     * @param btnAdicionar the btnAdicionar to set
     */
    public void setBtnAdicionar(javax.swing.JButton btnAdicionar) {
        this.btnAdicionar = btnAdicionar;
    }

    /**
     * @return the btnSalvar
     */
    public javax.swing.JButton getBtnSalvar() {
        return btnSalvar;
    }

    /**
     * @param btnSalvar the btnSalvar to set
     */
    public void setBtnSalvar(javax.swing.JButton btnSalvar) {
        this.btnSalvar = btnSalvar;
    }

    /**
     * @return the jPanel1
     */
    public javax.swing.JPanel getjPanel1() {
        return jPanel1;
    }

    /**
     * @param jPanel1 the jPanel1 to set
     */
    public void setjPanel1(javax.swing.JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    /**
     * @return the jScrollPane1
     */
    public javax.swing.JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    /**
     * @param jScrollPane1 the jScrollPane1 to set
     */
    public void setjScrollPane1(javax.swing.JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    /**
     * @return the jTable1
     */
    public javax.swing.JTable getjTable1() {
        return jTable1;
    }

    /**
     * @param jTable1 the jTable1 to set
     */
    public void setjTable1(javax.swing.JTable jTable1) {
        this.jTable1 = jTable1;
    }

    /**
     * @return the lblCod
     */
    public javax.swing.JLabel getLblCod() {
        return lblCod;
    }

    /**
     * @param lblCod the lblCod to set
     */
    public void setLblCod(javax.swing.JLabel lblCod) {
        this.lblCod = lblCod;
    }

    /**
     * @return the lblDesc
     */
    public javax.swing.JLabel getLblDesc() {
        return lblDesc;
    }

    /**
     * @param lblDesc the lblDesc to set
     */
    public void setLblDesc(javax.swing.JLabel lblDesc) {
        this.lblDesc = lblDesc;
    }

    /**
     * @return the lblID
     */
    public javax.swing.JLabel getLblID() {
        return lblID;
    }

    /**
     * @param lblID the lblID to set
     */
    public void setLblID(javax.swing.JLabel lblID) {
        this.lblID = lblID;
    }

    /**
     * @return the lblQuant
     */
    public javax.swing.JLabel getLblQuant() {
        return lblQuant;
    }

    /**
     * @param lblQuant the lblQuant to set
     */
    public void setLblQuant(javax.swing.JLabel lblQuant) {
        this.lblQuant = lblQuant;
    }

    /**
     * @return the lblValor
     */
    public javax.swing.JLabel getLblValor() {
        return lblValor;
    }

    /**
     * @param lblValor the lblValor to set
     */
    public void setLblValor(javax.swing.JLabel lblValor) {
        this.lblValor = lblValor;
    }

    /**
     * @return the txtDesc
     */
    public javax.swing.JTextField getTxtDesc() {
        return txtDesc;
    }

    /**
     * @param txtDesc the txtDesc to set
     */
    public void setTxtDesc(javax.swing.JTextField txtDesc) {
        this.txtDesc = txtDesc;
    }

    /**
     * @return the txtQuant
     */
    public javax.swing.JTextField getTxtQuant() {
        return txtQuant;
    }

    /**
     * @param txtQuant the txtQuant to set
     */
    public void setTxtQuant(javax.swing.JTextField txtQuant) {
        this.txtQuant = txtQuant;
    }

    /**
     * @return the txtValor
     */
    public javax.swing.JTextField getTxtValor() {
        return txtValor;
    }

    /**
     * @param txtValor the txtValor to set
     */
    public void setTxtValor(javax.swing.JTextField txtValor) {
        this.txtValor = txtValor;
    }

    private String modoTela = "Cadastro";
    private Produto objProduto;

    /**
     * Creates new form CadastrarCliente
     */
    public TelaCadastroProduto() {

        initComponents();
        objProduto = new Produto();

        setLocationRelativeTo(null);
    }

    public TelaCadastroProduto(Produto prod) {
        initComponents();
        this.objProduto = prod;

        this.txtDesc.setText(prod.getDescricao());

        this.txtQuant.setText(String.valueOf(prod.getQtde()));
        this.txtValor.setText(String.valueOf(prod.getPreco()));

        setLocationRelativeTo(null);
    }

    /**
     * Creates new form TelaCadastroProduto
     */
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblCod = new javax.swing.JLabel();
        lblDesc = new javax.swing.JLabel();
        lblValor = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        txtValor = new javax.swing.JTextField();
        txtQuant = new javax.swing.JTextField();
        lblQuant = new javax.swing.JLabel();
        txtDesc = new javax.swing.JTextField();
        btnAdicionar = new javax.swing.JButton();
        lblID = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de produto");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro de Produto", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        lblCod.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCod.setText("Codigo:");

        lblDesc.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblDesc.setText("Descrição:");

        lblValor.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblValor.setText("Valor:");

        btnSalvar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Actions-document-save-icon (1).png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        txtValor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValorKeyTyped(evt);
            }
        });

        txtQuant.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtQuantKeyTyped(evt);
            }
        });

        lblQuant.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblQuant.setText("Quantidade:");

        txtDesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescActionPerformed(evt);
            }
        });

        btnAdicionar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/system-database-add-icon.png"))); // NOI18N
        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        lblID.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblID.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDesc)
                            .addComponent(lblQuant)
                            .addComponent(lblValor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAdicionar, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                            .addComponent(txtDesc)
                            .addComponent(txtQuant)
                            .addComponent(txtValor)
                            .addComponent(btnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblCod)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblID, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCod)
                    .addComponent(lblID))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDesc))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQuant)
                    .addComponent(txtQuant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValor)
                    .addComponent(txtValor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAdicionar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalvar)
                .addGap(20, 20, 20))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Descrição", "Quantidade", "Valor Unit", "Valor Total"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (getModoTela() == "Criação") {

            int codProd = Integer.parseInt(getLblID().getText());
            String descricao = getTxtDesc().getText();
            int quantidade = Integer.parseInt(getTxtQuant().getText());
            double valor = Double.parseDouble(getTxtValor().getText());

            getObjProduto().setDescricao(descricao);
            getObjProduto().setQtde(quantidade);
            getObjProduto().setPreco(valor);

            try {
                produtosDAO.Salvar(getObjProduto());
                JOptionPane.showMessageDialog(this, "Produto cadastrado com sucesso!", "Produto Cadastrado", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Falha ao gravar no banco de dados\n" + e.getMessage(),
                        "Aviso de Falha", JOptionPane.ERROR_MESSAGE);
            }

        } else {
            int codProd = Integer.parseInt(getLblID().getText());
            String descricao = getTxtDesc().getText();
            int quantidade = Integer.parseInt(getTxtQuant().getText());
            double valor = Double.parseDouble(getTxtValor().getText());

            getObjProduto().setDescricao(descricao);
            getObjProduto().setQtde(quantidade);
            getObjProduto().setPreco(valor);

            //Mando salvar no banco de dados usando a classe DAO
            try {
                boolean retorno = produtosDAO.Salvar(getObjProduto());

                JOptionPane.showMessageDialog(this, "Produto Cadastrado com sucesso!", "Produto Cadastrado", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Falha ao gravar no banco de dados\n" + e.getMessage(),
                        "Aviso de Falha", JOptionPane.ERROR_MESSAGE);
            }

        }

    }//GEN-LAST:event_btnSalvarActionPerformed

    private void txtQuantKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQuantKeyTyped
        char c = evt.getKeyChar();
        if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
            this.getTxtQuant().setText("Somente números");
        }
    }//GEN-LAST:event_txtQuantKeyTyped

    private void txtValorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorKeyTyped
        char c = evt.getKeyChar();
        if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
            this.getTxtValor().setText("Somente números");
        }
    }//GEN-LAST:event_txtValorKeyTyped

    private void txtDescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescActionPerformed
        if (!(Pattern.matches("^[a-zA-Z]+$", txtDesc.getText()))) {
            JOptionPane.showMessageDialog(null, "Digite apenas letras", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtDescActionPerformed

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed

        int codProd = Integer.parseInt(getLblID().getText());
        String dscProduto = getTxtDesc().getText();
        int qtd = Integer.parseInt(getTxtQuant().getText());
        double preco =  Double.parseDouble(getTxtValor().getText());
        double soma = qtd * preco;

        DefaultTableModel modelo = (DefaultTableModel) getjTable1().getModel();
        modelo.addRow(new String[]{String.valueOf(codProd),dscProduto, String.valueOf(qtd), String.valueOf(preco), String.valueOf(soma)});
    }//GEN-LAST:event_btnAdicionarActionPerformed
    private void txtIDKeyTyped(java.awt.event.KeyEvent evt) {

        char c = evt.getKeyChar();
        if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
            this.getLblCod().setText("Somente números no ID!");
        }
    }

    private void txtDescricaoKeyReleased(java.awt.event.KeyEvent evt) {
        if (!txtQuant.getText().trim().equals("")) {
            getTxtQuant().setText(this.getTxtQuant().getText().toUpperCase());
        }
    }

    private void txtDescricaoKeyTyped(java.awt.event.KeyEvent evt) {
        if (getTxtQuant().getText().length() >= 10) {
            evt.consume();
            getLblCod().setText("Maximo de 10 caracteres atigido!");
        }

        if (evt.getKeyChar() == '\'' || evt.getKeyChar() == '@') {
            evt.consume();
            getLblCod().setText(("Não é permitido apostrope"));
        }
    }

    private void txtIDFocusGained(java.awt.event.FocusEvent evt) {
        getLblID().setBackground(yellow);
    }

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
            java.util.logging.Logger.getLogger(TelaCadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblCod;
    private javax.swing.JLabel lblDesc;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblQuant;
    private javax.swing.JLabel lblValor;
    private javax.swing.JTextField txtDesc;
    private javax.swing.JTextField txtQuant;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
