/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

/**
 *
 * @author guilh
 */
public class Produto { 
    
    private String Descricao;
    private int qtde;
    private double preco;
    private int codigo;
    
    public Produto(){
    
}

    public Produto(String Descricao, int qtde, double preco, int codigo) {
        this.Descricao = Descricao;
        this.qtde = qtde;
        this.preco = preco;
        this.codigo = codigo;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
   
}
