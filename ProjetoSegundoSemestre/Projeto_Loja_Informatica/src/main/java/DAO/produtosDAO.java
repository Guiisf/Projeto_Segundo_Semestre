/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DAO.produtosDAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import Model.Produto;

/**
 *
 * @author guilh
 */
public class produtosDAO {

    public static String url = "jdbc:mysql://localhost:3306/ProjetoPI";
    public static String login = "root";
    public static String senha = "root";

    public static boolean salvar(Produto objProduto) {

        boolean retorno = false;
        Connection conexao = null;

        try {
            //1) Carregar o driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //2) Abrir a conexao
            conexao = DriverManager.getConnection(url, login, senha);

            //3) Criar objeto de conexão
            PreparedStatement comandoSQL = conexao.prepareStatement("INSERT INTO Produtos (nome_prod, descr_prod, valor) VALUES(?,?)",
                     Statement.RETURN_GENERATED_KEYS);
            comandoSQL.setInt(1, Integer.parseInt(objProduto.getDescricao()));
            comandoSQL.setDouble(2, objProduto.getPreco());

            //4) Executar o comando SQL
            int numeroLinhas = comandoSQL.executeUpdate();
            if (numeroLinhas > 0) {
                retorno = true;

                //Resgatar o ID
                ResultSet rs = comandoSQL.getGeneratedKeys();
                if (rs != null) {
                    if (rs.next()) {
                        objProduto.setCodigo(rs.getInt(1));
                    }
                }

            }

        } catch (ClassNotFoundException ex) {
            retorno = false;
        } catch (SQLException ex) {
            retorno = false;
        }

        return retorno;
    }
}
