/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import DAO.carrinhoDAO;
import Model.Cliente;
import Model.carrinho;
import com.google.protobuf.StringValue;
import java.awt.PopupMenu;
import java.awt.event.KeyEvent;
import java.beans.PropertyVetoException;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Guilherme.Ferreira
 */
public class TelaVendas extends javax.swing.JFrame {

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
     * @return the objCarrinho
     */
    public carrinho getObjCarrinho() {
        return objCarrinho;
    }

    /**
     * @param objCarrinho the objCarrinho to set
     */
    public void setObjCarrinho(carrinho objCarrinho) {
        this.objCarrinho = objCarrinho;
    }

    /**
     * @return the btnAdd
     */
    public javax.swing.JButton getBtnAdd() {
        return btnAdd;
    }

    /**
     * @param btnAdd the btnAdd to set
     */
    public void setBtnAdd(javax.swing.JButton btnAdd) {
        this.btnAdd = btnAdd;
    }

    /**
     * @return the btnAdd1
     */
    public javax.swing.JButton getBtnAdd1() {
        return btnAdd1;
    }

    /**
     * @param btnAdd1 the btnAdd1 to set
     */
    public void setBtnAdd1(javax.swing.JButton btnAdd1) {
        this.btnAdd1 = btnAdd1;
    }

    /**
     * @return the btnBuscarCliente
     */
    public javax.swing.JButton getBtnBuscarCliente() {
        return btnBuscarCliente;
    }

    /**
     * @param btnBuscarCliente the btnBuscarCliente to set
     */
    public void setBtnBuscarCliente(javax.swing.JButton btnBuscarCliente) {
        this.btnBuscarCliente = btnBuscarCliente;
    }

    /**
     * @return the btnCadNovClie
     */
    public javax.swing.JButton getBtnCadNovClie() {
        return btnCadNovClie;
    }

    /**
     * @param btnCadNovClie the btnCadNovClie to set
     */
    public void setBtnCadNovClie(javax.swing.JButton btnCadNovClie) {
        this.btnCadNovClie = btnCadNovClie;
    }

    /**
     * @return the btnPesquisar
     */
    public javax.swing.JButton getBtnPesquisar() {
        return btnPesquisar;
    }

    /**
     * @param btnPesquisar the btnPesquisar to set
     */
    public void setBtnPesquisar(javax.swing.JButton btnPesquisar) {
        this.btnPesquisar = btnPesquisar;
    }

    /**
     * @return the jButton3
     */
    public javax.swing.JButton getjButton3() {
        return jButton3;
    }

    /**
     * @param jButton3 the jButton3 to set
     */
    public void setjButton3(javax.swing.JButton jButton3) {
        this.jButton3 = jButton3;
    }

    /**
     * @return the jDesktopPane1
     */
    public javax.swing.JDesktopPane getjDesktopPane1() {
        return jDesktopPane1;
    }

    /**
     * @param jDesktopPane1 the jDesktopPane1 to set
     */
    public void setjDesktopPane1(javax.swing.JDesktopPane jDesktopPane1) {
        this.jDesktopPane1 = jDesktopPane1;
    }

    /**
     * @return the jDesktopPane2
     */
    public javax.swing.JDesktopPane getjDesktopPane2() {
        return jDesktopPane2;
    }

    /**
     * @param jDesktopPane2 the jDesktopPane2 to set
     */
    public void setjDesktopPane2(javax.swing.JDesktopPane jDesktopPane2) {
        this.jDesktopPane2 = jDesktopPane2;
    }

    /**
     * @return the jLabel1
     */
    public javax.swing.JLabel getjLabel1() {
        return jLabel1;
    }

    /**
     * @param jLabel1 the jLabel1 to set
     */
    public void setjLabel1(javax.swing.JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    /**
     * @return the jLabel11
     */
    public javax.swing.JLabel getjLabel11() {
        return jLabel11;
    }

    /**
     * @param jLabel11 the jLabel11 to set
     */
    public void setjLabel11(javax.swing.JLabel jLabel11) {
        this.jLabel11 = jLabel11;
    }

    /**
     * @return the jLabel2
     */
    public javax.swing.JLabel getjLabel2() {
        return jLabel2;
    }

    /**
     * @param jLabel2 the jLabel2 to set
     */
    public void setjLabel2(javax.swing.JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    /**
     * @return the jLabel3
     */
    public javax.swing.JLabel getjLabel3() {
        return jLabel3;
    }

    /**
     * @param jLabel3 the jLabel3 to set
     */
    public void setjLabel3(javax.swing.JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    /**
     * @return the jLabel4
     */
    public javax.swing.JLabel getjLabel4() {
        return jLabel4;
    }

    /**
     * @param jLabel4 the jLabel4 to set
     */
    public void setjLabel4(javax.swing.JLabel jLabel4) {
        this.jLabel4 = jLabel4;
    }

    /**
     * @return the jLabel5
     */
    public javax.swing.JLabel getjLabel5() {
        return jLabel5;
    }

    /**
     * @param jLabel5 the jLabel5 to set
     */
    public void setjLabel5(javax.swing.JLabel jLabel5) {
        this.jLabel5 = jLabel5;
    }

    /**
     * @return the jLabel7
     */
    public javax.swing.JLabel getjLabel7() {
        return jLabel7;
    }

    /**
     * @param jLabel7 the jLabel7 to set
     */
    public void setjLabel7(javax.swing.JLabel jLabel7) {
        this.jLabel7 = jLabel7;
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
     * @return the jPanel2
     */
    public javax.swing.JPanel getjPanel2() {
        return jPanel2;
    }

    /**
     * @param jPanel2 the jPanel2 to set
     */
    public void setjPanel2(javax.swing.JPanel jPanel2) {
        this.jPanel2 = jPanel2;
    }

    /**
     * @return the jPanel3
     */
    public javax.swing.JPanel getjPanel3() {
        return jPanel3;
    }

    /**
     * @param jPanel3 the jPanel3 to set
     */
    public void setjPanel3(javax.swing.JPanel jPanel3) {
        this.jPanel3 = jPanel3;
    }

    /**
     * @return the jPanel4
     */
    public javax.swing.JPanel getjPanel4() {
        return jPanel4;
    }

    /**
     * @param jPanel4 the jPanel4 to set
     */
    public void setjPanel4(javax.swing.JPanel jPanel4) {
        this.jPanel4 = jPanel4;
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
     * @return the jTextField6
     */
    public javax.swing.JTextField getjTextField6() {
        return jTextField6;
    }

    /**
     * @param jTextField6 the jTextField6 to set
     */
    public void setjTextField6(javax.swing.JTextField jTextField6) {
        this.jTextField6 = jTextField6;
    }

    /**
     * @return the jdcDataCompra
     */
    public com.toedter.calendar.JDateChooser getJdcDataCompra() {
        return jdcDataCompra;
    }

    /**
     * @param jdcDataCompra the jdcDataCompra to set
     */
    public void setJdcDataCompra(com.toedter.calendar.JDateChooser jdcDataCompra) {
        this.jdcDataCompra = jdcDataCompra;
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
     * @return the lblDataInicio
     */
    public javax.swing.JLabel getLblDataInicio() {
        return lblDataInicio;
    }

    /**
     * @param lblDataInicio the lblDataInicio to set
     */
    public void setLblDataInicio(javax.swing.JLabel lblDataInicio) {
        this.lblDataInicio = lblDataInicio;
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
     * @return the lblPreco
     */
    public javax.swing.JLabel getLblPreco() {
        return lblPreco;
    }

    /**
     * @param lblPreco the lblPreco to set
     */
    public void setLblPreco(javax.swing.JLabel lblPreco) {
        this.lblPreco = lblPreco;
    }

    /**
     * @return the lblProd
     */
    public javax.swing.JLabel getLblProd() {
        return lblProd;
    }

    /**
     * @param lblProd the lblProd to set
     */
    public void setLblProd(javax.swing.JLabel lblProd) {
        this.lblProd = lblProd;
    }

    /**
     * @return the lblQtd
     */
    public javax.swing.JLabel getLblQtd() {
        return lblQtd;
    }

    /**
     * @param lblQtd the lblQtd to set
     */
    public void setLblQtd(javax.swing.JLabel lblQtd) {
        this.lblQtd = lblQtd;
    }

    /**
     * @return the lblTotal
     */
    public javax.swing.JLabel getLblTotal() {
        return lblTotal;
    }

    /**
     * @param lblTotal the lblTotal to set
     */
    public void setLblTotal(javax.swing.JLabel lblTotal) {
        this.lblTotal = lblTotal;
    }

    /**
     * @return the tblCarrinho
     */
    public javax.swing.JTable getTblCarrinho() {
        return tblCarrinho;
    }

    /**
     * @param tblCarrinho the tblCarrinho to set
     */
    public void setTblCarrinho(javax.swing.JTable tblCarrinho) {
        this.tblCarrinho = tblCarrinho;
    }

    /**
     * @return the txtClienteCarrinho
     */
    public javax.swing.JTextField getTxtClienteCarrinho() {
        return txtClienteCarrinho;
    }

    /**
     * @param txtClienteCarrinho the txtClienteCarrinho to set
     */
    public void setTxtClienteCarrinho(javax.swing.JTextField txtClienteCarrinho) {
        this.txtClienteCarrinho = txtClienteCarrinho;
    }

    /**
     * @return the txtCod
     */
    public javax.swing.JTextField getTxtCod() {
        return txtCod;
    }

    /**
     * @param txtCod the txtCod to set
     */
    public void setTxtCod(javax.swing.JTextField txtCod) {
        this.txtCod = txtCod;
    }

    /**
     * @return the txtCodCarrinho
     */
    public javax.swing.JTextField getTxtCodCarrinho() {
        return txtCodCarrinho;
    }

    /**
     * @param txtCodCarrinho the txtCodCarrinho to set
     */
    public void setTxtCodCarrinho(javax.swing.JTextField txtCodCarrinho) {
        this.txtCodCarrinho = txtCodCarrinho;
    }

    /**
     * @return the txtNome
     */
    public javax.swing.JFormattedTextField getTxtNome() {
        return txtNome;
    }

    /**
     * @param txtNome the txtNome to set
     */
    public void setTxtNome(javax.swing.JFormattedTextField txtNome) {
        this.txtNome = txtNome;
    }

    /**
     * @return the txtPreco
     */
    public javax.swing.JTextField getTxtPreco() {
        return txtPreco;
    }

    /**
     * @param txtPreco the txtPreco to set
     */
    public void setTxtPreco(javax.swing.JTextField txtPreco) {
        this.txtPreco = txtPreco;
    }

    /**
     * @return the txtProd
     */
    public javax.swing.JTextField getTxtProd() {
        return txtProd;
    }

    /**
     * @param txtProd the txtProd to set
     */
    public void setTxtProd(javax.swing.JTextField txtProd) {
        this.txtProd = txtProd;
    }

    /**
     * @return the txtProdCarrinho
     */
    public javax.swing.JTextField getTxtProdCarrinho() {
        return txtProdCarrinho;
    }

    /**
     * @param txtProdCarrinho the txtProdCarrinho to set
     */
    public void setTxtProdCarrinho(javax.swing.JTextField txtProdCarrinho) {
        this.txtProdCarrinho = txtProdCarrinho;
    }

    /**
     * @return the txtQtd
     */
    public javax.swing.JTextField getTxtQtd() {
        return txtQtd;
    }

    /**
     * @param txtQtd the txtQtd to set
     */
    public void setTxtQtd(javax.swing.JTextField txtQtd) {
        this.txtQtd = txtQtd;
    }

    /**
     * @return the txtQtdeCarrinho
     */
    public javax.swing.JTextField getTxtQtdeCarrinho() {
        return txtQtdeCarrinho;
    }

    /**
     * @param txtQtdeCarrinho the txtQtdeCarrinho to set
     */
    public void setTxtQtdeCarrinho(javax.swing.JTextField txtQtdeCarrinho) {
        this.txtQtdeCarrinho = txtQtdeCarrinho;
    }

    /**
     * @return the txtTotal
     */
    public javax.swing.JTextField getTxtTotal() {
        return txtTotal;
    }

    /**
     * @param txtTotal the txtTotal to set
     */
    public void setTxtTotal(javax.swing.JTextField txtTotal) {
        this.txtTotal = txtTotal;
    }

    private String modoTela = "Criação";
    private carrinho objCarrinho;

    /**
     * Creates new form TelaVendas
     */
    public TelaVendas() {
        initComponents();

        objCarrinho = new carrinho();

        setLocationRelativeTo(null);

    }

    public TelaVendas(carrinho c) {
        initComponents();
        this.objCarrinho = c;

        setLocationRelativeTo(null);
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
        btnCadNovClie = new javax.swing.JButton();
        txtNome = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        btnBuscarCliente = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel2 = new javax.swing.JPanel();
        lblCod = new javax.swing.JLabel();
        lblProd = new javax.swing.JLabel();
        lblPreco = new javax.swing.JLabel();
        txtCod = new javax.swing.JTextField();
        txtProd = new javax.swing.JTextField();
        txtPreco = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        lblQtd = new javax.swing.JLabel();
        txtQtd = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCarrinho = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtClienteCarrinho = new javax.swing.JTextField();
        txtCodCarrinho = new javax.swing.JTextField();
        txtProdCarrinho = new javax.swing.JTextField();
        txtQtdeCarrinho = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        lblTotal = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        btnAdd1 = new javax.swing.JButton();
        lblDataInicio = new javax.swing.JLabel();
        jdcDataCompra = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Vendas");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Cliente"));

        btnCadNovClie.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCadNovClie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/user_add.png"))); // NOI18N
        btnCadNovClie.setText("Cadastrar novo cliente");
        btnCadNovClie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadNovClieActionPerformed(evt);
            }
        });

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Nome");

        btnBuscarCliente.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBuscarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zoom.png"))); // NOI18N
        btnBuscarCliente.setText("Buscar Cliente");
        btnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 131, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(75, 75, 75)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(btnCadNovClie)
                            .addComponent(btnBuscarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jDesktopPane1)))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnBuscarCliente, btnCadNovClie, txtNome});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBuscarCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCadNovClie)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnBuscarCliente, btnCadNovClie, txtNome});

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Produto"));

        lblCod.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCod.setText("Codigo:");

        lblProd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblProd.setText("Produto:");

        lblPreco.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblPreco.setText("Preço:");

        txtCod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodKeyTyped(evt);
            }
        });

        btnPesquisar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zoom.png"))); // NOI18N
        btnPesquisar.setText("Buscar Produto");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        lblQtd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblQtd.setText("Qtd:");

        btnAdd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/shop-cart-icon.png"))); // NOI18N
        btnAdd.setText("Adicionar ao carrinho");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jDesktopPane2)
                .addGap(6, 6, 6))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblQtd)
                            .addComponent(lblCod))
                        .addGap(143, 143, 143)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.CENTER, jPanel2Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblProd)
                            .addComponent(lblPreco))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtProd))))
                .addGap(45, 45, 45))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAdd, btnPesquisar, txtCod, txtPreco, txtProd, txtQtd});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCod)
                    .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProd)
                    .addComponent(txtProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblQtd)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblPreco)
                        .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btnPesquisar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAdd)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAdd, btnPesquisar, txtCod, txtPreco, txtProd, txtQtd});

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Carrinho"));

        tblCarrinho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cliente", "Codigo", "Produto", "Qtd", "Preço", "Subtotal"
            }
        ));
        jScrollPane1.setViewportView(tblCarrinho);

        jLabel2.setText("CLiente");

        jLabel3.setText("Codigo");

        jLabel4.setText("Produto");

        jLabel5.setText("Quantidade");

        jLabel7.setText("Total");

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtClienteCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtProdCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtQtdeCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtClienteCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCodCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtProdCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtQtdeCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Total da Venda"));

        lblTotal.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTotal.setText("Total da Venda");

        txtTotal.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jButton3.setText("Cancelar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        btnAdd1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btnAdd1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/payment-icon.png"))); // NOI18N
        btnAdd1.setText("Pagar");
        btnAdd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTotal)
                .addGap(18, 18, 18)
                .addComponent(txtTotal)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                    .addComponent(btnAdd1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(148, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotal)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAdd1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(23, 23, 23))
        );

        lblDataInicio.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblDataInicio.setText("Data da Compra");

        jdcDataCompra.setDateFormatString("dd/MM/yyyy");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Codigo da Venda");

        lblID.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblID.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel11)
                            .addGap(18, 18, 18)
                            .addComponent(lblID))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblDataInicio)
                            .addGap(18, 18, 18)
                            .addComponent(jdcDataCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(lblID))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblDataInicio)
                            .addComponent(jdcDataCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

        String Nome = getTxtNome().getText();
        int codProd = Integer.parseInt(getTxtCod().getText());
        String dscProduto = getTxtProd().getText();
        int qtd = Integer.parseInt(getTxtQtd().getText());
        double preco = Double.parseDouble(getTxtPreco().getText());
        double soma = qtd * preco;

        DefaultTableModel modelo = (DefaultTableModel) getTblCarrinho().getModel();
        modelo.addRow(new String[]{Nome, String.valueOf(codProd), dscProduto, String.valueOf(qtd), String.valueOf(preco), String.valueOf(soma)});

        getTxtClienteCarrinho().setText(Nome);
        String codprod = String.valueOf(codProd);
        getTxtCodCarrinho().setText(codprod);
        getTxtProdCarrinho().setText(dscProduto);
        String QTDE = String.valueOf(qtd);

        getTxtQtdeCarrinho().setText(QTDE);
        String Total = String.valueOf(soma);
        getjTextField6().setText(Total);

        String valorTotal = String.valueOf(soma);
        getTxtTotal().setText(valorTotal);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnAdd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd1ActionPerformed

        if (getModoTela() == "Criação") {

            //TODO: implementar verificação de obrigatoriedade
            Date dataCompra = getJdcDataCompra().getDate();
            //     int IdCompra = Integer.parseInt(lblID.getText());
            String nome = getTxtClienteCarrinho().getText();
            int codProd = Integer.parseInt(getTxtCodCarrinho().getText());
            String produto = getTxtProdCarrinho().getText();
            int Qtde = Integer.parseInt(getTxtQtdeCarrinho().getText());
            double ValorNota = Double.parseDouble(getjTextField6().getText());
            //Passo as informações para o objeto cliente (propriedade deste JFrame)

            getObjCarrinho().setDataCompra(dataCompra);
            // objCarrinho.setId(IdCompra);
            getObjCarrinho().setNome(nome);
            getObjCarrinho().setCodProd(codProd);
            getObjCarrinho().setProduto(produto);
            getObjCarrinho().setQtde(Qtde);
            getObjCarrinho().setValorTotal(ValorNota);

            //Mando salvar no banco de dados usando a classe DAO
            try {
                carrinhoDAO.Salvar(getObjCarrinho());
                carrinhoDAO.atualizar(getObjCarrinho());

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Falha ao gravar no banco de dados\n" + e.getMessage(),
                        "Aviso de Falha", JOptionPane.ERROR_MESSAGE);
            }

        }
        JOptionPane.showMessageDialog(null, "Produto Pago com sucesso");
        JOptionPane.showMessageDialog(null, "Obrigado por comprar na InfoHub, Volte Sempre");


    }//GEN-LAST:event_btnAdd1ActionPerformed

    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed
        BuscaClientes mostrarInicio = new BuscaClientes();
        getjDesktopPane1().add(mostrarInicio);
        mostrarInicio.show();
        try {
            mostrarInicio.setMaximum(true);
        } catch (PropertyVetoException ex) {
        }
    }//GEN-LAST:event_btnBuscarClienteActionPerformed

    private void txtCodKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodKeyTyped
        char c = evt.getKeyChar();
        if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
            this.getTxtCod().setText("Somente números");
        }
    }//GEN-LAST:event_txtCodKeyTyped

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        BuscaProdutos mostrarInicio = new BuscaProdutos();
        getjDesktopPane2().add(mostrarInicio);
        mostrarInicio.show();
        try {
            mostrarInicio.setMaximum(true);
        } catch (PropertyVetoException ex) {
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed

    }//GEN-LAST:event_txtNomeActionPerformed

    private void btnCadNovClieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadNovClieActionPerformed
        new TelaCadastroCliente().setVisible(true);
    }//GEN-LAST:event_btnCadNovClieActionPerformed

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        int qtd = Integer.parseInt(getTxtQtd().getText());
        double preco = Double.parseDouble(getTxtPreco().getText());
        double soma = qtd * preco;

        String.valueOf(soma);
    }//GEN-LAST:event_txtTotalActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaVendas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAdd1;
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnCadNovClie;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton jButton3;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField6;
    private com.toedter.calendar.JDateChooser jdcDataCompra;
    private javax.swing.JLabel lblCod;
    private javax.swing.JLabel lblDataInicio;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblPreco;
    private javax.swing.JLabel lblProd;
    private javax.swing.JLabel lblQtd;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTable tblCarrinho;
    private javax.swing.JTextField txtClienteCarrinho;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtCodCarrinho;
    private javax.swing.JFormattedTextField txtNome;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextField txtProd;
    private javax.swing.JTextField txtProdCarrinho;
    private javax.swing.JTextField txtQtd;
    private javax.swing.JTextField txtQtdeCarrinho;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
