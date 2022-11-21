package Model;

import java.util.Date;

/**
 *
 * @author Guilherme Ferreira
 */
public class carrinho {

    private Date DataCompra;
    private int id;
    private String nome;
    private int codProd;
    private String produto;
    private int qtde;
    private double valorTotal;
    private double valorUnit;

    public double getValorUnit() {
        return valorUnit;
    }

    public void setValorUnit(double valorUnit) {
        this.valorUnit = valorUnit;
    }

    public carrinho(Date DataCompra, int id, String nome, int codProd, String produto, int qtde, double valorTotal, double valorUnit) {
        this.DataCompra = DataCompra;
        this.id = id;
        this.nome = nome;
        this.codProd = codProd;
        this.produto = produto;
        this.qtde = qtde;
        this.valorTotal = valorTotal;
        this.valorUnit = valorUnit;
    }

    public Date getDataCompra() {
        return DataCompra;
    }

    public void setDataCompra(Date DataCompra) {
        this.DataCompra = DataCompra;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodProd() {
        return codProd;
    }

    public void setCodProd(int codProd) {
        this.codProd = codProd;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public carrinho(Date DataCompra, int id, String nome, int codProd, String produto, int qtde, double valorTotal) {
        this.DataCompra = DataCompra;
        this.id = id;
        this.nome = nome;
        this.codProd = codProd;
        this.produto = produto;
        this.qtde = qtde;

        this.valorTotal = valorTotal;
    }

    public carrinho() {
    }

}
