/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.Cliente;
import Model.carrinho;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import utils.GerenciadorConexao;

/**
 *
 * @author guilh
 */
public class carrinhoDAO {

    public static boolean Salvar(carrinho pCarrinho) {
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            String URL = "jdbc:mysql://localhost:3306/projetoPi?useTimezone=true&serverTimezone=UTC&useSSL=false";

            conexao = DriverManager.getConnection(URL, "root", "root");

            instrucaoSQL = conexao.prepareStatement("INSERT INTO carrinho (DataEmissao,nome,produto, Qtde, ValorNota, codProd) VALUES(?,?,?,?,?,?)",
                    Statement.RETURN_GENERATED_KEYS);  //Caso queira retornar o ID

            //Adiciono os parâmetros ao meu comando SQL
            instrucaoSQL.setDate(1, new java.sql.Date(pCarrinho.getDataCompra().getTime()));
            instrucaoSQL.setString(2, pCarrinho.getNome());

            instrucaoSQL.setString(3, pCarrinho.getProduto());
            instrucaoSQL.setInt(4, pCarrinho.getQtde());
            instrucaoSQL.setDouble(5, pCarrinho.getValorTotal());
            instrucaoSQL.setInt(6, pCarrinho.getCodProd());

            int linhasAfetadas = instrucaoSQL.executeUpdate();

            if (linhasAfetadas > 0) {
                retorno = true;

                ResultSet generatedKeys = instrucaoSQL.getGeneratedKeys(); //Recupero o ID do cliente
                if (generatedKeys.next()) {
                    pCarrinho.setId(generatedKeys.getInt(1));
                } else {
                    throw new SQLException("Falha ao obter o ID do Carrinho!.");
                }
            } else {
                retorno = false;
            }

        } catch (SQLException | ClassNotFoundException ex) {

            System.out.println(ex.getMessage());
            retorno = false;
        } finally {

            try {
                if (instrucaoSQL != null) {
                    instrucaoSQL.close();
                }

                GerenciadorConexao.fecharConexao();

            } catch (SQLException ex) {
            }
        }

        return retorno;
    }
    
    public static boolean atualizar(carrinho pCarrinho) {
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        try {

            conexao = GerenciadorConexao.abrirConexao();

            Class.forName("com.mysql.cj.jdbc.Driver");

            String URL = "jdbc:mysql://localhost:3306/projetoPi?useTimezone=true&serverTimezone=UTC&useSSL=false";

            conexao = DriverManager.getConnection(URL, "root", "root");

            instrucaoSQL = conexao.prepareStatement("update Produtos inner join carrinho on Produtos.codProd = ? carrinho.codProd SET Produtos.Qtde = ? Produtos.Qtde - carrinho.Qtde\n" +
"where carrinho.codProd = Produtos.codProd; ");

         instrucaoSQL.setInt(1, pCarrinho.getCodProd());
           instrucaoSQL.setInt(2, pCarrinho.getQtde());

            
           

            //Mando executar a instrução SQL
            int linhasAfetadas = instrucaoSQL.executeUpdate();

            retorno = linhasAfetadas > 0;

        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            retorno = false;
        } finally {

            //Libero os recursos da memória
            try {
                if (instrucaoSQL != null) {
                    instrucaoSQL.close();
                }

                //GerenciadorConexao.fecharConexao();
                conexao.close();

            } catch (SQLException ex) {
            }
        }

        return retorno;
    }

    public static ArrayList<carrinho> consultarCarrinho() {
        ResultSet rs = null;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        ArrayList<carrinho> listaCarrinho = new ArrayList<carrinho>();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String URL = "jdbc:mysql://localhost:3306/projetoPi?useTimezone=true&serverTimezone=UTC&useSSL=false";

            conexao = DriverManager.getConnection(URL, "root", "root");

            instrucaoSQL = conexao.prepareStatement("SELECT * FROM carrinho;");

            rs = instrucaoSQL.executeQuery();

            if (rs != null) {

                while (rs.next()) {
                    carrinho c = new carrinho();
                    c.setId(rs.getInt("IdCompra"));
                    c.setDataCompra(rs.getDate("DataEmissao"));
                    c.setNome(rs.getString("nome"));
                    c.setProduto(rs.getString("produto"));
                    c.setQtde(rs.getInt("Qtde"));
                    c.setValorTotal(rs.getDouble("ValorNota"));
                    c.setCodProd(rs.getInt("codProd"));

                    listaCarrinho.add(c);
                }
            }

        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            listaCarrinho = null;
        } finally {
            //Libero os recursos da memória
            try {
                if (rs != null) {
                    rs.close();
                }
                if (instrucaoSQL != null) {
                    instrucaoSQL.close();
                }

                GerenciadorConexao.fecharConexao();

            } catch (SQLException ex) {
            }
        }

        return listaCarrinho;
    }

    public static ArrayList<carrinho> consultarCarrinho2() {
        ResultSet rs = null;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        ArrayList<carrinho> listaCarrinho = new ArrayList<carrinho>();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String URL = "jdbc:mysql://localhost:3306/projetoPi?useTimezone=true&serverTimezone=UTC&useSSL=false";

            conexao = DriverManager.getConnection(URL, "root", "root");

            instrucaoSQL = conexao.prepareStatement("select carrinho.nome, carrinho.produto, carrinho.Qtde , Produtos.preco \n" +
"from carrinho\n" +
"inner join Produtos\n" +
"on carrinho.codProd = carrinho.codProd ;");
            
            rs = instrucaoSQL.executeQuery();

            if (rs != null) {

                while (rs.next()) {
                    carrinho c = new carrinho();
                   // c.setId(rs.getInt("IdCompra"));
                    //c.setDataCompra(rs.getDate("DataEmissao"));
                    c.setNome(rs.getString("nome"));
                    c.setProduto(rs.getString("produto"));
                    c.setQtde(rs.getInt("Qtde"));
                    c.setValorUnit(rs.getDouble("preco"));
                  
    

                    listaCarrinho.add(c);
                }
            }

        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            listaCarrinho = null;
        } finally {
            //Libero os recursos da memória
            try {
                if (rs != null) {
                    rs.close();
                }
                if (instrucaoSQL != null) {
                    instrucaoSQL.close();
                }

                GerenciadorConexao.fecharConexao();

            } catch (SQLException ex) {
            }
        }

        return listaCarrinho;
    }

}
