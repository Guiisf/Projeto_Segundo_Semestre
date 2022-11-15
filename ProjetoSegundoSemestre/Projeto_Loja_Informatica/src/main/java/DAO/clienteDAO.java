package DAO;

import Model.Cliente;
import Model.Produto;

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

            instrucaoSQL = conexao.prepareStatement("INSERT INTO  Clientes (nome,CPF, DataNascimento, sexo, estadoCivil, rua,cidade, estado, cep, cttTelefone, cttCelular, email) VALUES(?,?, ?,?,?,?,?,?,?, ?, ?, ?)",
                    Statement.RETURN_GENERATED_KEYS);

            //   instrucaoSQL.setInt(0, pCliente.getId());
            instrucaoSQL.setString(1, pCliente.getNome());
            instrucaoSQL.setString(2, pCliente.getCPFSomenteNumeros());
             instrucaoSQL.setDate(3, new java.sql.Date(pCliente.getData_Nascimento().getTime()));
            instrucaoSQL.setString(4, pCliente.getSexo());
            instrucaoSQL.setString(5, pCliente.getEstado_civil());
            instrucaoSQL.setString(6, pCliente.getRua());
            instrucaoSQL.setString(7, pCliente.getCidade());
            instrucaoSQL.setString(8, pCliente.getEstado());
            instrucaoSQL.setString(9, pCliente.getCep());
            instrucaoSQL.setString(10, pCliente.getTelefone());
            instrucaoSQL.setString(11, pCliente.getCelular());
            instrucaoSQL.setString(12, pCliente.getEmail());

            int linhasAfetadas = instrucaoSQL.executeUpdate();

            if (linhasAfetadas > 0) {
                retorno = true;

                ResultSet generatedKeys = instrucaoSQL.getGeneratedKeys();
                if (generatedKeys.next()) {
                    pCliente.setId(generatedKeys.getInt(1));
                } else {
                    throw new SQLException("Falha ao obter o ID do cliente.");
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

    public static boolean atualizar(Cliente pCliente) {
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        try {

            conexao = GerenciadorConexao.abrirConexao();

            Class.forName("com.mysql.cj.jdbc.Driver");

            String URL = "jdbc:mysql://localhost:3306/projetoPi?useTimezone=true&serverTimezone=UTC&useSSL=false";

            conexao = DriverManager.getConnection(URL, "root", "root");

            instrucaoSQL = conexao.prepareStatement("UPDATE Clientes SET nome =?, CPF=?, DataNascimento=?,  estadoCivil=?, sexo=?, rua=?, cidade=?, estado=?, cep=?, cttTelefone=?, cttCelular=?, email=?  WHERE idCliente=? ");

            instrucaoSQL.setString(1, pCliente.getNome());
            instrucaoSQL.setString(2, pCliente.getCPFSomenteNumeros());
           instrucaoSQL.setDate(3, new java.sql.Date(pCliente.getData_Nascimento().getTime()));
            instrucaoSQL.setString(4, pCliente.getSexo());
            instrucaoSQL.setString(5, pCliente.getEstado_civil());
            instrucaoSQL.setString(6, pCliente.getRua());
            instrucaoSQL.setString(7, pCliente.getCidade());
            instrucaoSQL.setString(8, pCliente.getEstado());
            instrucaoSQL.setString(9, pCliente.getCep());
            instrucaoSQL.setString(10, pCliente.getTelefone());
            instrucaoSQL.setString(11, pCliente.getCelular());
            instrucaoSQL.setString(12, pCliente.getEmail());

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

    public static boolean excluir(int pID) {
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            String URL = "jdbc:mysql://localhost:3306/projetoPi?useTimezone=true&serverTimezone=UTC&useSSL=false";

            conexao = DriverManager.getConnection(URL, "root", "root");

            instrucaoSQL = conexao.prepareStatement("DELETE FROM Clientes WHERE idCliente = ?");

           
            instrucaoSQL.setInt(1, pID);

            
            int linhasAfetadas = instrucaoSQL.executeUpdate();

            if (linhasAfetadas > 0) {
                retorno = true;
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

                //GerenciadorConexao.fecharConexao();
                conexao.close();

            } catch (SQLException ex) {
            }
        }

        return retorno;
    }

    public static ArrayList<Cliente> consultarClientes(String pCliente) {
        ResultSet rs = null;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();

        try {

            conexao = GerenciadorConexao.abrirConexao();
            instrucaoSQL = conexao.prepareStatement("SELECT * FROM Clientes WHERE idCliente LIKE ?;");

            //Adiciono os parâmetros ao meu comando SQL
            instrucaoSQL.setString(1, "%" + pCliente + '%');

            rs = instrucaoSQL.executeQuery();

            while (rs.next()) {
                Cliente client = new Cliente();
                client.setId(rs.getInt("idCliente"));
                client.setNome(rs.getString("nome"));
                client.setCPF(rs.getString("CPF"));

                listaClientes.add(client);
            }

        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            listaClientes = null;
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

        return listaClientes;
    }
}
