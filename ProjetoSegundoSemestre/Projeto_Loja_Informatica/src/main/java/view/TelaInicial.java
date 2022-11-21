package view;

/**
 *
 * @author Guilherme.Ferreira
 */
public class TelaInicial extends javax.swing.JFrame {

    /**
     * @return the jButton1
     */
    public javax.swing.JButton getjButton1() {
        return jButton1;
    }

    /**
     * @param jButton1 the jButton1 to set
     */
    public void setjButton1(javax.swing.JButton jButton1) {
        this.jButton1 = jButton1;
    }

    /**
     * @return the jMenu1
     */
    public javax.swing.JMenu getjMenu1() {
        return jMenu1;
    }

    /**
     * @param jMenu1 the jMenu1 to set
     */
    public void setjMenu1(javax.swing.JMenu jMenu1) {
        this.jMenu1 = jMenu1;
    }

    /**
     * @return the jMenuBar1
     */
    public javax.swing.JMenuBar getjMenuBar1() {
        return jMenuBar1;
    }

    /**
     * @param jMenuBar1 the jMenuBar1 to set
     */
    public void setjMenuBar1(javax.swing.JMenuBar jMenuBar1) {
        this.jMenuBar1 = jMenuBar1;
    }

    /**
     * @return the jMenuItem2
     */
    public javax.swing.JMenuItem getjMenuItem2() {
        return jMenuItem2;
    }

    /**
     * @param jMenuItem2 the jMenuItem2 to set
     */
    public void setjMenuItem2(javax.swing.JMenuItem jMenuItem2) {
        this.jMenuItem2 = jMenuItem2;
    }

    /**
     * @return the jmArquivo
     */
    public javax.swing.JMenu getJmArquivo() {
        return jmArquivo;
    }

    /**
     * @param jmArquivo the jmArquivo to set
     */
    public void setJmArquivo(javax.swing.JMenu jmArquivo) {
        this.jmArquivo = jmArquivo;
    }

    /**
     * @return the jmClientes
     */
    public javax.swing.JMenu getJmClientes() {
        return jmClientes;
    }

    /**
     * @param jmClientes the jmClientes to set
     */
    public void setJmClientes(javax.swing.JMenu jmClientes) {
        this.jmClientes = jmClientes;
    }

    /**
     * @return the jmProdutos
     */
    public javax.swing.JMenu getJmProdutos() {
        return jmProdutos;
    }

    /**
     * @param jmProdutos the jmProdutos to set
     */
    public void setJmProdutos(javax.swing.JMenu jmProdutos) {
        this.jmProdutos = jmProdutos;
    }

    /**
     * @return the jmiCadProd
     */
    public javax.swing.JMenuItem getJmiCadProd() {
        return jmiCadProd;
    }

    /**
     * @param jmiCadProd the jmiCadProd to set
     */
    public void setJmiCadProd(javax.swing.JMenuItem jmiCadProd) {
        this.jmiCadProd = jmiCadProd;
    }

    /**
     * @return the jmiCadastrar
     */
    public javax.swing.JMenuItem getJmiCadastrar() {
        return jmiCadastrar;
    }

    /**
     * @param jmiCadastrar the jmiCadastrar to set
     */
    public void setJmiCadastrar(javax.swing.JMenuItem jmiCadastrar) {
        this.jmiCadastrar = jmiCadastrar;
    }

    /**
     * @return the jmiConsuProd
     */
    public javax.swing.JMenuItem getJmiConsuProd() {
        return jmiConsuProd;
    }

    /**
     * @param jmiConsuProd the jmiConsuProd to set
     */
    public void setJmiConsuProd(javax.swing.JMenuItem jmiConsuProd) {
        this.jmiConsuProd = jmiConsuProd;
    }

    /**
     * @return the jmiPesq
     */
    public javax.swing.JMenuItem getJmiPesq() {
        return jmiPesq;
    }

    /**
     * @param jmiPesq the jmiPesq to set
     */
    public void setJmiPesq(javax.swing.JMenuItem jmiPesq) {
        this.jmiPesq = jmiPesq;
    }

    /**
     * @return the jmiSair
     */
    public javax.swing.JMenuItem getJmiSair() {
        return jmiSair;
    }

    /**
     * @param jmiSair the jmiSair to set
     */
    public void setJmiSair(javax.swing.JMenuItem jmiSair) {
        this.jmiSair = jmiSair;
    }

    /**
     * Creates new form TelaInicial
     */
    public TelaInicial() {

        initComponents();
        //this.setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmArquivo = new javax.swing.JMenu();
        jmiSair = new javax.swing.JMenuItem();
        jmClientes = new javax.swing.JMenu();
        jmiCadastrar = new javax.swing.JMenuItem();
        jmiPesq = new javax.swing.JMenuItem();
        jmProdutos = new javax.swing.JMenu();
        jmiCadProd = new javax.swing.JMenuItem();
        jmiConsuProd = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela Inicial");
        setSize(new java.awt.Dimension(0, 0));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add-item-icon.png"))); // NOI18N
        jButton1.setText("Vender");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jmArquivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/archive-icon.png"))); // NOI18N
        jmArquivo.setText("Arquivo");

        jmiSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Windows-Close-Program-icon.png"))); // NOI18N
        jmiSair.setText("Sair");
        jmiSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSairActionPerformed(evt);
            }
        });
        jmArquivo.add(jmiSair);

        jMenuBar1.add(jmArquivo);

        jmClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/group.png"))); // NOI18N
        jmClientes.setText("Clientes");

        jmiCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/user_add.png"))); // NOI18N
        jmiCadastrar.setText("Cadastrar");
        jmiCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCadastrarActionPerformed(evt);
            }
        });
        jmClientes.add(jmiCadastrar);

        jmiPesq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/user_edit.png"))); // NOI18N
        jmiPesq.setText("Consulta");
        jmiPesq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiPesqActionPerformed(evt);
            }
        });
        jmClientes.add(jmiPesq);

        jMenuBar1.add(jmClientes);

        jmProdutos.setText("Produtos");

        jmiCadProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Add-item-icon (1).png"))); // NOI18N
        jmiCadProd.setText("Cadastrar Produto");
        jmiCadProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCadProdActionPerformed(evt);
            }
        });
        jmProdutos.add(jmiCadProd);

        jmiConsuProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Zoom-In-icon.png"))); // NOI18N
        jmiConsuProd.setText("Consultar Produto");
        jmiConsuProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiConsuProdActionPerformed(evt);
            }
        });
        jmProdutos.add(jmiConsuProd);

        jMenuBar1.add(jmProdutos);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/information.png"))); // NOI18N
        jMenu1.setText("Relatorios");

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/page.png"))); // NOI18N
        jMenuItem2.setText("Sinterico");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jButton1)
                .addContainerGap(100, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jButton1)
                .addContainerGap(103, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCadastrarActionPerformed
        new TelaCadastroCliente().setVisible(true);
    }//GEN-LAST:event_jmiCadastrarActionPerformed

    private void jmiCadProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCadProdActionPerformed
        new TelaCadastroProduto().setVisible(true);
    }//GEN-LAST:event_jmiCadProdActionPerformed

    private void jmiPesqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiPesqActionPerformed
        new TelaConsultaCliente().setVisible(true);
    }//GEN-LAST:event_jmiPesqActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new TelaVendas().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        new TelaRelSintetico().setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jmiConsuProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiConsuProdActionPerformed
        new TelaConsultaProd().setVisible(true);
    }//GEN-LAST:event_jmiConsuProdActionPerformed

    private void jmiSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jmiSairActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenu jmArquivo;
    private javax.swing.JMenu jmClientes;
    private javax.swing.JMenu jmProdutos;
    private javax.swing.JMenuItem jmiCadProd;
    private javax.swing.JMenuItem jmiCadastrar;
    private javax.swing.JMenuItem jmiConsuProd;
    private javax.swing.JMenuItem jmiPesq;
    private javax.swing.JMenuItem jmiSair;
    // End of variables declaration//GEN-END:variables
}
