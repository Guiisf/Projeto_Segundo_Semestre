package DAO;

import Model.NotaFiscal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import utils.GerenciadorConexao;

public class notaFiscalDAO {

    public static boolean Salvar(NotaFiscal pNotaFiscal) {
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        try {

            conexao = GerenciadorConexao.abrirConexao();

            instrucaoSQL = conexao.prepareStatement("INSERT INTO NotaFiscal (numeroNota,ValorNota,DataEmissao,DataEntrada) VALUES(?,?,?,?)",
                     Statement.RETURN_GENERATED_KEYS);

            instrucaoSQL.setInt(1, pNotaFiscal.getNumeroNota());
            instrucaoSQL.setDouble(2, pNotaFiscal.getValorNota());
            instrucaoSQL.setDate(3, new java.sql.Date(pNotaFiscal.getDataEmissao().getTime()));
            instrucaoSQL.setDate(4, new java.sql.Date(pNotaFiscal.getDataEntrada().getTime()));

            int linhasAfetadas = instrucaoSQL.executeUpdate();

            if (linhasAfetadas > 0) {
                retorno = true;

                ResultSet generatedKeys = instrucaoSQL.getGeneratedKeys();
                if (generatedKeys.next()) {
                    pNotaFiscal.setIdNota(generatedKeys.getInt(1));
                } else {
                    throw new SQLException("Falha ao obter o ID da Nota Fiscal!.");
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

}
