/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import Model.Cliente;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import utils.GerenciadorConexao;
/**
 *
 * @author fernando.fernandes
 */
public class clienteDAO {
    
    
    public static boolean salvar(Cliente p)
    {
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;
                
        try {
            
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            
            String URL = "jdbc:mysql://localhost:3306/clientes?useTimezone=true&serverTimezone=UTC&useSSL=false";
            
            conexao = DriverManager.getConnection(URL, "root", "root");
            
            instrucaoSQL = conexao.prepareStatement("INSERT INTO clientes (nome,cpf, dataDeNascimento, estadoCivil, sexo, cttTelefone, cttCelular, email, endereço, Nendereço  ) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)"
                                                    , Statement.RETURN_GENERATED_KEYS);
            
           
            //instrucaoSQL.setString(1, p.getNome());
            //instrucaoSQL.setString(2, p.getCPFSomenteNumeros());
            
            
            int linhasAfetadas = instrucaoSQL.executeUpdate();
            
            if(linhasAfetadas>0)
            {
                retorno = true;
                
                ResultSet generatedKeys = instrucaoSQL.getGeneratedKeys(); 
                if (generatedKeys.next()) {
                        p.setId(generatedKeys.getInt(1));
                }
                else {
                    throw new SQLException("Falha ao obter o ID do cliente.");
                }
            }
            else{
                retorno = false;
            }
            
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            retorno = false;
        } finally{
            
         
            try {
                if(instrucaoSQL!=null)
                    instrucaoSQL.close();
                
                GerenciadorConexao.fecharConexao();
                conexao.close();
                
              } catch (SQLException ex) {
             }
        }
        
        return retorno;
    }
    
    public static boolean atualizar(Cliente p)
    {
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;
                
        try {
            
            
            conexao = GerenciadorConexao.abrirConexao();
            
          
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            
            String URL = "jdbc:mysql://localhost:3306/lojamvc?useTimezone=true&serverTimezone=UTC&useSSL=false";
            
            conexao = DriverManager.getConnection(URL, "root", "roor");
            
            instrucaoSQL = conexao.prepareStatement("UPDATE cliente SET nome = ?, CPF=? WHERE idCliente =? ");
            
            
            //instrucaoSQL.setString(1, p.getNome());
            //instrucaoSQL.setString(2, p.getCPFSomenteNumeros());
            instrucaoSQL.setInt(3, p.getId());
            
            
            int linhasAfetadas = instrucaoSQL.executeUpdate();
            
            if(linhasAfetadas>0)
            {
                retorno = true;
            }
            else{
                retorno = false;
            }
            
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            retorno = false;
        } finally{
            
            
            try {
                if(instrucaoSQL!=null)
                    instrucaoSQL.close();
                
                GerenciadorConexao.fecharConexao();
                conexao.close();
                
              } catch (SQLException ex) {
             }
        }
        
        return retorno;
    }
    
    public static boolean excluir(int pID)
    {
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;
                
        try {
            
            
            conexao = GerenciadorConexao.abrirConexao();
            
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            
            String URL = "jdbc:mysql://localhost:3306/lojamvc?useTimezone=true&serverTimezone=UTC&useSSL=false";
            
            conexao = DriverManager.getConnection(URL, "root", "root");
            
            instrucaoSQL = conexao.prepareStatement("DELETE FROM cliente WHERE idCliente = ?");
            
            
            instrucaoSQL.setInt(1, pID);

            
            int linhasAfetadas = instrucaoSQL.executeUpdate();
            
            if(linhasAfetadas>0)
            {
                retorno = true;
            }
            else{
                retorno = false;
            }
            
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            retorno = false;
        } finally{
            
            
            try {
                if(instrucaoSQL!=null)
                    instrucaoSQL.close();
                
                GerenciadorConexao.fecharConexao();
                conexao.close();
                
              } catch (SQLException ex) {
             }
        }
        
        return retorno;
    }
    
    public static ArrayList<Cliente> consultarClientes()
    {
        ResultSet rs = null;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null; 
        
      
        ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
        
        try {
            
            conexao = GerenciadorConexao.abrirConexao();
          
            Class.forName("com.mysql.cj.jdbc.Driver");
            
           
            String URL = "jdbc:mysql://localhost:3306/lojamvc?useTimezone=true&serverTimezone=UTC&useSSL=false";
            
            conexao = DriverManager.getConnection(URL, "root", "root");
            
            
            instrucaoSQL = conexao.prepareStatement("SELECT * FROM cliente;");

            
            rs = instrucaoSQL.executeQuery();
            
            
            while(rs.next())
            {
                Cliente c = new Cliente();
                c.setId(rs.getInt("idcliente"));
               // c.setNome(rs.getString("nome"));
                //c.setCPF(rs.getString("CPF"));
                
                //Adiciono na listaClientes
                listaClientes.add(c);
            }
            
        }catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            listaClientes = null;
        } finally{
            
            try {
                if(rs!=null)
                    rs.close();                
                if(instrucaoSQL!=null)
                    instrucaoSQL.close();
                
                conexao.close();
                GerenciadorConexao.fecharConexao();
                        
              } catch (SQLException ex) {
             }
        }
        
        return listaClientes;
    }
    
    public static ArrayList<Cliente> consultarClientes(String pNome)
    {
        ResultSet rs = null;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null; 
        
        ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
        
        try {
            
            conexao = GerenciadorConexao.abrirConexao();
            instrucaoSQL = conexao.prepareStatement("SELECT * FROM cliente WHERE nome LIKE ?;");
            
            
            instrucaoSQL.setString(1,"%" + pNome + '%' );

            rs = instrucaoSQL.executeQuery();
            
            while(rs.next())
            {
                Cliente c = new Cliente();
                c.setId(rs.getInt("idcliente"));
                //c.setNome(rs.getString("nome"));
                //c.setCPF(rs.getString("CPF"));
                listaClientes.add(c);
            }
            
        }catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            listaClientes = null;
        } finally{
            
            try {
                if(rs!=null)
                    rs.close();                
                if(instrucaoSQL!=null)
                    instrucaoSQL.close();
                
                GerenciadorConexao.fecharConexao();
                        
              } catch (SQLException ex) {
             }
        }
        
        return listaClientes;
    }
    
}
