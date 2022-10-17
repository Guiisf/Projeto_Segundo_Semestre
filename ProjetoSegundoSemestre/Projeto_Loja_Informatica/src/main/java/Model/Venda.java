/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author guilh
 */
public class Venda {
    
    private String Cliente;
    private int CPF;
    private int codProd;
    private String Produto;
    private double preco;
    
    
    public Venda(){
        
    }

    public Venda(String Cliente, int CPF, int codProd, String Produto, double preco) {
        this.Cliente = Cliente;
        this.CPF = CPF;
        this.codProd = codProd;
        this.Produto = Produto;
        this.preco = preco;
    }

    public String getCliente() {
        return Cliente;
    }

    public void setCliente(String Cliente) {
        this.Cliente = Cliente;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public int getCodProd() {
        return codProd;
    }

    public void setCodProd(int codProd) {
        this.codProd = codProd;
    }

    public String getProduto() {
        return Produto;
    }

    public void setProduto(String Produto) {
        this.Produto = Produto;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    
}
