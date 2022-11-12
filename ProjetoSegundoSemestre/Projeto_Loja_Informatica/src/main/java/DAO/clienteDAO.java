
package DAO;

import Model.Cliente;


import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import utils.GerenciadorConexao;

/**
 *
 * @author guilh
 */
public class clienteDAO {

    public static boolean Salvar(Cliente pCliente) {
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        try {

          
            Class.forName("com.mysql.cj.jdbc.Driver");

        
            String URL = "jdbc:mysql://localhost:3306/projetoPi?useTimezone=true&serverTimezone=UTC&useSSL=false";

            conexao = DriverManager.getConnection(URL, "root", "root");

            instrucaoSQL = conexao.prepareStatement("INSERT INTO Clientes (id, nome, cpf, dataDeNascimento, sexo, estadoCivil, rua, cidade, estado, cep, cttTelefone,  cttCelular,email ) VALUES(?,?,?,?,?,?,?,?,?,?,?,?)",
                    Statement.RETURN_GENERATED_KEYS);

            instrucaoSQL.setInt(0, pCliente.getId());
            instrucaoSQL.setString(1, pCliente.getNome());
           instrucaoSQL.setString(2, pCliente.getCpf());
            instrucaoSQL.setDate(3, (Date) pCliente.getData_Nascimento());
            instrucaoSQL.setString(4, pCliente.getEstado_civil());
            instrucaoSQL.setString(5, pCliente.getRua());
            instrucaoSQL.setString(6, pCliente.getCidade());
            instrucaoSQL.setString(7, pCliente.getEstado());
            instrucaoSQL.setString(8, pCliente.getCep());
            instrucaoSQL.setString(9, pCliente.getTelefone());
            instrucaoSQL.setString(10, pCliente.getCelular());
            instrucaoSQL.setString(11, pCliente.getEmail());
            
          

            int linhasAfetadas = instrucaoSQL.executeUpdate();

            if (linhasAfetadas > 0) {
                retorno = true;

                ResultSet generatedKeys = instrucaoSQL.getGeneratedKeys();
                if (generatedKeys.next()) {
                  // pCliente.setCodigo(generatedKeys.getInt(1));
                } else {
                    throw new SQLException("Falha ao obter o Codigo do Produto.");
                }
            } else {
                retorno = false;
            }

        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            retorno = false;
        } finally {

            //Libero os recursos da memória
            try {
                if (instrucaoSQL != null) {
                    instrucaoSQL.close();
                }

//                GerenciadorConexao.fecharConexao();
                conexao.close();

            } catch (SQLException ex) {
            }
        }

        return retorno;
    }

   

}
